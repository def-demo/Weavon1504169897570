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

public class PgEventMstr  {
  
  
   
  
  @Id
   
  
  private Long eventMstrId = null;
  
   
   
  
  private String eventName = null;
  
   
   
  
  private String description = null;
  
   
   
  
  private String createdBy = null;
  
   
   
  
  private Date createdDt = null;
  
   
   
  
  private String updatedBy = null;
  
   
   
  
  private Date updatedDt = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getEventMstrId() {
    return eventMstrId;
  }
  public void setEventMstrId(Long eventMstrId) {
    this.eventMstrId = eventMstrId;
  }

  
  /**
   * {}
   **/
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
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
    PgEventMstr pgEventMstr = (PgEventMstr) o;
    return Objects.equals(eventMstrId, pgEventMstr.eventMstrId) &&
        Objects.equals(eventName, pgEventMstr.eventName) &&
        Objects.equals(description, pgEventMstr.description) &&
        Objects.equals(createdBy, pgEventMstr.createdBy) &&
        Objects.equals(createdDt, pgEventMstr.createdDt) &&
        Objects.equals(updatedBy, pgEventMstr.updatedBy) &&
        Objects.equals(updatedDt, pgEventMstr.updatedDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventMstrId, eventName, description, createdBy, createdDt, updatedBy, updatedDt);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgEventMstr {\n");
    
    sb.append("  eventMstrId: ").append(eventMstrId).append("\n");
    sb.append("  eventName: ").append(eventName).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  createdBy: ").append(createdBy).append("\n");
    sb.append("  createdDt: ").append(createdDt).append("\n");
    sb.append("  updatedBy: ").append(updatedBy).append("\n");
    sb.append("  updatedDt: ").append(updatedDt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

