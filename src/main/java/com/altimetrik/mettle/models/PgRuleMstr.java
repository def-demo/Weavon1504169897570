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

public class PgRuleMstr  {
  
  
   
  
  @Id
   
  
  private Long ruleMstrId = null;
  
   
   
  
  private String description = null;
  
   
   
  
  private Date startDt = null;
  
   
   
  
  private Date endDt = null;
  
   
   
  
  private Integer seqNo = null;
  
   
   
  
  private String orgName = null;
  
   
   
  
  private String createdBy = null;
  
   
   
  
  private Date createdDt = null;
  
   
   
  
  private String updatedBy = null;
  
   
   
  
  private Date updatedDt = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getRuleMstrId() {
    return ruleMstrId;
  }
  public void setRuleMstrId(Long ruleMstrId) {
    this.ruleMstrId = ruleMstrId;
  }

  
  /**
   * {}
   **/
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * {}
   **/
  public Date getStartDt() {
    return startDt;
  }
  public void setStartDt(Date startDt) {
    this.startDt = startDt;
  }

  
  /**
   * {}
   **/
  public Date getEndDt() {
    return endDt;
  }
  public void setEndDt(Date endDt) {
    this.endDt = endDt;
  }

  
  /**
   * {}
   **/
  public Integer getSeqNo() {
    return seqNo;
  }
  public void setSeqNo(Integer seqNo) {
    this.seqNo = seqNo;
  }

  
  /**
   * {}
   **/
  public String getOrgName() {
    return orgName;
  }
  public void setOrgName(String orgName) {
    this.orgName = orgName;
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
    PgRuleMstr pgRuleMstr = (PgRuleMstr) o;
    return Objects.equals(ruleMstrId, pgRuleMstr.ruleMstrId) &&
        Objects.equals(description, pgRuleMstr.description) &&
        Objects.equals(startDt, pgRuleMstr.startDt) &&
        Objects.equals(endDt, pgRuleMstr.endDt) &&
        Objects.equals(seqNo, pgRuleMstr.seqNo) &&
        Objects.equals(orgName, pgRuleMstr.orgName) &&
        Objects.equals(createdBy, pgRuleMstr.createdBy) &&
        Objects.equals(createdDt, pgRuleMstr.createdDt) &&
        Objects.equals(updatedBy, pgRuleMstr.updatedBy) &&
        Objects.equals(updatedDt, pgRuleMstr.updatedDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleMstrId, description, startDt, endDt, seqNo, orgName, createdBy, createdDt, updatedBy, updatedDt);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgRuleMstr {\n");
    
    sb.append("  ruleMstrId: ").append(ruleMstrId).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  startDt: ").append(startDt).append("\n");
    sb.append("  endDt: ").append(endDt).append("\n");
    sb.append("  seqNo: ").append(seqNo).append("\n");
    sb.append("  orgName: ").append(orgName).append("\n");
    sb.append("  createdBy: ").append(createdBy).append("\n");
    sb.append("  createdDt: ").append(createdDt).append("\n");
    sb.append("  updatedBy: ").append(updatedBy).append("\n");
    sb.append("  updatedDt: ").append(updatedDt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

