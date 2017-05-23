/*
 * GraphHopper Directions API
 * You use the GraphHopper Directions API to add route planning, navigation and route optimization to your software. E.g. the Routing API has turn instructions and elevation data and the Route Optimization API solves your logistic problems and supports various constraints like time window and capacity restrictions. Also it is possible to get all distances between all locations with our fast Matrix API.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.graphhopper.directions.api.client.api;

import com.graphhopper.directions.api.client.ApiException;
import com.graphhopper.directions.api.client.model.GHError;
import com.graphhopper.directions.api.client.model.GHIsochroneResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IsochroneApi
 */
@Ignore
public class IsochroneApiTest {

    private final IsochroneApi api = new IsochroneApi();

    
    /**
     * Isochrone Request
     *
     * The GraphHopper Isochrone API allows calculating an isochrone of a locations means to calculate &#39;a line connecting points at which a vehicle arrives at the same time,&#39; see [Wikipedia](http://en.wikipedia.org/wiki/Isochrone_map). It is also called **reachability** or **walkability**. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void isochroneGetTest() throws ApiException {
        String point = null;
        String key = null;
        Integer timeLimit = null;
        Integer distanceLimit = null;
        String vehicle = null;
        Integer buckets = null;
        Boolean reverseFlow = null;
        GHIsochroneResponse response = api.isochroneGet(point, key, timeLimit, distanceLimit, vehicle, buckets, reverseFlow);

        // TODO: test validations
    }
    
}
