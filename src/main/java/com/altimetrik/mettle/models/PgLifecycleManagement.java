package com.altimetrik.mettle.models;

import com.altimetrik.mettle.models.PgUserInfoMstr;
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

public class PgLifecycleManagement  {
  
  
   
  
  @Id
   
  
  private Long lifeCycleId = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "USER_INFO_MSTR_ID", insertable=false, updatable=false) 
  
  private PgUserInfoMstr pgUserInfoMstr = null;
  
   
   
  
  private Long ruleMstrId = null;
  
   
   
  
  private Date loginTime = null;
  
   
   
  
  private String timeSlot = null;
  
   
   
  
  private String profileStatus = null;
  
   
   
  
  private String createdBy = null;
  
   
   
  
  private Date createdDt = null;
  
   
   
  
  private String updatedBy = null;
  
   
   
  
  private Date updatedDt = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getLifeCycleId() {
    return lifeCycleId;
  }
  public void setLifeCycleId(Long lifeCycleId) {
    this.lifeCycleId = lifeCycleId;
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
  public Long getRuleMstrId() {
    return ruleMstrId;
  }
  public void setRuleMstrId(Long ruleMstrId) {
    this.ruleMstrId = ruleMstrId;
  }

  
  /**
   * {}
   **/
  public Date getLoginTime() {
    return loginTime;
  }
  public void setLoginTime(Date loginTime) {
    this.loginTime = loginTime;
  }

  
  /**
   * {}
   **/
  public String getTimeSlot() {
    return timeSlot;
  }
  public void setTimeSlot(String timeSlot) {
    this.timeSlot = timeSlot;
  }

  
  /**
   * {}
   **/
  public String getProfileStatus() {
    return profileStatus;
  }
  public void setProfileStatus(String profileStatus) {
    this.profileStatus = profileStatus;
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
    PgLifecycleManagement pgLifecycleManagement = (PgLifecycleManagement) o;
    return Objects.equals(lifeCycleId, pgLifecycleManagement.lifeCycleId) &&
        Objects.equals(pgUserInfoMstr, pgLifecycleManagement.pgUserInfoMstr) &&
        Objects.equals(ruleMstrId, pgLifecycleManagement.ruleMstrId) &&
        Objects.equals(loginTime, pgLifecycleManagement.loginTime) &&
        Objects.equals(timeSlot, pgLifecycleManagement.timeSlot) &&
        Objects.equals(profileStatus, pgLifecycleManagement.profileStatus) &&
        Objects.equals(createdBy, pgLifecycleManagement.createdBy) &&
        Objects.equals(createdDt, pgLifecycleManagement.createdDt) &&
        Objects.equals(updatedBy, pgLifecycleManagement.updatedBy) &&
        Objects.equals(updatedDt, pgLifecycleManagement.updatedDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lifeCycleId, pgUserInfoMstr, ruleMstrId, loginTime, timeSlot, profileStatus, createdBy, createdDt, updatedBy, updatedDt);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgLifecycleManagement {\n");
    
    sb.append("  lifeCycleId: ").append(lifeCycleId).append("\n");
    sb.append("  pgUserInfoMstr: ").append(pgUserInfoMstr).append("\n");
    sb.append("  ruleMstrId: ").append(ruleMstrId).append("\n");
    sb.append("  loginTime: ").append(loginTime).append("\n");
    sb.append("  timeSlot: ").append(timeSlot).append("\n");
    sb.append("  profileStatus: ").append(profileStatus).append("\n");
    sb.append("  createdBy: ").append(createdBy).append("\n");
    sb.append("  createdDt: ").append(createdDt).append("\n");
    sb.append("  updatedBy: ").append(updatedBy).append("\n");
    sb.append("  updatedDt: ").append(updatedDt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

