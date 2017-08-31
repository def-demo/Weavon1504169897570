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

public class PgSourceMstr  {
  
  
   
  
  @Id
   
  
  private Long sourceId = null;
  
   
   
  
  private String sourceName = null;
  
   
   
  
  private String createdBy = null;
  
   
   
  
  private Date createdDt = null;
  
   
   
  
  private String updatedBy = null;
  
   
   
  
  private Date updatedDt = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getSourceId() {
    return sourceId;
  }
  public void setSourceId(Long sourceId) {
    this.sourceId = sourceId;
  }

  
  /**
   * {}
   **/
  public String getSourceName() {
    return sourceName;
  }
  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
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
    PgSourceMstr pgSourceMstr = (PgSourceMstr) o;
    return Objects.equals(sourceId, pgSourceMstr.sourceId) &&
        Objects.equals(sourceName, pgSourceMstr.sourceName) &&
        Objects.equals(createdBy, pgSourceMstr.createdBy) &&
        Objects.equals(createdDt, pgSourceMstr.createdDt) &&
        Objects.equals(updatedBy, pgSourceMstr.updatedBy) &&
        Objects.equals(updatedDt, pgSourceMstr.updatedDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, sourceName, createdBy, createdDt, updatedBy, updatedDt);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgSourceMstr {\n");
    
    sb.append("  sourceId: ").append(sourceId).append("\n");
    sb.append("  sourceName: ").append(sourceName).append("\n");
    sb.append("  createdBy: ").append(createdBy).append("\n");
    sb.append("  createdDt: ").append(createdDt).append("\n");
    sb.append("  updatedBy: ").append(updatedBy).append("\n");
    sb.append("  updatedDt: ").append(updatedDt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

