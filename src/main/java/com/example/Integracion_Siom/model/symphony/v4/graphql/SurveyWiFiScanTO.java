package com.example.Integracion_Siom.model.symphony.v4.graphql;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import java.util.StringJoiner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurveyWiFiScanTO implements java.io.Serializable, NodeTO {

    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private Integer timestamp;
    @javax.validation.constraints.NotNull
    private Integer frequency;
    @javax.validation.constraints.NotNull
    private Integer channel;
    @javax.validation.constraints.NotNull
    private String bssid;
    @javax.validation.constraints.NotNull
    private Integer strength;
    private String ssid;
    private String band;
    private Integer channelWidth;
    private String capabilities;
    private Double latitude;
    private Double longitude;
    private Double altitude;
    private Double heading;
    private Double rssi;

    public SurveyWiFiScanTO() {
    }

    public SurveyWiFiScanTO(String id, Integer timestamp, Integer frequency, Integer channel, String bssid, Integer strength, String ssid, String band, Integer channelWidth, String capabilities, Double latitude, Double longitude, Double altitude, Double heading, Double rssi) {
        this.id = id;
        this.timestamp = timestamp;
        this.frequency = frequency;
        this.channel = channel;
        this.bssid = bssid;
        this.strength = strength;
        this.ssid = ssid;
        this.band = band;
        this.channelWidth = channelWidth;
        this.capabilities = capabilities;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.heading = heading;
        this.rssi = rssi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public String getBssid() {
        return bssid;
    }

    public void setBssid(String bssid) {
        this.bssid = bssid;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public Integer getChannelWidth() {
        return channelWidth;
    }

    public void setChannelWidth(Integer channelWidth) {
        this.channelWidth = channelWidth;
    }

    public String getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(String capabilities) {
        this.capabilities = capabilities;
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

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public Double getHeading() {
        return heading;
    }

    public void setHeading(Double heading) {
        this.heading = heading;
    }

    public Double getRssi() {
        return rssi;
    }

    public void setRssi(Double rssi) {
        this.rssi = rssi;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (timestamp != null) {
            joiner.add("timestamp: " + GraphQLRequestSerializer.getEntry(timestamp));
        }
        if (frequency != null) {
            joiner.add("frequency: " + GraphQLRequestSerializer.getEntry(frequency));
        }
        if (channel != null) {
            joiner.add("channel: " + GraphQLRequestSerializer.getEntry(channel));
        }
        if (bssid != null) {
            joiner.add("bssid: " + GraphQLRequestSerializer.getEntry(bssid));
        }
        if (strength != null) {
            joiner.add("strength: " + GraphQLRequestSerializer.getEntry(strength));
        }
        if (ssid != null) {
            joiner.add("ssid: " + GraphQLRequestSerializer.getEntry(ssid));
        }
        if (band != null) {
            joiner.add("band: " + GraphQLRequestSerializer.getEntry(band));
        }
        if (channelWidth != null) {
            joiner.add("channelWidth: " + GraphQLRequestSerializer.getEntry(channelWidth));
        }
        if (capabilities != null) {
            joiner.add("capabilities: " + GraphQLRequestSerializer.getEntry(capabilities));
        }
        if (latitude != null) {
            joiner.add("latitude: " + GraphQLRequestSerializer.getEntry(latitude));
        }
        if (longitude != null) {
            joiner.add("longitude: " + GraphQLRequestSerializer.getEntry(longitude));
        }
        if (altitude != null) {
            joiner.add("altitude: " + GraphQLRequestSerializer.getEntry(altitude));
        }
        if (heading != null) {
            joiner.add("heading: " + GraphQLRequestSerializer.getEntry(heading));
        }
        if (rssi != null) {
            joiner.add("rssi: " + GraphQLRequestSerializer.getEntry(rssi));
        }
        return joiner.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private Integer timestamp;
        private Integer frequency;
        private Integer channel;
        private String bssid;
        private Integer strength;
        private String ssid;
        private String band;
        private Integer channelWidth;
        private String capabilities;
        private Double latitude;
        private Double longitude;
        private Double altitude;
        private Double heading;
        private Double rssi;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setFrequency(Integer frequency) {
            this.frequency = frequency;
            return this;
        }

        public Builder setChannel(Integer channel) {
            this.channel = channel;
            return this;
        }

        public Builder setBssid(String bssid) {
            this.bssid = bssid;
            return this;
        }

        public Builder setStrength(Integer strength) {
            this.strength = strength;
            return this;
        }

        public Builder setSsid(String ssid) {
            this.ssid = ssid;
            return this;
        }

        public Builder setBand(String band) {
            this.band = band;
            return this;
        }

        public Builder setChannelWidth(Integer channelWidth) {
            this.channelWidth = channelWidth;
            return this;
        }

        public Builder setCapabilities(String capabilities) {
            this.capabilities = capabilities;
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

        public Builder setAltitude(Double altitude) {
            this.altitude = altitude;
            return this;
        }

        public Builder setHeading(Double heading) {
            this.heading = heading;
            return this;
        }

        public Builder setRssi(Double rssi) {
            this.rssi = rssi;
            return this;
        }


        public SurveyWiFiScanTO build() {
            return new SurveyWiFiScanTO(id, timestamp, frequency, channel, bssid, strength, ssid, band, channelWidth, capabilities, latitude, longitude, altitude, heading, rssi);
        }

    }
}
