package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LatestPythonPackageResultResponseProjection extends GraphQLResponseProjection {

    public LatestPythonPackageResultResponseProjection() {
    }

    public LatestPythonPackageResultResponseProjection lastPythonPackage(PythonPackageResponseProjection subProjection) {
        return lastPythonPackage(null, subProjection);
    }

    public LatestPythonPackageResultResponseProjection lastPythonPackage(String alias, PythonPackageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("lastPythonPackage").alias(alias).projection(subProjection));
        return this;
    }

    public LatestPythonPackageResultResponseProjection lastBreakingPythonPackage(PythonPackageResponseProjection subProjection) {
        return lastBreakingPythonPackage(null, subProjection);
    }

    public LatestPythonPackageResultResponseProjection lastBreakingPythonPackage(String alias, PythonPackageResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("lastBreakingPythonPackage").alias(alias).projection(subProjection));
        return this;
    }


}
