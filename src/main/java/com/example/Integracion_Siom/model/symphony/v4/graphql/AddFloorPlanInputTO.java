package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddFloorPlanInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    @javax.validation.constraints.NotNull
    private String locationID;
    @javax.validation.constraints.NotNull
    private AddImageInputTO image;
    @javax.validation.constraints.NotNull
    private Integer referenceX;
    @javax.validation.constraints.NotNull
    private Integer referenceY;
    @javax.validation.constraints.NotNull
    private Double latitude;
    @javax.validation.constraints.NotNull
    private Double longitude;
    @javax.validation.constraints.NotNull
    private Integer referencePoint1X;
    @javax.validation.constraints.NotNull
    private Integer referencePoint1Y;
    @javax.validation.constraints.NotNull
    private Integer referencePoint2X;
    @javax.validation.constraints.NotNull
    private Integer referencePoint2Y;
    @javax.validation.constraints.NotNull
    private Double scaleInMeters;

    public AddFloorPlanInputTO() {
    }

    public AddFloorPlanInputTO(String name, String locationID, AddImageInputTO image, Integer referenceX, Integer referenceY, Double latitude, Double longitude, Integer referencePoint1X, Integer referencePoint1Y, Integer referencePoint2X, Integer referencePoint2Y, Double scaleInMeters) {
        this.name = name;
        this.locationID = locationID;
        this.image = image;
        this.referenceX = referenceX;
        this.referenceY = referenceY;
        this.latitude = latitude;
        this.longitude = longitude;
        this.referencePoint1X = referencePoint1X;
        this.referencePoint1Y = referencePoint1Y;
        this.referencePoint2X = referencePoint2X;
        this.referencePoint2Y = referencePoint2Y;
        this.scaleInMeters = scaleInMeters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public AddImageInputTO getImage() {
        return image;
    }

    public void setImage(AddImageInputTO image) {
        this.image = image;
    }

    public Integer getReferenceX() {
        return referenceX;
    }

    public void setReferenceX(Integer referenceX) {
        this.referenceX = referenceX;
    }

    public Integer getReferenceY() {
        return referenceY;
    }

    public void setReferenceY(Integer referenceY) {
        this.referenceY = referenceY;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getReferencePoint1X() {
        return referencePoint1X;
    }

    public void setReferencePoint1X(Integer referencePoint1X) {
        this.referencePoint1X = referencePoint1X;
    }

    public Integer getReferencePoint1Y() {
        return referencePoint1Y;
    }

    public void setReferencePoint1Y(Integer referencePoint1Y) {
        this.referencePoint1Y = referencePoint1Y;
    }

    public Integer getReferencePoint2X() {
        return referencePoint2X;
    }

    public void setReferencePoint2X(Integer referencePoint2X) {
        this.referencePoint2X = referencePoint2X;
    }

    public Integer getReferencePoint2Y() {
        return referencePoint2Y;
    }

    public void setReferencePoint2Y(Integer referencePoint2Y) {
        this.referencePoint2Y = referencePoint2Y;
    }

    public Double getScaleInMeters() {
        return scaleInMeters;
    }

    public void setScaleInMeters(Double scaleInMeters) {
        this.scaleInMeters = scaleInMeters;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (locationID != null) {
            joiner.add("locationID: " + GraphQLRequestSerializer.getEntry(locationID));
        }
        if (image != null) {
            joiner.add("image: " + GraphQLRequestSerializer.getEntry(image));
        }
        if (referenceX != null) {
            joiner.add("referenceX: " + GraphQLRequestSerializer.getEntry(referenceX));
        }
        if (referenceY != null) {
            joiner.add("referenceY: " + GraphQLRequestSerializer.getEntry(referenceY));
        }
        if (latitude != null) {
            joiner.add("latitude: " + GraphQLRequestSerializer.getEntry(latitude));
        }
        if (longitude != null) {
            joiner.add("longitude: " + GraphQLRequestSerializer.getEntry(longitude));
        }
        if (referencePoint1X != null) {
            joiner.add("referencePoint1X: " + GraphQLRequestSerializer.getEntry(referencePoint1X));
        }
        if (referencePoint1Y != null) {
            joiner.add("referencePoint1Y: " + GraphQLRequestSerializer.getEntry(referencePoint1Y));
        }
        if (referencePoint2X != null) {
            joiner.add("referencePoint2X: " + GraphQLRequestSerializer.getEntry(referencePoint2X));
        }
        if (referencePoint2Y != null) {
            joiner.add("referencePoint2Y: " + GraphQLRequestSerializer.getEntry(referencePoint2Y));
        }
        if (scaleInMeters != null) {
            joiner.add("scaleInMeters: " + GraphQLRequestSerializer.getEntry(scaleInMeters));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String name;
        private String locationID;
        private AddImageInputTO image;
        private Integer referenceX;
        private Integer referenceY;
        private Double latitude;
        private Double longitude;
        private Integer referencePoint1X;
        private Integer referencePoint1Y;
        private Integer referencePoint2X;
        private Integer referencePoint2Y;
        private Double scaleInMeters;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLocationID(String locationID) {
            this.locationID = locationID;
            return this;
        }

        public Builder setImage(AddImageInputTO image) {
            this.image = image;
            return this;
        }

        public Builder setReferenceX(Integer referenceX) {
            this.referenceX = referenceX;
            return this;
        }

        public Builder setReferenceY(Integer referenceY) {
            this.referenceY = referenceY;
            return this;
        }

        public Builder setLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder setReferencePoint1X(Integer referencePoint1X) {
            this.referencePoint1X = referencePoint1X;
            return this;
        }

        public Builder setReferencePoint1Y(Integer referencePoint1Y) {
            this.referencePoint1Y = referencePoint1Y;
            return this;
        }

        public Builder setReferencePoint2X(Integer referencePoint2X) {
            this.referencePoint2X = referencePoint2X;
            return this;
        }

        public Builder setReferencePoint2Y(Integer referencePoint2Y) {
            this.referencePoint2Y = referencePoint2Y;
            return this;
        }

        public Builder setScaleInMeters(Double scaleInMeters) {
            this.scaleInMeters = scaleInMeters;
            return this;
        }


        public AddFloorPlanInputTO build() {
            return new AddFloorPlanInputTO(name, locationID, image, referenceX, referenceY, latitude, longitude, referencePoint1X, referencePoint1Y, referencePoint2X, referencePoint2Y, scaleInMeters);
        }

    }
}
