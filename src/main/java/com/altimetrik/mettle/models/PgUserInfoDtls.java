package com.altimetrik.mettle.models;

import com.altimetrik.mettle.models.PgSourceMstr;
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

public class PgUserInfoDtls  {
  
  
   
  
  @Id
   
  
  private Long userInfoDtlsId = null;
  
   
   
  
  private Long userInfoMstrId = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "SOURCE_ID", insertable=false, updatable=false) 
  
  private PgSourceMstr pgSourceMstr = null;
  
   
   
  
  private String fullName = null;
  
   
   
  
  private String highestQualificationHeld = null;
  
   
   
  
  private String currentJobTitle = null;
  
   
   
  
  private Long reqId = null;
  
   
   
  
  private Long roleId = null;
  
   
   
  
  private Long skillTrackDtlsId = null;
  
   
   
  
  private String experienceInYrs = null;
  
   
   
  
  private String currentEmployer = null;
  
   
   
  
  private String skypeId = null;
  
   
   
  
  private String emailId = null;
  
   
   
  
  private String uniqueId = null;
  
   
   
  
  private String linkedinUrl = null;
  
   
   
  
  private String addressLine1 = null;
  
   
   
  
  private String city = null;
  
   
   
  
  private String zipCode = null;
  
   
   
  
  private String country = null;
  
   
   
  
  private String stateName = null;
  
   
   
  
  private String additionalInfo = null;
  
   
   
  
  private String twitter = null;
  
   
   
  
  private String otherDesc = null;
  
   
   
  
  private String createdBy = null;
  
   
   
  
  private Date createdDt = null;
  
   
   
  
  private String updatedBy = null;
  
   
   
  
  private Date updatedDt = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getUserInfoDtlsId() {
    return userInfoDtlsId;
  }
  public void setUserInfoDtlsId(Long userInfoDtlsId) {
    this.userInfoDtlsId = userInfoDtlsId;
  }

  
  /**
   * {}
   **/
  public Long getUserInfoMstrId() {
    return userInfoMstrId;
  }
  public void setUserInfoMstrId(Long userInfoMstrId) {
    this.userInfoMstrId = userInfoMstrId;
  }

  
  /**
   * {"foreignKeyColumn":"SOURCE_ID","relation":"OneToOne"}
   **/
  public PgSourceMstr getPgSourceMstr() {
    return pgSourceMstr;
  }
  public void setPgSourceMstr(PgSourceMstr pgSourceMstr) {
    this.pgSourceMstr = pgSourceMstr;
  }

  
  /**
   * {}
   **/
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  
  /**
   * {}
   **/
  public String getHighestQualificationHeld() {
    return highestQualificationHeld;
  }
  public void setHighestQualificationHeld(String highestQualificationHeld) {
    this.highestQualificationHeld = highestQualificationHeld;
  }

  
  /**
   * {}
   **/
  public String getCurrentJobTitle() {
    return currentJobTitle;
  }
  public void setCurrentJobTitle(String currentJobTitle) {
    this.currentJobTitle = currentJobTitle;
  }

  
  /**
   * {}
   **/
  public Long getReqId() {
    return reqId;
  }
  public void setReqId(Long reqId) {
    this.reqId = reqId;
  }

  
  /**
   * {}
   **/
  public Long getRoleId() {
    return roleId;
  }
  public void setRoleId(Long roleId) {
    this.roleId = roleId;
  }

  
  /**
   * {}
   **/
  public Long getSkillTrackDtlsId() {
    return skillTrackDtlsId;
  }
  public void setSkillTrackDtlsId(Long skillTrackDtlsId) {
    this.skillTrackDtlsId = skillTrackDtlsId;
  }

  
  /**
   * {}
   **/
  public String getExperienceInYrs() {
    return experienceInYrs;
  }
  public void setExperienceInYrs(String experienceInYrs) {
    this.experienceInYrs = experienceInYrs;
  }

  
  /**
   * {}
   **/
  public String getCurrentEmployer() {
    return currentEmployer;
  }
  public void setCurrentEmployer(String currentEmployer) {
    this.currentEmployer = currentEmployer;
  }

  
  /**
   * {}
   **/
  public String getSkypeId() {
    return skypeId;
  }
  public void setSkypeId(String skypeId) {
    this.skypeId = skypeId;
  }

  
  /**
   * {}
   **/
  public String getEmailId() {
    return emailId;
  }
  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  
  /**
   * {}
   **/
  public String getUniqueId() {
    return uniqueId;
  }
  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  
  /**
   * {}
   **/
  public String getLinkedinUrl() {
    return linkedinUrl;
  }
  public void setLinkedinUrl(String linkedinUrl) {
    this.linkedinUrl = linkedinUrl;
  }

  
  /**
   * {}
   **/
  public String getAddressLine1() {
    return addressLine1;
  }
  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  
  /**
   * {}
   **/
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * {}
   **/
  public String getZipCode() {
    return zipCode;
  }
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  
  /**
   * {}
   **/
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   * {}
   **/
  public String getStateName() {
    return stateName;
  }
  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  
  /**
   * {}
   **/
  public String getAdditionalInfo() {
    return additionalInfo;
  }
  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  
  /**
   * {}
   **/
  public String getTwitter() {
    return twitter;
  }
  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }

  
  /**
   * {}
   **/
  public String getOtherDesc() {
    return otherDesc;
  }
  public void setOtherDesc(String otherDesc) {
    this.otherDesc = otherDesc;
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
    PgUserInfoDtls pgUserInfoDtls = (PgUserInfoDtls) o;
    return Objects.equals(userInfoDtlsId, pgUserInfoDtls.userInfoDtlsId) &&
        Objects.equals(userInfoMstrId, pgUserInfoDtls.userInfoMstrId) &&
        Objects.equals(pgSourceMstr, pgUserInfoDtls.pgSourceMstr) &&
        Objects.equals(fullName, pgUserInfoDtls.fullName) &&
        Objects.equals(highestQualificationHeld, pgUserInfoDtls.highestQualificationHeld) &&
        Objects.equals(currentJobTitle, pgUserInfoDtls.currentJobTitle) &&
        Objects.equals(reqId, pgUserInfoDtls.reqId) &&
        Objects.equals(roleId, pgUserInfoDtls.roleId) &&
        Objects.equals(skillTrackDtlsId, pgUserInfoDtls.skillTrackDtlsId) &&
        Objects.equals(experienceInYrs, pgUserInfoDtls.experienceInYrs) &&
        Objects.equals(currentEmployer, pgUserInfoDtls.currentEmployer) &&
        Objects.equals(skypeId, pgUserInfoDtls.skypeId) &&
        Objects.equals(emailId, pgUserInfoDtls.emailId) &&
        Objects.equals(uniqueId, pgUserInfoDtls.uniqueId) &&
        Objects.equals(linkedinUrl, pgUserInfoDtls.linkedinUrl) &&
        Objects.equals(addressLine1, pgUserInfoDtls.addressLine1) &&
        Objects.equals(city, pgUserInfoDtls.city) &&
        Objects.equals(zipCode, pgUserInfoDtls.zipCode) &&
        Objects.equals(country, pgUserInfoDtls.country) &&
        Objects.equals(stateName, pgUserInfoDtls.stateName) &&
        Objects.equals(additionalInfo, pgUserInfoDtls.additionalInfo) &&
        Objects.equals(twitter, pgUserInfoDtls.twitter) &&
        Objects.equals(otherDesc, pgUserInfoDtls.otherDesc) &&
        Objects.equals(createdBy, pgUserInfoDtls.createdBy) &&
        Objects.equals(createdDt, pgUserInfoDtls.createdDt) &&
        Objects.equals(updatedBy, pgUserInfoDtls.updatedBy) &&
        Objects.equals(updatedDt, pgUserInfoDtls.updatedDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userInfoDtlsId, userInfoMstrId, pgSourceMstr, fullName, highestQualificationHeld, currentJobTitle, reqId, roleId, skillTrackDtlsId, experienceInYrs, currentEmployer, skypeId, emailId, uniqueId, linkedinUrl, addressLine1, city, zipCode, country, stateName, additionalInfo, twitter, otherDesc, createdBy, createdDt, updatedBy, updatedDt);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PgUserInfoDtls {\n");
    
    sb.append("  userInfoDtlsId: ").append(userInfoDtlsId).append("\n");
    sb.append("  userInfoMstrId: ").append(userInfoMstrId).append("\n");
    sb.append("  pgSourceMstr: ").append(pgSourceMstr).append("\n");
    sb.append("  fullName: ").append(fullName).append("\n");
    sb.append("  highestQualificationHeld: ").append(highestQualificationHeld).append("\n");
    sb.append("  currentJobTitle: ").append(currentJobTitle).append("\n");
    sb.append("  reqId: ").append(reqId).append("\n");
    sb.append("  roleId: ").append(roleId).append("\n");
    sb.append("  skillTrackDtlsId: ").append(skillTrackDtlsId).append("\n");
    sb.append("  experienceInYrs: ").append(experienceInYrs).append("\n");
    sb.append("  currentEmployer: ").append(currentEmployer).append("\n");
    sb.append("  skypeId: ").append(skypeId).append("\n");
    sb.append("  emailId: ").append(emailId).append("\n");
    sb.append("  uniqueId: ").append(uniqueId).append("\n");
    sb.append("  linkedinUrl: ").append(linkedinUrl).append("\n");
    sb.append("  addressLine1: ").append(addressLine1).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  zipCode: ").append(zipCode).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  stateName: ").append(stateName).append("\n");
    sb.append("  additionalInfo: ").append(additionalInfo).append("\n");
    sb.append("  twitter: ").append(twitter).append("\n");
    sb.append("  otherDesc: ").append(otherDesc).append("\n");
    sb.append("  createdBy: ").append(createdBy).append("\n");
    sb.append("  createdDt: ").append(createdDt).append("\n");
    sb.append("  updatedBy: ").append(updatedBy).append("\n");
    sb.append("  updatedDt: ").append(updatedDt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

