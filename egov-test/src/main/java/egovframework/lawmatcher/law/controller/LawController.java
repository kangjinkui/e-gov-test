package egovframework.lawmatcher.law.controller;

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

import egovframework.lawmatcher.law.service.LawService;
import egovframework.lawmatcher.law.vo.LawVO;

@RestController
@RequestMapping("/api/laws")
public class LawController {

    @Resource(name = "lawService")
    private LawService lawService;

    @GetMapping("/{id}")
    public LawVO getLaw(@PathVariable("id") int id) throws Exception {
        return lawService.getLawById(id);
    }

    @GetMapping
    public List<LawVO> getLawList() throws Exception {
        return lawService.getLawList();
    }

    @PostMapping
    public int createLaw(@RequestBody LawVO law) throws Exception {
        return lawService.createLaw(law);
    }

    @PutMapping("/{id}")
    public int updateLaw(@PathVariable("id") int id, @RequestBody LawVO law) throws Exception {
        law.setId(id);
        return lawService.updateLaw(law);
    }

    @DeleteMapping("/{id}")
    public int deleteLaw(@PathVariable("id") int id) throws Exception {
        return lawService.deleteLaw(id);
    }
}
