package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReportFilterResponseProjection extends GraphQLResponseProjection {

    public ReportFilterResponseProjection() {
    }

    public ReportFilterResponseProjection id() {
        return id(null);
    }

    public ReportFilterResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ReportFilterResponseProjection name() {
        return name(null);
    }

    public ReportFilterResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ReportFilterResponseProjection entity() {
        return entity(null);
    }

    public ReportFilterResponseProjection entity(String alias) {
        fields.add(new GraphQLResponseField("entity").alias(alias));
        return this;
    }

    public ReportFilterResponseProjection filters(GeneralFilterResponseProjection subProjection) {
        return filters(null, subProjection);
    }

    public ReportFilterResponseProjection filters(String alias, GeneralFilterResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("filters").alias(alias).projection(subProjection));
        return this;
    }


}
