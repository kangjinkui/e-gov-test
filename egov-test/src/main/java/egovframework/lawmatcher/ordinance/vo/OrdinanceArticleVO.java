package egovframework.lawmatcher.ordinance.vo;

import java.io.Serializable;
import java.util.Objects;

public class OrdinanceArticleVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer ordinanceId;
    private String articleNo;
    private String paragraphNo;
    private String itemNo;
    private String content;
    private java.util.Date createdAt;

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

    public String getArticleNo() {
        return articleNo;
    }

    public void setArticleNo(String articleNo) {
        this.articleNo = articleNo;
    }

    public String getParagraphNo() {
        return paragraphNo;
    }

    public void setParagraphNo(String paragraphNo) {
        this.paragraphNo = paragraphNo;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        OrdinanceArticleVO that = (OrdinanceArticleVO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
