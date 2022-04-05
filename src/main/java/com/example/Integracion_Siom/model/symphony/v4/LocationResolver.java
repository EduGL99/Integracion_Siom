package com.example.Integracion_Siom.model.symphony.v4;

import com.example.Integracion_Siom.model.symphony.v4.graphql.LocationTO;
import com.example.Integracion_Siom.model.symphony.v4.graphql.NetworkTopologyTO;

/**
 * Resolver for Location
 */
public interface LocationResolver {

    @javax.validation.constraints.NotNull
    NetworkTopologyTO topology(LocationTO locationTO, Integer depth) throws Exception;

    @javax.validation.constraints.NotNull
    Double distanceKm(LocationTO locationTO, Double latitude, Double longitude) throws Exception;

}