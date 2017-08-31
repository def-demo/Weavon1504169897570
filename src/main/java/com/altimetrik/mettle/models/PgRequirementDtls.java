package com.altimetrik.mettle.models;

import com.altimetrik.mettle.models.PgSkillTrackDtls;
import com.altimetrik.mettle.models.PgRequirement;
import com.altimetrik.mettle.models.PgAssessmentLevel;
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

public class PgRequirementDtls  {
  
  
   
  
  @Id
   
  
  private Long reqDtlsId = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "REQ_ID", insertable=false, updatable=false) 
  
  private PgRequirement pgRequirement = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "SKILL_TRACK_DTLS_ID", insertable=false, updatable=false) 
  
  private PgSkillTrackDtls pgSkillTrackDtls = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "ASSESSMENT_LEVEL_ID", insertable=false, updatable=false) 
  
  private PgAssessmentLevel pgAssessmentLevel = null;
  
   
   
  
  private String createdBy = null;
  
   
   
  
  private Date createdDt = null;
  
   
   
  
  private String updatedBy = null;
  
   
   
  
  private Date updatedDt = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getReqDtlsId() {
    return reqDtlsId;
  }
  public void setReqDtlsId(Long reqDtlsId) {
    this.reqDtlsId = reqDtlsId;
  }

  
  /**
   * {"foreignKeyColumn":"REQ_ID","relation":"OneToOne"}
   **/
  public PgRequirement getPgRequirement() {
    return pgRequirement;
  }
  public void setPgRequirement(PgRequirement pgRequirement) {
    this.pgRequirement = pgRequirement;
  }

  
  /**
   * {"foreignKeyColumn":"SKILL_TRACK_DTLS_ID","relation":"OneToOne"}
   **/
  public PgSkillTrackDtls getPgSkillTrackDtls() {
    return pgSkillTrackDtls;
  }
  public void setPgSkillTrackDtls(PgSkillTrackDtls pgSkillTrackDtls) {
    this.pgSkillTrackDtls = pgSkillTrackDtls;
  }

  
  /**
   * {"foreignKeyColumn":"ASSESSMENT_LEVEL_ID","relation":"OneToOne"}
   **/
  public PgAssessmentLevel getPgAssessmentLevel() {
    return pgAssessmentLevel;
  }
  public void setPgAssessmentLevel(PgAssessmentLevel pgAssessmentLevel) {
    this.pgAssessmentLevel = pgAssessmentLevel;
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
    PgRequirementDtls pgRequirementDtls = (PgRequirementDtls) o;
    return Objects.equals(reqDtlsId, pgRequirementDtls.reqDtlsId) &&
        Objects.equals(pgRequirement, pgRequirementDtls.pgRequirement) &&
        Objects.equals(pgSkillTrackDtls, pgRequirementDtls.pgSkillTrackDtls) &&
        Objects.equals(pgAssessmentLevel, pgRequirementDtls.pgAssessmentLevel) &&
        Objects.equals(createdBy, pgRequirementDtls.createdBy) &&
        Objects.equals(createdDt, pgRequirementDtls.createdDt) &&
        Objects.equals(updatedBy, pgRequirementDtls.updatedBy) &&
        Objects.equals(updatedDt, pgRequirementDtls.updatedDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reqDtlsId, pgRequirement, pgSkillTrackDtls, pgAssessmentLevel, createdBy, createdDt, updatedBy, updatedDt);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgRequirementDtls {\n");
    
    sb.append("  reqDtlsId: ").append(reqDtlsId).append("\n");
    sb.append("  pgRequirement: ").append(pgRequirement).append("\n");
    sb.append("  pgSkillTrackDtls: ").append(pgSkillTrackDtls).append("\n");
    sb.append("  pgAssessmentLevel: ").append(pgAssessmentLevel).append("\n");
    sb.append("  createdBy: ").append(createdBy).append("\n");
    sb.append("  createdDt: ").append(createdDt).append("\n");
    sb.append("  updatedBy: ").append(updatedBy).append("\n");
    sb.append("  updatedDt: ").append(updatedDt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

