package com.altimetrik.mettle.models;

import java.util.Date;

import java.util.Objects;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;






@Entity

public class PgRequirement  {
  
  
   
  
  @Id
   
  
  private Long reqId = null;
  
   
   
  
  private String postingTitle = null;
  
   
   
  
  private String clientName = null;
  
   
   
  
  private Date jobPostedDt = null;
  
   
   
  
  private Date targetDate = null;
  
   
   
  
  private Integer noOfPositions = null;
  
   
   
  
  private String requirementDesc = null;
  
   
   
  
  private String jobOpeningStatus = null;
  
   
   
  
  private String jobType = null;
  
   
   
  
  private String workExperience = null;
  
   
   
  
  private String jobLocation = null;
  
   
   
  
  private String jobSummary = null;
  
   
   
  
  private String createdBy = null;
  
   
   
  
  private Date createdDt = null;
  
   
   
  
  private String updatedBy = null;
  
   
   
  
  private Date updatedDt = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getReqId() {
    return reqId;
  }
  public void setReqId(Long reqId) {
    this.reqId = reqId;
  }

  
  /**
   * {}
   **/
  public String getPostingTitle() {
    return postingTitle;
  }
  public void setPostingTitle(String postingTitle) {
    this.postingTitle = postingTitle;
  }

  
  /**
   * {}
   **/
  public String getClientName() {
    return clientName;
  }
  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  
  /**
   * {}
   **/
  public Date getJobPostedDt() {
    return jobPostedDt;
  }
  public void setJobPostedDt(Date jobPostedDt) {
    this.jobPostedDt = jobPostedDt;
  }

  
  /**
   * {}
   **/
  public Date getTargetDate() {
    return targetDate;
  }
  public void setTargetDate(Date targetDate) {
    this.targetDate = targetDate;
  }

  
  /**
   * {}
   **/
  public Integer getNoOfPositions() {
    return noOfPositions;
  }
  public void setNoOfPositions(Integer noOfPositions) {
    this.noOfPositions = noOfPositions;
  }

  
  /**
   * {}
   **/
  public String getRequirementDesc() {
    return requirementDesc;
  }
  public void setRequirementDesc(String requirementDesc) {
    this.requirementDesc = requirementDesc;
  }

  
  /**
   * {}
   **/
  public String getJobOpeningStatus() {
    return jobOpeningStatus;
  }
  public void setJobOpeningStatus(String jobOpeningStatus) {
    this.jobOpeningStatus = jobOpeningStatus;
  }

  
  /**
   * {}
   **/
  public String getJobType() {
    return jobType;
  }
  public void setJobType(String jobType) {
    this.jobType = jobType;
  }

  
  /**
   * {}
   **/
  public String getWorkExperience() {
    return workExperience;
  }
  public void setWorkExperience(String workExperience) {
    this.workExperience = workExperience;
  }

  
  /**
   * {}
   **/
  public String getJobLocation() {
    return jobLocation;
  }
  public void setJobLocation(String jobLocation) {
    this.jobLocation = jobLocation;
  }

  
  /**
   * {}
   **/
  public String getJobSummary() {
    return jobSummary;
  }
  public void setJobSummary(String jobSummary) {
    this.jobSummary = jobSummary;
  }

  
  /**
   * {}
   **/
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * {}
   **/
  public Date getCreatedDt() {
    return createdDt;
  }
  public void setCreatedDt(Date createdDt) {
    this.createdDt = createdDt;
  }

  
  /**
   * {}
   **/
  public String getUpdatedBy() {
    return updatedBy;
  }
  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  
  /**
   * {}
   **/
  public Date getUpdatedDt() {
    return updatedDt;
  }
  public void setUpdatedDt(Date updatedDt) {
    this.updatedDt = updatedDt;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PgRequirement pgRequirement = (PgRequirement) o;
    return Objects.equals(reqId, pgRequirement.reqId) &&
        Objects.equals(postingTitle, pgRequirement.postingTitle) &&
        Objects.equals(clientName, pgRequirement.clientName) &&
        Objects.equals(jobPostedDt, pgRequirement.jobPostedDt) &&
        Objects.equals(targetDate, pgRequirement.targetDate) &&
        Objects.equals(noOfPositions, pgRequirement.noOfPositions) &&
        Objects.equals(requirementDesc, pgRequirement.requirementDesc) &&
        Objects.equals(jobOpeningStatus, pgRequirement.jobOpeningStatus) &&
        Objects.equals(jobType, pgRequirement.jobType) &&
        Objects.equals(workExperience, pgRequirement.workExperience) &&
        Objects.equals(jobLocation, pgRequirement.jobLocation) &&
        Objects.equals(jobSummary, pgRequirement.jobSummary) &&
        Objects.equals(createdBy, pgRequirement.createdBy) &&
        Objects.equals(createdDt, pgRequirement.createdDt) &&
        Objects.equals(updatedBy, pgRequirement.updatedBy) &&
        Objects.equals(updatedDt, pgRequirement.updatedDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reqId, postingTitle, clientName, jobPostedDt, targetDate, noOfPositions, requirementDesc, jobOpeningStatus, jobType, workExperience, jobLocation, jobSummary, createdBy, createdDt, updatedBy, updatedDt);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgRequirement {\n");
    
    sb.append("  reqId: ").append(reqId).append("\n");
    sb.append("  postingTitle: ").append(postingTitle).append("\n");
    sb.append("  clientName: ").append(clientName).append("\n");
    sb.append("  jobPostedDt: ").append(jobPostedDt).append("\n");
    sb.append("  targetDate: ").append(targetDate).append("\n");
    sb.append("  noOfPositions: ").append(noOfPositions).append("\n");
    sb.append("  requirementDesc: ").append(requirementDesc).append("\n");
    sb.append("  jobOpeningStatus: ").append(jobOpeningStatus).append("\n");
    sb.append("  jobType: ").append(jobType).append("\n");
    sb.append("  workExperience: ").append(workExperience).append("\n");
    sb.append("  jobLocation: ").append(jobLocation).append("\n");
    sb.append("  jobSummary: ").append(jobSummary).append("\n");
    sb.append("  createdBy: ").append(createdBy).append("\n");
    sb.append("  createdDt: ").append(createdDt).append("\n");
    sb.append("  updatedBy: ").append(updatedBy).append("\n");
    sb.append("  updatedDt: ").append(updatedDt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

