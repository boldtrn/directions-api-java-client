/**
 * Route Optimization API
 * Our Route Optimization API solves the so called vehicle routing problem fast. It calculates an optimal tour for a set of vehicles, services and constraints
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.graphhopper.routeopt.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.graphhopper.routeopt.client.model.Solution;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Response
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-22T09:15:07.913+02:00")
public class Response   {
  @SerializedName("copyrights")
  private List<String> copyrights = new ArrayList<String>();

  @SerializedName("job_id")
  private String jobId = null;

  /**
   * indicates the current status of the job
   */
  public enum StatusEnum {
    @SerializedName("waiting_in_queue")
    WAITING_IN_QUEUE("waiting_in_queue"),
    
    @SerializedName("processing")
    PROCESSING("processing"),
    
    @SerializedName("finished")
    FINISHED("finished");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("waiting_in_queue")
  private Long waitingInQueue = null;

  @SerializedName("processing_time")
  private Long processingTime = null;

  @SerializedName("solution")
  private Solution solution = null;

  public Response copyrights(List<String> copyrights) {
    this.copyrights = copyrights;
    return this;
  }

  public Response addCopyrightsItem(String copyrightsItem) {
    this.copyrights.add(copyrightsItem);
    return this;
  }

   /**
   * Get copyrights
   * @return copyrights
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getCopyrights() {
    return copyrights;
  }

  public void setCopyrights(List<String> copyrights) {
    this.copyrights = copyrights;
  }

  public Response jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * unique identify of job - which you get when posting your request to the large problem solver
   * @return jobId
  **/
  @ApiModelProperty(example = "null", value = "unique identify of job - which you get when posting your request to the large problem solver")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public Response status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * indicates the current status of the job
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "indicates the current status of the job")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Response waitingInQueue(Long waitingInQueue) {
    this.waitingInQueue = waitingInQueue;
    return this;
  }

   /**
   * waiting time in ms
   * @return waitingInQueue
  **/
  @ApiModelProperty(example = "null", value = "waiting time in ms")
  public Long getWaitingInQueue() {
    return waitingInQueue;
  }

  public void setWaitingInQueue(Long waitingInQueue) {
    this.waitingInQueue = waitingInQueue;
  }

  public Response processingTime(Long processingTime) {
    this.processingTime = processingTime;
    return this;
  }

   /**
   * processing time in ms. if job is still waiting in queue, processing_time is 0
   * @return processingTime
  **/
  @ApiModelProperty(example = "null", value = "processing time in ms. if job is still waiting in queue, processing_time is 0")
  public Long getProcessingTime() {
    return processingTime;
  }

  public void setProcessingTime(Long processingTime) {
    this.processingTime = processingTime;
  }

  public Response solution(Solution solution) {
    this.solution = solution;
    return this;
  }

   /**
   * the solution. only available if status field indicates finished
   * @return solution
  **/
  @ApiModelProperty(example = "null", value = "the solution. only available if status field indicates finished")
  public Solution getSolution() {
    return solution;
  }

  public void setSolution(Solution solution) {
    this.solution = solution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.copyrights, response.copyrights) &&
        Objects.equals(this.jobId, response.jobId) &&
        Objects.equals(this.status, response.status) &&
        Objects.equals(this.waitingInQueue, response.waitingInQueue) &&
        Objects.equals(this.processingTime, response.processingTime) &&
        Objects.equals(this.solution, response.solution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copyrights, jobId, status, waitingInQueue, processingTime, solution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    
    sb.append("    copyrights: ").append(toIndentedString(copyrights)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    waitingInQueue: ").append(toIndentedString(waitingInQueue)).append("\n");
    sb.append("    processingTime: ").append(toIndentedString(processingTime)).append("\n");
    sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
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

