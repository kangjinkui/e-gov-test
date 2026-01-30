package egovframework.lawmatcher.law.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import egovframework.lawmatcher.law.mapper.LawSnapshotMapper;
import egovframework.lawmatcher.law.service.LawSnapshotService;
import egovframework.lawmatcher.law.vo.LawSnapshotVO;

@Service("lawSnapshotService")
public class LawSnapshotServiceImpl implements LawSnapshotService {

    @Resource(name = "lawSnapshotMapper")
    private LawSnapshotMapper lawSnapshotMapper;

    @Override
    public LawSnapshotVO getLawSnapshotById(int id) throws Exception {
        return lawSnapshotMapper.selectLawSnapshotById(id);
    }

    @Override
    public List<LawSnapshotVO> getLawSnapshotList() throws Exception {
        return lawSnapshotMapper.selectLawSnapshotList();
    }

    @Override
    public int createLawSnapshot(LawSnapshotVO snapshot) throws Exception {
        return lawSnapshotMapper.insertLawSnapshot(snapshot);
    }

    @Override
    public int updateLawSnapshot(LawSnapshotVO snapshot) throws Exception {
        return lawSnapshotMapper.updateLawSnapshot(snapshot);
    }

    @Override
    public int deleteLawSnapshot(int id) throws Exception {
        return lawSnapshotMapper.deleteLawSnapshot(id);
    }
}
