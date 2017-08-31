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

public class PgAssessmentLevel  {
  
  
   
  
  @Id
   
  
  private Long assessmentLevelId = null;
  
   
   
  
  private String assessmentLevel = null;
  
   
   
  
  private String assessmentDesc = null;
  
   
   
  
  private String createdBy = null;
  
   
   
  
  private Date createdDt = null;
  
   
   
  
  private String updatedBy = null;
  
   
   
  
  private Date updatedDt = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getAssessmentLevelId() {
    return assessmentLevelId;
  }
  public void setAssessmentLevelId(Long assessmentLevelId) {
    this.assessmentLevelId = assessmentLevelId;
  }

  
  /**
   * {}
   **/
  public String getAssessmentLevel() {
    return assessmentLevel;
  }
  public void setAssessmentLevel(String assessmentLevel) {
    this.assessmentLevel = assessmentLevel;
  }

  
  /**
   * {}
   **/
  public String getAssessmentDesc() {
    return assessmentDesc;
  }
  public void setAssessmentDesc(String assessmentDesc) {
    this.assessmentDesc = assessmentDesc;
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
    PgAssessmentLevel pgAssessmentLevel = (PgAssessmentLevel) o;
    return Objects.equals(assessmentLevelId, pgAssessmentLevel.assessmentLevelId) &&
        Objects.equals(assessmentLevel, pgAssessmentLevel.assessmentLevel) &&
        Objects.equals(assessmentDesc, pgAssessmentLevel.assessmentDesc) &&
        Objects.equals(createdBy, pgAssessmentLevel.createdBy) &&
        Objects.equals(createdDt, pgAssessmentLevel.createdDt) &&
        Objects.equals(updatedBy, pgAssessmentLevel.updatedBy) &&
        Objects.equals(updatedDt, pgAssessmentLevel.updatedDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessmentLevelId, assessmentLevel, assessmentDesc, createdBy, createdDt, updatedBy, updatedDt);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgAssessmentLevel {\n");
    
    sb.append("  assessmentLevelId: ").append(assessmentLevelId).append("\n");
    sb.append("  assessmentLevel: ").append(assessmentLevel).append("\n");
    sb.append("  assessmentDesc: ").append(assessmentDesc).append("\n");
    sb.append("  createdBy: ").append(createdBy).append("\n");
    sb.append("  createdDt: ").append(createdDt).append("\n");
    sb.append("  updatedBy: ").append(updatedBy).append("\n");
    sb.append("  updatedDt: ").append(updatedDt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

