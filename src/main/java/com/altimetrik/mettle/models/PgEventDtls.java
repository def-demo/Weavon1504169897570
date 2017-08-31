package com.altimetrik.mettle.models;

import com.altimetrik.mettle.models.PgUserInfoMstr;
import com.altimetrik.mettle.models.PgEventRule;
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

public class PgEventDtls  {
  
  
   
  
  @Id
   
  
  private Long eventDtlsId = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "EVENT_RULE_ID", insertable=false, updatable=false) 
  
  private PgEventRule pgEventRule = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "USER_INFO_MSTR_ID", insertable=false, updatable=false) 
  
  private PgUserInfoMstr pgUserInfoMstr = null;
  
   
   
  
  private String eventName = null;
  
   
   
  
  private String eventDtlDesc = null;
  
   
   
  
  private String eventInput = null;
  
   
   
  
  private String eventScore = null;
  
   
   
  
  private Integer noOfAttempts = null;
  
   
   
  
  private String eventComments = null;
  
   
   
  
  private String eventOutput = null;
  
   
   
  
  private String eventSts = null;
  
   
   
  
  private String createdBy = null;
  
   
   
  
  private Date createdDt = null;
  
   
   
  
  private String updatedBy = null;
  
   
   
  
  private Date updatedDt = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getEventDtlsId() {
    return eventDtlsId;
  }
  public void setEventDtlsId(Long eventDtlsId) {
    this.eventDtlsId = eventDtlsId;
  }

  
  /**
   * {"foreignKeyColumn":"EVENT_RULE_ID","relation":"OneToOne"}
   **/
  public PgEventRule getPgEventRule() {
    return pgEventRule;
  }
  public void setPgEventRule(PgEventRule pgEventRule) {
    this.pgEventRule = pgEventRule;
  }

  
  /**
   * {"foreignKeyColumn":"USER_INFO_MSTR_ID","relation":"OneToOne"}
   **/
  public PgUserInfoMstr getPgUserInfoMstr() {
    return pgUserInfoMstr;
  }
  public void setPgUserInfoMstr(PgUserInfoMstr pgUserInfoMstr) {
    this.pgUserInfoMstr = pgUserInfoMstr;
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
  public String getEventDtlDesc() {
    return eventDtlDesc;
  }
  public void setEventDtlDesc(String eventDtlDesc) {
    this.eventDtlDesc = eventDtlDesc;
  }

  
  /**
   * {}
   **/
  public String getEventInput() {
    return eventInput;
  }
  public void setEventInput(String eventInput) {
    this.eventInput = eventInput;
  }

  
  /**
   * {}
   **/
  public String getEventScore() {
    return eventScore;
  }
  public void setEventScore(String eventScore) {
    this.eventScore = eventScore;
  }

  
  /**
   * {}
   **/
  public Integer getNoOfAttempts() {
    return noOfAttempts;
  }
  public void setNoOfAttempts(Integer noOfAttempts) {
    this.noOfAttempts = noOfAttempts;
  }

  
  /**
   * {}
   **/
  public String getEventComments() {
    return eventComments;
  }
  public void setEventComments(String eventComments) {
    this.eventComments = eventComments;
  }

  
  /**
   * {}
   **/
  public String getEventOutput() {
    return eventOutput;
  }
  public void setEventOutput(String eventOutput) {
    this.eventOutput = eventOutput;
  }

  
  /**
   * {}
   **/
  public String getEventSts() {
    return eventSts;
  }
  public void setEventSts(String eventSts) {
    this.eventSts = eventSts;
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
    PgEventDtls pgEventDtls = (PgEventDtls) o;
    return Objects.equals(eventDtlsId, pgEventDtls.eventDtlsId) &&
        Objects.equals(pgEventRule, pgEventDtls.pgEventRule) &&
        Objects.equals(pgUserInfoMstr, pgEventDtls.pgUserInfoMstr) &&
        Objects.equals(eventName, pgEventDtls.eventName) &&
        Objects.equals(eventDtlDesc, pgEventDtls.eventDtlDesc) &&
        Objects.equals(eventInput, pgEventDtls.eventInput) &&
        Objects.equals(eventScore, pgEventDtls.eventScore) &&
        Objects.equals(noOfAttempts, pgEventDtls.noOfAttempts) &&
        Objects.equals(eventComments, pgEventDtls.eventComments) &&
        Objects.equals(eventOutput, pgEventDtls.eventOutput) &&
        Objects.equals(eventSts, pgEventDtls.eventSts) &&
        Objects.equals(createdBy, pgEventDtls.createdBy) &&
        Objects.equals(createdDt, pgEventDtls.createdDt) &&
        Objects.equals(updatedBy, pgEventDtls.updatedBy) &&
        Objects.equals(updatedDt, pgEventDtls.updatedDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventDtlsId, pgEventRule, pgUserInfoMstr, eventName, eventDtlDesc, eventInput, eventScore, noOfAttempts, eventComments, eventOutput, eventSts, createdBy, createdDt, updatedBy, updatedDt);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgEventDtls {\n");
    
    sb.append("  eventDtlsId: ").append(eventDtlsId).append("\n");
    sb.append("  pgEventRule: ").append(pgEventRule).append("\n");
    sb.append("  pgUserInfoMstr: ").append(pgUserInfoMstr).append("\n");
    sb.append("  eventName: ").append(eventName).append("\n");
    sb.append("  eventDtlDesc: ").append(eventDtlDesc).append("\n");
    sb.append("  eventInput: ").append(eventInput).append("\n");
    sb.append("  eventScore: ").append(eventScore).append("\n");
    sb.append("  noOfAttempts: ").append(noOfAttempts).append("\n");
    sb.append("  eventComments: ").append(eventComments).append("\n");
    sb.append("  eventOutput: ").append(eventOutput).append("\n");
    sb.append("  eventSts: ").append(eventSts).append("\n");
    sb.append("  createdBy: ").append(createdBy).append("\n");
    sb.append("  createdDt: ").append(createdDt).append("\n");
    sb.append("  updatedBy: ").append(updatedBy).append("\n");
    sb.append("  updatedDt: ").append(updatedDt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

