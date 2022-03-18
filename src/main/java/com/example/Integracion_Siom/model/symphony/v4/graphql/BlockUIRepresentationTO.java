package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlockUIRepresentationTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private Integer xPosition;
    @javax.validation.constraints.NotNull
    private Integer yPosition;

    public BlockUIRepresentationTO() {
    }

    public BlockUIRepresentationTO(String name, Integer xPosition, Integer yPosition) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getXPosition() {
        return xPosition;
    }

    public void setXPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    public Integer getYPosition() {
        return yPosition;
    }

    public void setYPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (xPosition != null) {
            joiner.add("xPosition: " + GraphQLRequestSerializer.getEntry(xPosition));
        }
        if (yPosition != null) {
            joiner.add("yPosition: " + GraphQLRequestSerializer.getEntry(yPosition));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String name;
        private Integer xPosition;
        private Integer yPosition;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setXPosition(Integer xPosition) {
            this.xPosition = xPosition;
            return this;
        }

        public Builder setYPosition(Integer yPosition) {
            this.yPosition = yPosition;
            return this;
        }


        public BlockUIRepresentationTO build() {
            return new BlockUIRepresentationTO(name, xPosition, yPosition);
        }

    }
}
