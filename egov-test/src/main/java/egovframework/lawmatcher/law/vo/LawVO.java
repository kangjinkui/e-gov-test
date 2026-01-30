package egovframework.lawmatcher.law.vo;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class LawVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private Long lawSerialNo;
    private Long lawId;
    private String lawName;
    private String lawAbbr;
    private String lawType;
    private Date proclaimedDate;
    private Integer proclaimedNo;
    private Date enforcedDate;
    private String revisionType;
    private String historyCode;
    private String deptName;
    private Integer deptCode;
    private String jointDeptInfo;
    private String jointProclaimedNo;
    private String selfOtherLaw;
    private String detailLink;
    private java.util.Date lastSyncedAt;
    private java.util.Date createdAt;
    private java.util.Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getLawSerialNo() {
        return lawSerialNo;
    }

    public void setLawSerialNo(Long lawSerialNo) {
        this.lawSerialNo = lawSerialNo;
    }

    public Long getLawId() {
        return lawId;
    }

    public void setLawId(Long lawId) {
        this.lawId = lawId;
    }

    public String getLawName() {
        return lawName;
    }

    public void setLawName(String lawName) {
        this.lawName = lawName;
    }

    public String getLawAbbr() {
        return lawAbbr;
    }

    public void setLawAbbr(String lawAbbr) {
        this.lawAbbr = lawAbbr;
    }

    public String getLawType() {
        return lawType;
    }

    public void setLawType(String lawType) {
        this.lawType = lawType;
    }

    public Date getProclaimedDate() {
        return proclaimedDate;
    }

    public void setProclaimedDate(Date proclaimedDate) {
        this.proclaimedDate = proclaimedDate;
    }

    public Integer getProclaimedNo() {
        return proclaimedNo;
    }

    public void setProclaimedNo(Integer proclaimedNo) {
        this.proclaimedNo = proclaimedNo;
    }

    public Date getEnforcedDate() {
        return enforcedDate;
    }

    public void setEnforcedDate(Date enforcedDate) {
        this.enforcedDate = enforcedDate;
    }

    public String getRevisionType() {
        return revisionType;
    }

    public void setRevisionType(String revisionType) {
        this.revisionType = revisionType;
    }

    public String getHistoryCode() {
        return historyCode;
    }

    public void setHistoryCode(String historyCode) {
        this.historyCode = historyCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(Integer deptCode) {
        this.deptCode = deptCode;
    }

    public String getJointDeptInfo() {
        return jointDeptInfo;
    }

    public void setJointDeptInfo(String jointDeptInfo) {
        this.jointDeptInfo = jointDeptInfo;
    }

    public String getJointProclaimedNo() {
        return jointProclaimedNo;
    }

    public void setJointProclaimedNo(String jointProclaimedNo) {
        this.jointProclaimedNo = jointProclaimedNo;
    }

    public String getSelfOtherLaw() {
        return selfOtherLaw;
    }

    public void setSelfOtherLaw(String selfOtherLaw) {
        this.selfOtherLaw = selfOtherLaw;
    }

    public String getDetailLink() {
        return detailLink;
    }

    public void setDetailLink(String detailLink) {
        this.detailLink = detailLink;
    }

    public java.util.Date getLastSyncedAt() {
        return lastSyncedAt;
    }

    public void setLastSyncedAt(java.util.Date lastSyncedAt) {
        this.lastSyncedAt = lastSyncedAt;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LawVO lawVO = (LawVO) o;
        return Objects.equals(id, lawVO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
