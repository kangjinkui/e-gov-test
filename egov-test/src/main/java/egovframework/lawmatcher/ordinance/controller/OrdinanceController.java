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

import egovframework.lawmatcher.ordinance.service.OrdinanceService;
import egovframework.lawmatcher.ordinance.vo.OrdinanceVO;

@RestController
@RequestMapping("/api/ordinances")
public class OrdinanceController {

    @Resource(name = "ordinanceService")
    private OrdinanceService ordinanceService;

    @GetMapping("/{id}")
    public OrdinanceVO getOrdinance(@PathVariable("id") int id) throws Exception {
        return ordinanceService.getOrdinanceById(id);
    }

    @GetMapping
    public List<OrdinanceVO> getOrdinanceList() throws Exception {
        return ordinanceService.getOrdinanceList();
    }

    @PostMapping
    public int createOrdinance(@RequestBody OrdinanceVO ordinance) throws Exception {
        return ordinanceService.createOrdinance(ordinance);
    }

    @PutMapping("/{id}")
    public int updateOrdinance(@PathVariable("id") int id, @RequestBody OrdinanceVO ordinance) throws Exception {
        ordinance.setId(id);
        return ordinanceService.updateOrdinance(ordinance);
    }

    @DeleteMapping("/{id}")
    public int deleteOrdinance(@PathVariable("id") int id) throws Exception {
        return ordinanceService.deleteOrdinance(id);
    }
}
