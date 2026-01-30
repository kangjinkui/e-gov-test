package egovframework.lawmatcher.ordinance.vo;

import java.io.Serializable;
import java.util.Objects;

public class OrdinanceLawMappingVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer ordinanceId;
    private Integer lawId;
    private String relatedArticles;
    private java.util.Date createdAt;
    private java.util.Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdinanceId() {
        return ordinanceId;
    }

    public void setOrdinanceId(Integer ordinanceId) {
        this.ordinanceId = ordinanceId;
    }

    public Integer getLawId() {
        return lawId;
    }

    public void setLawId(Integer lawId) {
        this.lawId = lawId;
    }

    public String getRelatedArticles() {
        return relatedArticles;
    }

    public void setRelatedArticles(String relatedArticles) {
        this.relatedArticles = relatedArticles;
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
        OrdinanceLawMappingVO that = (OrdinanceLawMappingVO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
