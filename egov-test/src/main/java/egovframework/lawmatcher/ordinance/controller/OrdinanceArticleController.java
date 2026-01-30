package egovframework.lawmatcher.ordinance.controller;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import egovframework.lawmatcher.ordinance.service.OrdinanceArticleService;
import egovframework.lawmatcher.ordinance.vo.OrdinanceArticleVO;

@RestController
@RequestMapping("/api/ordinance-articles")
public class OrdinanceArticleController {

    @Resource(name = "ordinanceArticleService")
    private OrdinanceArticleService ordinanceArticleService;

    @GetMapping("/{id}")
    public OrdinanceArticleVO getOrdinanceArticle(@PathVariable("id") int id) throws Exception {
        return ordinanceArticleService.getOrdinanceArticleById(id);
    }

    @GetMapping
    public List<OrdinanceArticleVO> getOrdinanceArticleList() throws Exception {
        return ordinanceArticleService.getOrdinanceArticleList();
    }

    @PostMapping
    public int createOrdinanceArticle(@RequestBody OrdinanceArticleVO article) throws Exception {
        return ordinanceArticleService.createOrdinanceArticle(article);
    }

    @PutMapping("/{id}")
    public int updateOrdinanceArticle(@PathVariable("id") int id, @RequestBody OrdinanceArticleVO article) throws Exception {
        article.setId(id);
        return ordinanceArticleService.updateOrdinanceArticle(article);
    }

    @DeleteMapping("/{id}")
    public int deleteOrdinanceArticle(@PathVariable("id") int id) throws Exception {
        return ordinanceArticleService.deleteOrdinanceArticle(id);
    }
}
