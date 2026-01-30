package egovframework.lawmatcher.ordinance.service;

import java.util.List;
import egovframework.lawmatcher.ordinance.vo.OrdinanceArticleVO;

public interface OrdinanceArticleService {
    OrdinanceArticleVO getOrdinanceArticleById(int id) throws Exception;
    List<OrdinanceArticleVO> getOrdinanceArticleList() throws Exception;
    int createOrdinanceArticle(OrdinanceArticleVO article) throws Exception;
    int updateOrdinanceArticle(OrdinanceArticleVO article) throws Exception;
    int deleteOrdinanceArticle(int id) throws Exception;
}
