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


package com.graphhopper.directions.api.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.graphhopper.directions.api.client.model.CostMatrixDataInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * JSON data of matrix response
 */
@ApiModel(description = "JSON data of matrix response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-23T18:34:50.745+02:00")
public class CostMatrixData {
  @SerializedName("times")
  private List<List<Long>> times = new ArrayList<List<Long>>();

  @SerializedName("distances")
  private List<List<Double>> distances = new ArrayList<List<Double>>();

  @SerializedName("info")
  private CostMatrixDataInfo info = null;

  public CostMatrixData times(List<List<Long>> times) {
    this.times = times;
    return this;
  }

  public CostMatrixData addTimesItem(List<Long> timesItem) {
    this.times.add(timesItem);
    return this;
  }

   /**
   * Get times
   * @return times
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<List<Long>> getTimes() {
    return times;
  }

  public void setTimes(List<List<Long>> times) {
    this.times = times;
  }

  public CostMatrixData distances(List<List<Double>> distances) {
    this.distances = distances;
    return this;
  }

  public CostMatrixData addDistancesItem(List<Double> distancesItem) {
    this.distances.add(distancesItem);
    return this;
  }

   /**
   * Get distances
   * @return distances
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<List<Double>> getDistances() {
    return distances;
  }

  public void setDistances(List<List<Double>> distances) {
    this.distances = distances;
  }

  public CostMatrixData info(CostMatrixDataInfo info) {
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(example = "null", value = "")
  public CostMatrixDataInfo getInfo() {
    return info;
  }

  public void setInfo(CostMatrixDataInfo info) {
    this.info = info;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CostMatrixData costMatrixData = (CostMatrixData) o;
    return Objects.equals(this.times, costMatrixData.times) &&
        Objects.equals(this.distances, costMatrixData.distances) &&
        Objects.equals(this.info, costMatrixData.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(times, distances, info);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CostMatrixData {\n");
    
    sb.append("    times: ").append(toIndentedString(times)).append("\n");
    sb.append("    distances: ").append(toIndentedString(distances)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

