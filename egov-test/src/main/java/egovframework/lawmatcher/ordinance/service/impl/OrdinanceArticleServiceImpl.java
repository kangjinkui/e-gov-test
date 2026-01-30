package egovframework.lawmatcher.ordinance.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import egovframework.lawmatcher.ordinance.mapper.OrdinanceArticleMapper;
import egovframework.lawmatcher.ordinance.service.OrdinanceArticleService;
import egovframework.lawmatcher.ordinance.vo.OrdinanceArticleVO;

@Service("ordinanceArticleService")
public class OrdinanceArticleServiceImpl implements OrdinanceArticleService {

    @Resource(name = "ordinanceArticleMapper")
    private OrdinanceArticleMapper ordinanceArticleMapper;

    @Override
    public OrdinanceArticleVO getOrdinanceArticleById(int id) throws Exception {
        return ordinanceArticleMapper.selectOrdinanceArticleById(id);
    }

    @Override
    public List<OrdinanceArticleVO> getOrdinanceArticleList() throws Exception {
        return ordinanceArticleMapper.selectOrdinanceArticleList();
    }

    @Override
    public int createOrdinanceArticle(OrdinanceArticleVO article) throws Exception {
        return ordinanceArticleMapper.insertOrdinanceArticle(article);
    }

    @Override
    public int updateOrdinanceArticle(OrdinanceArticleVO article) throws Exception {
        return ordinanceArticleMapper.updateOrdinanceArticle(article);
    }

    @Override
    public int deleteOrdinanceArticle(int id) throws Exception {
        return ordinanceArticleMapper.deleteOrdinanceArticle(id);
    }
}
