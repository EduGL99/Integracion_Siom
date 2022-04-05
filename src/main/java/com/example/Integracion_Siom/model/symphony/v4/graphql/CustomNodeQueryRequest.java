package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.example.Integracion_Siom.configuration.graphql.CustomGraphQLOperationRequest;
import com.example.Integracion_Siom.model.symphony.FragmentNode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomNodeQueryRequest implements CustomGraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "node";

    private String alias;
    private final Map<String, Object> input = new LinkedHashMap<>();

    private FragmentNode inlineFragment = null;

    public CustomNodeQueryRequest() {
    }

    public CustomNodeQueryRequest(String alias) {
        this.alias = alias;
    }

    public void setId(String id) {
        this.input.put("id", id);
    }

    public void setInlineFragment(FragmentNode fragment) {
        this.inlineFragment = fragment;
    }

    public FragmentNode getInlineFragment() {
        return this.inlineFragment;
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
        return alias != null ? alias : OPERATION_NAME;
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

        private String $alias;
        private String id;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }


        public CustomNodeQueryRequest build() {
            CustomNodeQueryRequest obj = new CustomNodeQueryRequest($alias);
            obj.setId(id);
            return obj;
        }

    }
}
