package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteImageMutationRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private static final String OPERATION_NAME = "deleteImage";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public DeleteImageMutationRequest() {
    }

    public void setEntityType(ImageEntityTO entityType) {
        this.input.put("entityType", entityType);
    }

    public void setEntityId(String entityId) {
        this.input.put("entityId", entityId);
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    @Override
    public GraphQLOperation getOperationType() {
        return OPERATION_TYPE;
    }

    @Override
    public String getOperationName() {
        return OPERATION_NAME;
    }

    @Override
    public String getAlias() {
        return null;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private ImageEntityTO entityType;
        private String entityId;
        private String id;

        public Builder() {
        }

        public Builder setEntityType(ImageEntityTO entityType) {
            this.entityType = entityType;
            return this;
        }

        public Builder setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }


        public DeleteImageMutationRequest build() {
            DeleteImageMutationRequest obj = new DeleteImageMutationRequest();
            obj.setEntityType(entityType);
            obj.setEntityId(entityId);
            obj.setId(id);
            return obj;
        }

    }
}
