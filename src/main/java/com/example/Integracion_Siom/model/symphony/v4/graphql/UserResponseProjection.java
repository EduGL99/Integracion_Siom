package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponseProjection extends GraphQLResponseProjection {

    public UserResponseProjection() {
    }

    public UserResponseProjection id() {
        return id(null);
    }

    public UserResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UserResponseProjection authID() {
        return authID(null);
    }

    public UserResponseProjection authID(String alias) {
        fields.add(new GraphQLResponseField("authID").alias(alias));
        return this;
    }

    public UserResponseProjection firstName() {
        return firstName(null);
    }

    public UserResponseProjection firstName(String alias) {
        fields.add(new GraphQLResponseField("firstName").alias(alias));
        return this;
    }

    public UserResponseProjection lastName() {
        return lastName(null);
    }

    public UserResponseProjection lastName(String alias) {
        fields.add(new GraphQLResponseField("lastName").alias(alias));
        return this;
    }

    public UserResponseProjection name() {
        return name(null);
    }

    public UserResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public UserResponseProjection email() {
        return email(null);
    }

    public UserResponseProjection email(String alias) {
        fields.add(new GraphQLResponseField("email").alias(alias));
        return this;
    }

    public UserResponseProjection status() {
        return status(null);
    }

    public UserResponseProjection status(String alias) {
        fields.add(new GraphQLResponseField("status").alias(alias));
        return this;
    }

    public UserResponseProjection role() {
        return role(null);
    }

    public UserResponseProjection role(String alias) {
        fields.add(new GraphQLResponseField("role").alias(alias));
        return this;
    }

    public UserResponseProjection profilePhoto(FileResponseProjection subProjection) {
        return profilePhoto(null, subProjection);
    }

    public UserResponseProjection profilePhoto(String alias, FileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("profilePhoto").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection groups(UsersGroupResponseProjection subProjection) {
        return groups(null, subProjection);
    }

    public UserResponseProjection groups(String alias, UsersGroupResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("groups").alias(alias).projection(subProjection));
        return this;
    }

    public UserResponseProjection distanceUnit() {
        return distanceUnit(null);
    }

    public UserResponseProjection distanceUnit(String alias) {
        fields.add(new GraphQLResponseField("distanceUnit").alias(alias));
        return this;
    }


}
