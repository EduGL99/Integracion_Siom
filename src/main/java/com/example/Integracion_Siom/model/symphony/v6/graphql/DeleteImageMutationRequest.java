package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;


public class DeleteImageMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "deleteImage";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();
    private String alias;

    public DeleteImageMutationRequest() {
    }

    public DeleteImageMutationRequest(String alias) {
        this.alias = alias;
    }

    public static Builder builder() {
        return new Builder();
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
        return alias != null ? alias : OPERATION_NAME;
    }

    @Override
    public Map<String, Object> getInput() {
        return input;
    }

    @Override
    public Set<String> getUseObjectMapperForInputSerialization() {
        return useObjectMapperForInputSerialization;
    }

    @Override
    public String toString() {
        return Objects.toString(input);
    }

    public static class Builder {

        private String $alias;
        private ImageEntityTO entityType;
        private String entityId;
        private String id;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
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
            DeleteImageMutationRequest obj = new DeleteImageMutationRequest($alias);
            obj.setEntityType(entityType);
            obj.setEntityId(entityId);
            obj.setId(id);
            return obj;
        }

    }
}
