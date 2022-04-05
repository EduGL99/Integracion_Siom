package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentSearchResultTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<EquipmentTO> equipment;
    @javax.validation.constraints.NotNull
    private Integer count;

    public EquipmentSearchResultTO() {
    }

    public EquipmentSearchResultTO(java.util.List<EquipmentTO> equipment, Integer count) {
        this.equipment = equipment;
        this.count = count;
    }

    public java.util.List<EquipmentTO> getEquipment() {
        return equipment;
    }

    public void setEquipment(java.util.List<EquipmentTO> equipment) {
        this.equipment = equipment;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (equipment != null) {
            joiner.add("equipment: " + GraphQLRequestSerializer.getEntry(equipment));
        }
        if (count != null) {
            joiner.add("count: " + GraphQLRequestSerializer.getEntry(count));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private java.util.List<EquipmentTO> equipment;
        private Integer count;

        public Builder() {
        }

        public Builder setEquipment(java.util.List<EquipmentTO> equipment) {
            this.equipment = equipment;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }


        public EquipmentSearchResultTO build() {
            return new EquipmentSearchResultTO(equipment, count);
        }

    }
}
