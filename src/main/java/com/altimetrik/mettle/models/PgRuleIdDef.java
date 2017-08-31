package com.altimetrik.mettle.models;

import com.altimetrik.mettle.models.PgRuleMstr;
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

public class PgRuleIdDef  {
  
  
   
  
  @Id
   
  
  private Long roleDefId = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "RULE_MSTR_ID", insertable=false, updatable=false) 
  
  private PgRuleMstr pgRuleMstr = null;
  
   
   
  
  private String attributeName = null;
  
   
   
  
  private String attributeValue = null;
  
   
   
  
  private String createdBy = null;
  
   
   
  
  private Date createdDt = null;
  
   
   
  
  private String updatedBy = null;
  
   
   
  
  private Date updatedDt = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getRoleDefId() {
    return roleDefId;
  }
  public void setRoleDefId(Long roleDefId) {
    this.roleDefId = roleDefId;
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
  public String getAttributeName() {
    return attributeName;
  }
  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }

  
  /**
   * {}
   **/
  public String getAttributeValue() {
    return attributeValue;
  }
  public void setAttributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
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
    PgRuleIdDef pgRuleIdDef = (PgRuleIdDef) o;
    return Objects.equals(roleDefId, pgRuleIdDef.roleDefId) &&
        Objects.equals(pgRuleMstr, pgRuleIdDef.pgRuleMstr) &&
        Objects.equals(attributeName, pgRuleIdDef.attributeName) &&
        Objects.equals(attributeValue, pgRuleIdDef.attributeValue) &&
        Objects.equals(createdBy, pgRuleIdDef.createdBy) &&
        Objects.equals(createdDt, pgRuleIdDef.createdDt) &&
        Objects.equals(updatedBy, pgRuleIdDef.updatedBy) &&
        Objects.equals(updatedDt, pgRuleIdDef.updatedDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleDefId, pgRuleMstr, attributeName, attributeValue, createdBy, createdDt, updatedBy, updatedDt);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgRuleIdDef {\n");
    
    sb.append("  roleDefId: ").append(roleDefId).append("\n");
    sb.append("  pgRuleMstr: ").append(pgRuleMstr).append("\n");
    sb.append("  attributeName: ").append(attributeName).append("\n");
    sb.append("  attributeValue: ").append(attributeValue).append("\n");
    sb.append("  createdBy: ").append(createdBy).append("\n");
    sb.append("  createdDt: ").append(createdDt).append("\n");
    sb.append("  updatedBy: ").append(updatedBy).append("\n");
    sb.append("  updatedDt: ").append(updatedDt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

