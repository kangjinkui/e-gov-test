package egovframework.lawmatcher.law.vo;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class LawSnapshotVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String lawId;
    private String lawMst;
    private String lawName;
    private String lawType;
    private Integer version;
    private String content;
    private Date proclaimedDate;
    private Date enforcedDate;
    private String revisionType;
    private java.util.Date fetchedAt;

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

    public String getLawMst() {
        return lawMst;
    }

    public void setLawMst(String lawMst) {
        this.lawMst = lawMst;
    }

    public String getLawName() {
        return lawName;
    }

    public void setLawName(String lawName) {
        this.lawName = lawName;
    }

    public String getLawType() {
        return lawType;
    }

    public void setLawType(String lawType) {
        this.lawType = lawType;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getProclaimedDate() {
        return proclaimedDate;
    }

    public void setProclaimedDate(Date proclaimedDate) {
        this.proclaimedDate = proclaimedDate;
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

    public java.util.Date getFetchedAt() {
        return fetchedAt;
    }

    public void setFetchedAt(java.util.Date fetchedAt) {
        this.fetchedAt = fetchedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LawSnapshotVO that = (LawSnapshotVO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
