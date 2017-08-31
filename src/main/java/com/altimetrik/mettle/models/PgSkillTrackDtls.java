package com.altimetrik.mettle.models;

import com.altimetrik.mettle.models.PgSkillTrackMstr;
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

public class PgSkillTrackDtls  {
  
  
   
  
  @Id
   
  
  private Long skillTrackDtlsId = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "SKILL_TRACK_MSTR_ID", insertable=false, updatable=false) 
  
  private PgSkillTrackMstr pgSkillTrackMstr = null;
  
   
   
  
  private String skillTrackDtlsName = null;
  
   
   
  
  private String description = null;
  
   
   
  
  private String createdBy = null;
  
   
   
  
  private Date createdDt = null;
  
   
   
  
  private String updatedBy = null;
  
   
   
  
  private Date updatedDt = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getSkillTrackDtlsId() {
    return skillTrackDtlsId;
  }
  public void setSkillTrackDtlsId(Long skillTrackDtlsId) {
    this.skillTrackDtlsId = skillTrackDtlsId;
  }

  
  /**
   * {"foreignKeyColumn":"SKILL_TRACK_MSTR_ID","relation":"OneToOne"}
   **/
  public PgSkillTrackMstr getPgSkillTrackMstr() {
    return pgSkillTrackMstr;
  }
  public void setPgSkillTrackMstr(PgSkillTrackMstr pgSkillTrackMstr) {
    this.pgSkillTrackMstr = pgSkillTrackMstr;
  }

  
  /**
   * {}
   **/
  public String getSkillTrackDtlsName() {
    return skillTrackDtlsName;
  }
  public void setSkillTrackDtlsName(String skillTrackDtlsName) {
    this.skillTrackDtlsName = skillTrackDtlsName;
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
    PgSkillTrackDtls pgSkillTrackDtls = (PgSkillTrackDtls) o;
    return Objects.equals(skillTrackDtlsId, pgSkillTrackDtls.skillTrackDtlsId) &&
        Objects.equals(pgSkillTrackMstr, pgSkillTrackDtls.pgSkillTrackMstr) &&
        Objects.equals(skillTrackDtlsName, pgSkillTrackDtls.skillTrackDtlsName) &&
        Objects.equals(description, pgSkillTrackDtls.description) &&
        Objects.equals(createdBy, pgSkillTrackDtls.createdBy) &&
        Objects.equals(createdDt, pgSkillTrackDtls.createdDt) &&
        Objects.equals(updatedBy, pgSkillTrackDtls.updatedBy) &&
        Objects.equals(updatedDt, pgSkillTrackDtls.updatedDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillTrackDtlsId, pgSkillTrackMstr, skillTrackDtlsName, description, createdBy, createdDt, updatedBy, updatedDt);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgSkillTrackDtls {\n");
    
    sb.append("  skillTrackDtlsId: ").append(skillTrackDtlsId).append("\n");
    sb.append("  pgSkillTrackMstr: ").append(pgSkillTrackMstr).append("\n");
    sb.append("  skillTrackDtlsName: ").append(skillTrackDtlsName).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  createdBy: ").append(createdBy).append("\n");
    sb.append("  createdDt: ").append(createdDt).append("\n");
    sb.append("  updatedBy: ").append(updatedBy).append("\n");
    sb.append("  updatedDt: ").append(updatedDt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

