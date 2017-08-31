package com.altimetrik.mettle.models;

import com.altimetrik.mettle.models.PgPrivilegeMstr;
import com.altimetrik.mettle.models.PgRoleMstr;
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

public class PgRolePrivilege  {
  
  
   
  
  @Id
   
  
  private Long rolePrivilegeId = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "ROLE_ID", insertable=false, updatable=false) 
  
  private PgRoleMstr pgRoleMstr = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "PRIVILEGE_ID", insertable=false, updatable=false) 
  
  private PgPrivilegeMstr pgPrivilegeMstr = null;
  
   
   
  
  private String accessType = null;
  
   
   
  
  private String createdBy = null;
  
   
   
  
  private Date createdDt = null;
  
   
   
  
  private String updatedBy = null;
  
   
   
  
  private Date updatedDt = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getRolePrivilegeId() {
    return rolePrivilegeId;
  }
  public void setRolePrivilegeId(Long rolePrivilegeId) {
    this.rolePrivilegeId = rolePrivilegeId;
  }

  
  /**
   * {"foreignKeyColumn":"ROLE_ID","relation":"OneToOne"}
   **/
  public PgRoleMstr getPgRoleMstr() {
    return pgRoleMstr;
  }
  public void setPgRoleMstr(PgRoleMstr pgRoleMstr) {
    this.pgRoleMstr = pgRoleMstr;
  }

  
  /**
   * {"foreignKeyColumn":"PRIVILEGE_ID","relation":"OneToOne"}
   **/
  public PgPrivilegeMstr getPgPrivilegeMstr() {
    return pgPrivilegeMstr;
  }
  public void setPgPrivilegeMstr(PgPrivilegeMstr pgPrivilegeMstr) {
    this.pgPrivilegeMstr = pgPrivilegeMstr;
  }

  
  /**
   * {}
   **/
  public String getAccessType() {
    return accessType;
  }
  public void setAccessType(String accessType) {
    this.accessType = accessType;
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
    PgRolePrivilege pgRolePrivilege = (PgRolePrivilege) o;
    return Objects.equals(rolePrivilegeId, pgRolePrivilege.rolePrivilegeId) &&
        Objects.equals(pgRoleMstr, pgRolePrivilege.pgRoleMstr) &&
        Objects.equals(pgPrivilegeMstr, pgRolePrivilege.pgPrivilegeMstr) &&
        Objects.equals(accessType, pgRolePrivilege.accessType) &&
        Objects.equals(createdBy, pgRolePrivilege.createdBy) &&
        Objects.equals(createdDt, pgRolePrivilege.createdDt) &&
        Objects.equals(updatedBy, pgRolePrivilege.updatedBy) &&
        Objects.equals(updatedDt, pgRolePrivilege.updatedDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rolePrivilegeId, pgRoleMstr, pgPrivilegeMstr, accessType, createdBy, createdDt, updatedBy, updatedDt);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgRolePrivilege {\n");
    
    sb.append("  rolePrivilegeId: ").append(rolePrivilegeId).append("\n");
    sb.append("  pgRoleMstr: ").append(pgRoleMstr).append("\n");
    sb.append("  pgPrivilegeMstr: ").append(pgPrivilegeMstr).append("\n");
    sb.append("  accessType: ").append(accessType).append("\n");
    sb.append("  createdBy: ").append(createdBy).append("\n");
    sb.append("  createdDt: ").append(createdDt).append("\n");
    sb.append("  updatedBy: ").append(updatedBy).append("\n");
    sb.append("  updatedDt: ").append(updatedDt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

