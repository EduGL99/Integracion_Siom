package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserQueryRequest implements GraphQLOperationRequest {

    private static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.QUERY;
    private static final String OPERATION_NAME = "user";

    private final Map<String, Object> input = new LinkedHashMap<>();

    public UserQueryRequest() {
    }

    public void setAuthID(String authID) {
        this.input.put("authID", authID);
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

        private String authID;

        public Builder() {
        }

        public Builder setAuthID(String authID) {
            this.authID = authID;
            return this;
        }


        public UserQueryRequest build() {
            UserQueryRequest obj = new UserQueryRequest();
            obj.setAuthID(authID);
            return obj;
        }

    }
}
