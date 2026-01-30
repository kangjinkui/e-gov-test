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

import egovframework.lawmatcher.ordinance.service.OrdinanceLawMappingService;
import egovframework.lawmatcher.ordinance.vo.OrdinanceLawMappingVO;

@RestController
@RequestMapping("/api/ordinance-law-mappings")
public class OrdinanceLawMappingController {

    @Resource(name = "ordinanceLawMappingService")
    private OrdinanceLawMappingService ordinanceLawMappingService;

    @GetMapping("/{id}")
    public OrdinanceLawMappingVO getOrdinanceLawMapping(@PathVariable("id") int id) throws Exception {
        return ordinanceLawMappingService.getOrdinanceLawMappingById(id);
    }

    @GetMapping
    public List<OrdinanceLawMappingVO> getOrdinanceLawMappingList() throws Exception {
        return ordinanceLawMappingService.getOrdinanceLawMappingList();
    }

    @PostMapping
    public int createOrdinanceLawMapping(@RequestBody OrdinanceLawMappingVO mapping) throws Exception {
        return ordinanceLawMappingService.createOrdinanceLawMapping(mapping);
    }

    @PutMapping("/{id}")
    public int updateOrdinanceLawMapping(@PathVariable("id") int id, @RequestBody OrdinanceLawMappingVO mapping) throws Exception {
        mapping.setId(id);
        return ordinanceLawMappingService.updateOrdinanceLawMapping(mapping);
    }

    @DeleteMapping("/{id}")
    public int deleteOrdinanceLawMapping(@PathVariable("id") int id) throws Exception {
        return ordinanceLawMappingService.deleteOrdinanceLawMapping(id);
    }
}
