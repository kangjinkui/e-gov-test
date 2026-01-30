package egovframework.lawmatcher.ordinance.mapper;

import java.util.List;
import egovframework.lawmatcher.ordinance.vo.OrdinanceArticleVO;

public interface OrdinanceArticleMapper {
    OrdinanceArticleVO selectOrdinanceArticleById(int id) throws Exception;
    List<OrdinanceArticleVO> selectOrdinanceArticleList() throws Exception;
    int insertOrdinanceArticle(OrdinanceArticleVO article) throws Exception;
    int updateOrdinanceArticle(OrdinanceArticleVO article) throws Exception;
    int deleteOrdinanceArticle(int id) throws Exception;
}
