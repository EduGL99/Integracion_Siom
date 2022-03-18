package com.example.Integracion_Siom.model.symphony.v4;

import com.example.Integracion_Siom.model.symphony.v4.graphql.LocationConnectionTO;
import com.example.Integracion_Siom.model.symphony.v4.graphql.LocationTypeTO;

/**
 * Resolver for LocationType
 */
public interface LocationTypeResolver {

    LocationConnectionTO locations(LocationTypeTO locationTypeTO, Boolean enforceHasLatLong) throws Exception;

}