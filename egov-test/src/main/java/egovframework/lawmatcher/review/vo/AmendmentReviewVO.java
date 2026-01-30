package egovframework.lawmatcher.review.vo;

import java.io.Serializable;
import java.util.Objects;

public class AmendmentReviewVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer amendmentId;
    private Integer ordinanceId;
    private Boolean needRevision;
    private String revisionUrgency;
    private String affectedArticles;
    private String reason;
    private String recommendation;
    private String status;
    private String reviewedBy;
    private java.util.Date reviewedAt;
    private java.util.Date createdAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmendmentId() {
        return amendmentId;
    }

    public void setAmendmentId(Integer amendmentId) {
        this.amendmentId = amendmentId;
    }

    public Integer getOrdinanceId() {
        return ordinanceId;
    }

    public void setOrdinanceId(Integer ordinanceId) {
        this.ordinanceId = ordinanceId;
    }

    public Boolean getNeedRevision() {
        return needRevision;
    }

    public void setNeedRevision(Boolean needRevision) {
        this.needRevision = needRevision;
    }

    public String getRevisionUrgency() {
        return revisionUrgency;
    }

    public void setRevisionUrgency(String revisionUrgency) {
        this.revisionUrgency = revisionUrgency;
    }

    public String getAffectedArticles() {
        return affectedArticles;
    }

    public void setAffectedArticles(String affectedArticles) {
        this.affectedArticles = affectedArticles;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReviewedBy() {
        return reviewedBy;
    }

    public void setReviewedBy(String reviewedBy) {
        this.reviewedBy = reviewedBy;
    }

    public java.util.Date getReviewedAt() {
        return reviewedAt;
    }

    public void setReviewedAt(java.util.Date reviewedAt) {
        this.reviewedAt = reviewedAt;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AmendmentReviewVO that = (AmendmentReviewVO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
