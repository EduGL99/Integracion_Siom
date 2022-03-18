package com.example.Integracion_Siom.service.impl;

import com.example.Integracion_Siom.configuration.YMLConfig;
import com.example.Integracion_Siom.model.symphony.v6.graphql.*;
import com.example.Integracion_Siom.service.inter.SimphonyInterface;
import com.example.Integracion_Siom.service.inter.SimphonyUserInterface;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
@Service
public class SymphonyService2 implements SimphonyUserInterface {

    @Autowired
    YMLConfig ymlConfig;

    @Autowired
    RestTemplate restTemplate;

    protected ObjectMapper json = new ObjectMapper();

    protected HttpEntity<String> httpEntity(GraphQLRequest request) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBasicAuth(ymlConfig.getAuthUser(), ymlConfig.getAuthPasswd());
        headers.set("Host", "symphony");
        return new HttpEntity<>(request.toHttpJsonBody(), headers);
    }

    protected List<PropertyInputTO> mapProperties(List<PropertyTO> properties) {
        List<PropertyInputTO> props = new ArrayList<>();
        if (properties != null) {
            properties.forEach(p -> {
                PropertyInputTO propertyInputTO = new PropertyInputTO();
                propertyInputTO.setPropertyTypeID(p.getPropertyType().getId());
                switch (p.getPropertyType().getType().toString().toLowerCase()) {
                    case "int":
                        propertyInputTO.setIntValue(p.getIntValue());
                        break;
                    case "float":
                        propertyInputTO.setFloatValue(p.getFloatValue());
                        break;
                    case "bool":
                        propertyInputTO.setBooleanValue(p.getBooleanValue());
                        break;
                    case "node":
                        propertyInputTO.setNodeIDValue(p.getNodeValue().getId());
                        break;
                    default:
                        propertyInputTO.setStringValue(p.getStringValue());
                }
                props.add(propertyInputTO);
            });
        }
        return props;
    }

    protected List<CheckListCategoryInputTO> mapCheckList(List<CheckListCategoryTO> checks) {
        List<CheckListCategoryInputTO> checkList = new ArrayList<>();
        if (checks != null && checks.size() > 0) {
            checks.forEach(c -> {
                CheckListCategoryInputTO check = new CheckListCategoryInputTO();
                check.setId(c.getId());
                check.setTitle(c.getTitle());
                check.setDescription(c.getDescription());
                if (c.getCheckList() != null && c.getCheckList().size() > 0) {
                    List<CheckListItemInputTO> checkListItemInputTOList = new ArrayList<>();
                    c.getCheckList().forEach(cl -> {
                        CheckListItemInputTO checkListItemInputTO = new CheckListItemInputTO();
                        checkListItemInputTO.setId(cl.getId());
                        checkListItemInputTO.setTitle(cl.getTitle());
                        checkListItemInputTO.setHelpText(cl.getHelpText());
                        checkListItemInputTO.setType(cl.getType());
                        switch (cl.getType().toString().toLowerCase()) {
                            case "simple":
                                checkListItemInputTO.setChecked(cl.getChecked());
                                break;
                            case "enum":
                                checkListItemInputTO.setEnumValues(cl.getEnumValues());
                                checkListItemInputTO.setEnumSelectionMode(cl.getEnumSelectionMode());
                                checkListItemInputTO.setSelectedEnumValues(cl.getSelectedEnumValues());
                                break;
                            case "string":
                                checkListItemInputTO.setStringValue(cl.getStringValue());
                                break;
                            case "yes_no":
                                checkListItemInputTO.setYesNoResponse(cl.getYesNoResponse());
                                break;
                            case "files":
                                // TODO - make support for add files
                                break;
                        }
                        checkListItemInputTOList.add(checkListItemInputTO);
                    });
                    check.setCheckList(checkListItemInputTOList);
                }
                checkList.add(check);
            });
        }
        return checkList;
    }

    protected GraphQLResponseProjection dataUser() {
        return new UserResponseProjection()
                .id().name().status().groups(new UsersGroupResponseProjection().id().name());
    }

    protected GraphQLResponseProjection dataWorOrderType() {
        return new WorkOrderTypeConnectionResponseProjection().edges(new WorkOrderTypeEdgeResponseProjection()
                .node(new WorkOrderTypeResponseProjection().id().name().description()
                        .propertyTypes(new PropertyTypeResponseProjection().id().name().isMandatory().type()
                                .stringValue().booleanValue().floatValue().intValue().nodeType().isEditable().isDeleted())
                        .checkListCategoryDefinitions(new CheckListCategoryDefinitionResponseProjection()
                                .id().title().description()
                                .checklistItemDefinitions(new CheckListItemDefinitionResponseProjection()
                                        .id().title().type().isMandatory().enumValues().enumSelectionMode()))));
    }

    protected GraphQLResponseProjection dataProject() {
        return new ProjectResponseProjection()
                .id().name().description().priority()
                .type(new ProjectTypeResponseProjection().id().name())
                .comments(new CommentResponseProjection().id().text().createTime()
                        .author(new UserResponseProjection().id().name()))
                .properties(new PropertyResponseProjection().id().stringValue().intValue().floatValue().booleanValue()
                        .nodeValue(new NamedNodeResponseProjection().id().name())
                        .propertyType(new PropertyTypeResponseProjection().id().name().type().nodeType()))
                .createdBy(new UserResponseProjection().id().name().email().role())
                .location(new LocationResponseProjection().id().name()
                        .locationType(new LocationTypeResponseProjection().id().name()))
                .workOrders(new WorkOrderResponseProjection().id().name()
                        .workOrderType(new WorkOrderTypeResponseProjection().id().name()));
    }

    protected GraphQLResponseProjection dataProjectType() {
        return new ProjectTypeConnectionResponseProjection().edges(new ProjectTypeEdgeResponseProjection()
                .node(new ProjectTypeResponseProjection().id().name().description()
                        .properties(new PropertyTypeResponseProjection().id().name().isMandatory().type()
                                .stringValue().booleanValue().floatValue().intValue().nodeType().isEditable()
                                .isDeleted())
                        .workOrders(new WorkOrderDefinitionResponseProjection().id()
                                .type(new WorkOrderTypeResponseProjection().id().name()))));
    }

    protected HyperlinkTO addHyperlink(AddHyperlinkInputTO hyperlink) {
        HyperlinkTO response = null;
        AddHyperlinkMutationRequest addHyperlinkMutationRequest = new AddHyperlinkMutationRequest();
        addHyperlinkMutationRequest.setInput(hyperlink);
        HyperlinkResponseProjection hyperlinkResponseProjection = new HyperlinkResponseProjection()
                .id().url().displayName().createTime();
        GraphQLRequest graphQLRequest = new GraphQLRequest(addHyperlinkMutationRequest, hyperlinkResponseProjection);
        AddHyperlinkMutationResponse result = restTemplate.exchange(
                URI.create(ymlConfig.getUrlFacebookGraphQL()),
                HttpMethod.POST,
                httpEntity(graphQLRequest),
                new ParameterizedTypeReference<AddHyperlinkMutationResponse>() {
                }
        ).getBody();
        if (result != null) {
            if (result.hasErrors()) {
                result.getErrors().forEach(e -> log.error("*** Error adding hyperlink: " + e.getMessage()));
                throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
                        result.getErrors().get(0).getMessage());
            }
            response = result.addHyperlink();
        }
        return response;
    }

    protected CommentTO addComment(CommentInputTO comment) {
        CommentTO response = null;
        AddCommentMutationRequest addCommentMutationRequest = new AddCommentMutationRequest();
        addCommentMutationRequest.setInput(comment);
        CommentResponseProjection commentResponseProjection = new CommentResponseProjection()
                .id().author(new UserResponseProjection().email()).text().createTime();
        GraphQLRequest graphQLRequest = new GraphQLRequest(addCommentMutationRequest, commentResponseProjection);
        AddCommentMutationResponse result = restTemplate.exchange(
                URI.create(ymlConfig.getUrlFacebookGraphQL()),
                HttpMethod.POST,
                httpEntity(graphQLRequest),
                new ParameterizedTypeReference<AddCommentMutationResponse>() {
                }
        ).getBody();
        if (result != null) {
            if (result.hasErrors()) {
                result.getErrors().forEach(e -> log.error("*** Error adding comment: " + e.getMessage()));
                throw new HttpClientErrorException(HttpStatus.INTERNAL_SERVER_ERROR,
                        result.getErrors().get(0).getMessage());
            }
            response = result.addComment();
        }
        return response;
    }

    @Override
    public UserTO get(String id) throws HttpClientErrorException, HttpServerErrorException, ResourceAccessException, JsonProcessingException {
        return null;
    }
}
