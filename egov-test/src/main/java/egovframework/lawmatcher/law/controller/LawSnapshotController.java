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

import egovframework.lawmatcher.law.service.LawSnapshotService;
import egovframework.lawmatcher.law.vo.LawSnapshotVO;

@RestController
@RequestMapping("/api/law-snapshots")
public class LawSnapshotController {

    @Resource(name = "lawSnapshotService")
    private LawSnapshotService lawSnapshotService;

    @GetMapping("/{id}")
    public LawSnapshotVO getLawSnapshot(@PathVariable("id") int id) throws Exception {
        return lawSnapshotService.getLawSnapshotById(id);
    }

    @GetMapping
    public List<LawSnapshotVO> getLawSnapshotList() throws Exception {
        return lawSnapshotService.getLawSnapshotList();
    }

    @PostMapping
    public int createLawSnapshot(@RequestBody LawSnapshotVO snapshot) throws Exception {
        return lawSnapshotService.createLawSnapshot(snapshot);
    }

    @PutMapping("/{id}")
    public int updateLawSnapshot(@PathVariable("id") int id, @RequestBody LawSnapshotVO snapshot) throws Exception {
        snapshot.setId(id);
        return lawSnapshotService.updateLawSnapshot(snapshot);
    }

    @DeleteMapping("/{id}")
    public int deleteLawSnapshot(@PathVariable("id") int id) throws Exception {
        return lawSnapshotService.deleteLawSnapshot(id);
    }
}
