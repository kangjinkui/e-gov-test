package egovframework.lawmatcher.law.vo;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class LawAmendmentVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String lawId;
    private String lawName;
    private Integer oldSnapshotId;
    private Integer newSnapshotId;
    private String changeType;
    private String changeSummary;
    private java.util.Date detectedAt;
    private Boolean processed;
    private Integer ordinanceId;
    private Integer sourceLawId;
    private String sourceLawName;
    private Date sourceProclaimedDate;
    private String description;
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLawId() {
        return lawId;
    }

    public void setLawId(String lawId) {
        this.lawId = lawId;
    }

    public String getLawName() {
        return lawName;
    }

    public void setLawName(String lawName) {
        this.lawName = lawName;
    }

    public Integer getOldSnapshotId() {
        return oldSnapshotId;
    }

    public void setOldSnapshotId(Integer oldSnapshotId) {
        this.oldSnapshotId = oldSnapshotId;
    }

    public Integer getNewSnapshotId() {
        return newSnapshotId;
    }

    public void setNewSnapshotId(Integer newSnapshotId) {
        this.newSnapshotId = newSnapshotId;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public String getChangeSummary() {
        return changeSummary;
    }

    public void setChangeSummary(String changeSummary) {
        this.changeSummary = changeSummary;
    }

    public java.util.Date getDetectedAt() {
        return detectedAt;
    }

    public void setDetectedAt(java.util.Date detectedAt) {
        this.detectedAt = detectedAt;
    }

    public Boolean getProcessed() {
        return processed;
    }

    public void setProcessed(Boolean processed) {
        this.processed = processed;
    }

    public Integer getOrdinanceId() {
        return ordinanceId;
    }

    public void setOrdinanceId(Integer ordinanceId) {
        this.ordinanceId = ordinanceId;
    }

    public Integer getSourceLawId() {
        return sourceLawId;
    }

    public void setSourceLawId(Integer sourceLawId) {
        this.sourceLawId = sourceLawId;
    }

    public String getSourceLawName() {
        return sourceLawName;
    }

    public void setSourceLawName(String sourceLawName) {
        this.sourceLawName = sourceLawName;
    }

    public Date getSourceProclaimedDate() {
        return sourceProclaimedDate;
    }

    public void setSourceProclaimedDate(Date sourceProclaimedDate) {
        this.sourceProclaimedDate = sourceProclaimedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LawAmendmentVO that = (LawAmendmentVO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
