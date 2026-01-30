package egovframework.lawmatcher.law.vo;

import java.io.Serializable;
import java.util.Objects;

public class LawChangeVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer lawId;
    private java.util.Date syncDate;
    private String syncBatchId;
    private String apiStatus;
    private String apiMessage;
    private String oldValues;
    private String newValues;
    private String deptName;
    private Integer deptCode;
    private String status;
    private java.util.Date processedAt;
    private String processedBy;
    private String processNote;
    private java.util.Date createdAt;
    private java.util.Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLawId() {
        return lawId;
    }

    public void setLawId(Integer lawId) {
        this.lawId = lawId;
    }

    public java.util.Date getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(java.util.Date syncDate) {
        this.syncDate = syncDate;
    }

    public String getSyncBatchId() {
        return syncBatchId;
    }

    public void setSyncBatchId(String syncBatchId) {
        this.syncBatchId = syncBatchId;
    }

    public String getApiStatus() {
        return apiStatus;
    }

    public void setApiStatus(String apiStatus) {
        this.apiStatus = apiStatus;
    }

    public String getApiMessage() {
        return apiMessage;
    }

    public void setApiMessage(String apiMessage) {
        this.apiMessage = apiMessage;
    }

    public String getOldValues() {
        return oldValues;
    }

    public void setOldValues(String oldValues) {
        this.oldValues = oldValues;
    }

    public String getNewValues() {
        return newValues;
    }

    public void setNewValues(String newValues) {
        this.newValues = newValues;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public java.util.Date getProcessedAt() {
        return processedAt;
    }

    public void setProcessedAt(java.util.Date processedAt) {
        this.processedAt = processedAt;
    }

    public String getProcessedBy() {
        return processedBy;
    }

    public void setProcessedBy(String processedBy) {
        this.processedBy = processedBy;
    }

    public String getProcessNote() {
        return processNote;
    }

    public void setProcessNote(String processNote) {
        this.processNote = processNote;
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
        LawChangeVO that = (LawChangeVO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
