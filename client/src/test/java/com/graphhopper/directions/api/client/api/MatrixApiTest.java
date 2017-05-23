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
import com.graphhopper.directions.api.client.model.GHMatrixRequest;
import com.graphhopper.directions.api.client.model.GHMatrixResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MatrixApi
 */
@Ignore
public class MatrixApiTest {

    private final MatrixApi api = new MatrixApi();

    
    /**
     * Matrix API
     *
     * The Matrix API is part of the GraphHopper Directions API and with this API you can calculate many-to-many distances, times or routes a lot more efficient than calling the Routing API multiple times. In the Routing API we support multiple points, so called &#39;via points&#39;, which results in one route being calculated. The Matrix API results in NxM routes or more precise NxM weights, distances or times being calculated but is a lot faster compared to NxM single requests. The most simple example is a tourist trying to decide which pizza is close to him instead of using beeline distance she can calculate a 1x4 matrix. Or a delivery service in the need of often big NxN matrices to solve vehicle routing problems. E.g. the GraphHopper Route Optimization API uses the Matrix API under the hood to achieve this. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void matrixGetTest() throws ApiException {
        String key = null;
        List<String> point = null;
        String fromPoint = null;
        String toPoint = null;
        List<String> outArray = null;
        String vehicle = null;
        GHMatrixResponse response = api.matrixGet(key, point, fromPoint, toPoint, outArray, vehicle);

        // TODO: test validations
    }
    
    /**
     * Matrix API Post
     *
     * The GET request has an URL length limitation, which hurts for many locations per request. In those cases use a HTTP POST request with JSON data as input. The only parameter in the URL will be the key which stays in the URL. Both request scenarios are identically except that all singular parameter names are named as their plural for a POST request. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void matrixPostTest() throws ApiException {
        String key = null;
        GHMatrixRequest body = null;
        GHMatrixResponse response = api.matrixPost(key, body);

        // TODO: test validations
    }
    
}
