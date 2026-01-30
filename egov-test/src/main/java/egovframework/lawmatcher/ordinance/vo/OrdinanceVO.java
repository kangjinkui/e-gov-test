package egovframework.lawmatcher.ordinance.vo;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class OrdinanceVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String code;
    private String name;
    private String category;
    private String department;
    private Integer departmentId;
    private Date enactedDate;
    private Date enforcedDate;
    private Date revisionDate;
    private String status;
    private java.util.Date createdAt;
    private java.util.Date updatedAt;
    private String serialNo;
    private String fieldName;
    private String orgName;
    private String promulgationNo;
    private String revisionType;
    private String detailLink;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Date getEnactedDate() {
        return enactedDate;
    }

    public void setEnactedDate(Date enactedDate) {
        this.enactedDate = enactedDate;
    }

    public Date getEnforcedDate() {
        return enforcedDate;
    }

    public void setEnforcedDate(Date enforcedDate) {
        this.enforcedDate = enforcedDate;
    }

    public Date getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(Date revisionDate) {
        this.revisionDate = revisionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getPromulgationNo() {
        return promulgationNo;
    }

    public void setPromulgationNo(String promulgationNo) {
        this.promulgationNo = promulgationNo;
    }

    public String getRevisionType() {
        return revisionType;
    }

    public void setRevisionType(String revisionType) {
        this.revisionType = revisionType;
    }

    public String getDetailLink() {
        return detailLink;
    }

    public void setDetailLink(String detailLink) {
        this.detailLink = detailLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrdinanceVO that = (OrdinanceVO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
