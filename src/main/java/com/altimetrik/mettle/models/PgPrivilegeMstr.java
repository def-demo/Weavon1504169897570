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

public class PgPrivilegeMstr  {
  
  
   
  
  @Id
   
  
  private Long privilegeId = null;
  
   
   
  
  private String contentAccess = null;
  
   
   
  
  private String description = null;
  
   
   
  
  private String createdBy = null;
  
   
   
  
  private Date createdDt = null;
  
   
   
  
  private String updatedBy = null;
  
   
   
  
  private Date updatedDt = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getPrivilegeId() {
    return privilegeId;
  }
  public void setPrivilegeId(Long privilegeId) {
    this.privilegeId = privilegeId;
  }

  
  /**
   * {}
   **/
  public String getContentAccess() {
    return contentAccess;
  }
  public void setContentAccess(String contentAccess) {
    this.contentAccess = contentAccess;
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
    PgPrivilegeMstr pgPrivilegeMstr = (PgPrivilegeMstr) o;
    return Objects.equals(privilegeId, pgPrivilegeMstr.privilegeId) &&
        Objects.equals(contentAccess, pgPrivilegeMstr.contentAccess) &&
        Objects.equals(description, pgPrivilegeMstr.description) &&
        Objects.equals(createdBy, pgPrivilegeMstr.createdBy) &&
        Objects.equals(createdDt, pgPrivilegeMstr.createdDt) &&
        Objects.equals(updatedBy, pgPrivilegeMstr.updatedBy) &&
        Objects.equals(updatedDt, pgPrivilegeMstr.updatedDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privilegeId, contentAccess, description, createdBy, createdDt, updatedBy, updatedDt);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgPrivilegeMstr {\n");
    
    sb.append("  privilegeId: ").append(privilegeId).append("\n");
    sb.append("  contentAccess: ").append(contentAccess).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  createdBy: ").append(createdBy).append("\n");
    sb.append("  createdDt: ").append(createdDt).append("\n");
    sb.append("  updatedBy: ").append(updatedBy).append("\n");
    sb.append("  updatedDt: ").append(updatedDt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

