package com.altimetrik.mettle.models;

import com.altimetrik.mettle.models.PgRuleMstr;
import com.altimetrik.mettle.models.PgEventMstr;
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

public class PgEventRule  {
  
  
   
  
  @Id
   
  
  private Long eventRuleId = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "RULE_MSTR_ID", insertable=false, updatable=false) 
  
  private PgRuleMstr pgRuleMstr = null;
  
   
   
  
  private Long parentRuleMstrId = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "EVENT_MSTR_ID", insertable=false, updatable=false) 
  
  private PgEventMstr pgEventMstr = null;
  
   
   
  
  private String eventRuleName = null;
  
   
   
  
  private String eventRuleCondition = null;
  
   
   
  
  private String seqNo = null;
  
   
   
  
  private String eventPassCriteria = null;
  
   
   
  
  private String eventRuleDesc = null;
  
   
   
  
  private String createdBy = null;
  
   
   
  
  private Date createdDt = null;
  
   
   
  
  private String updatedBy = null;
  
   
   
  
  private Date updatedDt = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getEventRuleId() {
    return eventRuleId;
  }
  public void setEventRuleId(Long eventRuleId) {
    this.eventRuleId = eventRuleId;
  }

  
  /**
   * {"foreignKeyColumn":"RULE_MSTR_ID","relation":"OneToOne"}
   **/
  public PgRuleMstr getPgRuleMstr() {
    return pgRuleMstr;
  }
  public void setPgRuleMstr(PgRuleMstr pgRuleMstr) {
    this.pgRuleMstr = pgRuleMstr;
  }

  
  /**
   * {}
   **/
  public Long getParentRuleMstrId() {
    return parentRuleMstrId;
  }
  public void setParentRuleMstrId(Long parentRuleMstrId) {
    this.parentRuleMstrId = parentRuleMstrId;
  }

  
  /**
   * {"foreignKeyColumn":"EVENT_MSTR_ID","relation":"OneToOne"}
   **/
  public PgEventMstr getPgEventMstr() {
    return pgEventMstr;
  }
  public void setPgEventMstr(PgEventMstr pgEventMstr) {
    this.pgEventMstr = pgEventMstr;
  }

  
  /**
   * {}
   **/
  public String getEventRuleName() {
    return eventRuleName;
  }
  public void setEventRuleName(String eventRuleName) {
    this.eventRuleName = eventRuleName;
  }

  
  /**
   * {}
   **/
  public String getEventRuleCondition() {
    return eventRuleCondition;
  }
  public void setEventRuleCondition(String eventRuleCondition) {
    this.eventRuleCondition = eventRuleCondition;
  }

  
  /**
   * {}
   **/
  public String getSeqNo() {
    return seqNo;
  }
  public void setSeqNo(String seqNo) {
    this.seqNo = seqNo;
  }

  
  /**
   * {}
   **/
  public String getEventPassCriteria() {
    return eventPassCriteria;
  }
  public void setEventPassCriteria(String eventPassCriteria) {
    this.eventPassCriteria = eventPassCriteria;
  }

  
  /**
   * {}
   **/
  public String getEventRuleDesc() {
    return eventRuleDesc;
  }
  public void setEventRuleDesc(String eventRuleDesc) {
    this.eventRuleDesc = eventRuleDesc;
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
    PgEventRule pgEventRule = (PgEventRule) o;
    return Objects.equals(eventRuleId, pgEventRule.eventRuleId) &&
        Objects.equals(pgRuleMstr, pgEventRule.pgRuleMstr) &&
        Objects.equals(parentRuleMstrId, pgEventRule.parentRuleMstrId) &&
        Objects.equals(pgEventMstr, pgEventRule.pgEventMstr) &&
        Objects.equals(eventRuleName, pgEventRule.eventRuleName) &&
        Objects.equals(eventRuleCondition, pgEventRule.eventRuleCondition) &&
        Objects.equals(seqNo, pgEventRule.seqNo) &&
        Objects.equals(eventPassCriteria, pgEventRule.eventPassCriteria) &&
        Objects.equals(eventRuleDesc, pgEventRule.eventRuleDesc) &&
        Objects.equals(createdBy, pgEventRule.createdBy) &&
        Objects.equals(createdDt, pgEventRule.createdDt) &&
        Objects.equals(updatedBy, pgEventRule.updatedBy) &&
        Objects.equals(updatedDt, pgEventRule.updatedDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventRuleId, pgRuleMstr, parentRuleMstrId, pgEventMstr, eventRuleName, eventRuleCondition, seqNo, eventPassCriteria, eventRuleDesc, createdBy, createdDt, updatedBy, updatedDt);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgEventRule {\n");
    
    sb.append("  eventRuleId: ").append(eventRuleId).append("\n");
    sb.append("  pgRuleMstr: ").append(pgRuleMstr).append("\n");
    sb.append("  parentRuleMstrId: ").append(parentRuleMstrId).append("\n");
    sb.append("  pgEventMstr: ").append(pgEventMstr).append("\n");
    sb.append("  eventRuleName: ").append(eventRuleName).append("\n");
    sb.append("  eventRuleCondition: ").append(eventRuleCondition).append("\n");
    sb.append("  seqNo: ").append(seqNo).append("\n");
    sb.append("  eventPassCriteria: ").append(eventPassCriteria).append("\n");
    sb.append("  eventRuleDesc: ").append(eventRuleDesc).append("\n");
    sb.append("  createdBy: ").append(createdBy).append("\n");
    sb.append("  createdDt: ").append(createdDt).append("\n");
    sb.append("  updatedBy: ").append(updatedBy).append("\n");
    sb.append("  updatedDt: ").append(updatedDt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

