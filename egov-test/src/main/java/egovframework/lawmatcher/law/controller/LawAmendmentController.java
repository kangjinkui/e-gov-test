package egovframework.lawmatcher.law.controller;

import java.util.List;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import egovframework.lawmatcher.law.service.LawAmendmentService;
import egovframework.lawmatcher.law.vo.LawAmendmentVO;

@RestController
@RequestMapping("/api/law-amendments")
public class LawAmendmentController {

    @Resource(name = "lawAmendmentService")
    private LawAmendmentService lawAmendmentService;

    @GetMapping("/{id}")
    public LawAmendmentVO getLawAmendment(@PathVariable("id") int id) throws Exception {
        return lawAmendmentService.getLawAmendmentById(id);
    }

    @GetMapping
    public List<LawAmendmentVO> getLawAmendmentList() throws Exception {
        return lawAmendmentService.getLawAmendmentList();
    }

    @PostMapping
    public int createLawAmendment(@RequestBody LawAmendmentVO amendment) throws Exception {
        return lawAmendmentService.createLawAmendment(amendment);
    }

    @PutMapping("/{id}")
    public int updateLawAmendment(@PathVariable("id") int id, @RequestBody LawAmendmentVO amendment) throws Exception {
        amendment.setId(id);
        return lawAmendmentService.updateLawAmendment(amendment);
    }

    @DeleteMapping("/{id}")
    public int deleteLawAmendment(@PathVariable("id") int id) throws Exception {
        return lawAmendmentService.deleteLawAmendment(id);
    }
}
