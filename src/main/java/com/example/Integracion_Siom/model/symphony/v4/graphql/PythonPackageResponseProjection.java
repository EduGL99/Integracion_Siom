package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PythonPackageResponseProjection extends GraphQLResponseProjection {

    public PythonPackageResponseProjection() {
    }

    public PythonPackageResponseProjection version() {
        return version(null);
    }

    public PythonPackageResponseProjection version(String alias) {
        fields.add(new GraphQLResponseField("version").alias(alias));
        return this;
    }

    public PythonPackageResponseProjection whlFileKey() {
        return whlFileKey(null);
    }

    public PythonPackageResponseProjection whlFileKey(String alias) {
        fields.add(new GraphQLResponseField("whlFileKey").alias(alias));
        return this;
    }

    public PythonPackageResponseProjection uploadTime() {
        return uploadTime(null);
    }

    public PythonPackageResponseProjection uploadTime(String alias) {
        fields.add(new GraphQLResponseField("uploadTime").alias(alias));
        return this;
    }

    public PythonPackageResponseProjection hasBreakingChange() {
        return hasBreakingChange(null);
    }

    public PythonPackageResponseProjection hasBreakingChange(String alias) {
        fields.add(new GraphQLResponseField("hasBreakingChange").alias(alias));
        return this;
    }


}
