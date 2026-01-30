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

import egovframework.lawmatcher.law.service.LawChangeService;
import egovframework.lawmatcher.law.vo.LawChangeVO;

@RestController
@RequestMapping("/api/law-changes")
public class LawChangeController {

    @Resource(name = "lawChangeService")
    private LawChangeService lawChangeService;

    @GetMapping("/{id}")
    public LawChangeVO getLawChange(@PathVariable("id") int id) throws Exception {
        return lawChangeService.getLawChangeById(id);
    }

    @GetMapping
    public List<LawChangeVO> getLawChangeList() throws Exception {
        return lawChangeService.getLawChangeList();
    }

    @PostMapping
    public int createLawChange(@RequestBody LawChangeVO change) throws Exception {
        return lawChangeService.createLawChange(change);
    }

    @PutMapping("/{id}")
    public int updateLawChange(@PathVariable("id") int id, @RequestBody LawChangeVO change) throws Exception {
        change.setId(id);
        return lawChangeService.updateLawChange(change);
    }

    @DeleteMapping("/{id}")
    public int deleteLawChange(@PathVariable("id") int id) throws Exception {
        return lawChangeService.deleteLawChange(id);
    }
}
