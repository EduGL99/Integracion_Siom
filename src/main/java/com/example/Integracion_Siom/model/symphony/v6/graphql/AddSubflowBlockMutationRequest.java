package com.example.Integracion_Siom.model.symphony.v6.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest;

import java.util.*;


public class AddSubflowBlockMutationRequest implements GraphQLOperationRequest {

    public static final String OPERATION_NAME = "addSubflowBlock";
    public static final GraphQLOperation OPERATION_TYPE = GraphQLOperation.MUTATION;
    private final Map<String, Object> input = new LinkedHashMap<>();
    private final Set<String> useObjectMapperForInputSerialization = new HashSet<>();
    private String alias;

    public AddSubflowBlockMutationRequest() {
    }

    public AddSubflowBlockMutationRequest(String alias) {
        this.alias = alias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void setFlowDraftId(String flowDraftId) {
        this.input.put("flowDraftId", flowDraftId);
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

    public void setInput(SubflowBlockInputTO input) {
        this.input.put("input", input);
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
        private String flowDraftId;
        private SubflowBlockInputTO input;

        public Builder() {
        }

        public Builder alias(String alias) {
            this.$alias = alias;
            return this;
        }

        public Builder setFlowDraftId(String flowDraftId) {
            this.flowDraftId = flowDraftId;
            return this;
        }

        public Builder setInput(SubflowBlockInputTO input) {
            this.input = input;
            return this;
        }


        public AddSubflowBlockMutationRequest build() {
            AddSubflowBlockMutationRequest obj = new AddSubflowBlockMutationRequest($alias);
            obj.setFlowDraftId(flowDraftId);
            obj.setInput(input);
            return obj;
        }

    }
}