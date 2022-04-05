package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkOrderActivitiesParametrizedInput implements GraphQLParametrizedInput {

    private ActivityFilterInputTO filter;

    public WorkOrderActivitiesParametrizedInput() {
    }

    public WorkOrderActivitiesParametrizedInput(ActivityFilterInputTO filter) {
        this.filter = filter;
    }

    public WorkOrderActivitiesParametrizedInput filter(ActivityFilterInputTO filter) {
        this.filter = filter;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (filter != null) {
            joiner.add("filter: " + GraphQLRequestSerializer.getEntry(filter));
        }
        return joiner.toString();
    }

}
