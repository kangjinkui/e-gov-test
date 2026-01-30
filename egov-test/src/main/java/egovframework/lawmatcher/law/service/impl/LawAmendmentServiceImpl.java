package egovframework.lawmatcher.law.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import egovframework.lawmatcher.law.mapper.LawAmendmentMapper;
import egovframework.lawmatcher.law.service.LawAmendmentService;
import egovframework.lawmatcher.law.vo.LawAmendmentVO;

@Service("lawAmendmentService")
public class LawAmendmentServiceImpl implements LawAmendmentService {

    @Resource(name = "lawAmendmentMapper")
    private LawAmendmentMapper lawAmendmentMapper;

    @Override
    public LawAmendmentVO getLawAmendmentById(int id) throws Exception {
        return lawAmendmentMapper.selectLawAmendmentById(id);
    }

    @Override
    public List<LawAmendmentVO> getLawAmendmentList() throws Exception {
        return lawAmendmentMapper.selectLawAmendmentList();
    }

    @Override
    public int createLawAmendment(LawAmendmentVO amendment) throws Exception {
        return lawAmendmentMapper.insertLawAmendment(amendment);
    }

    @Override
    public int updateLawAmendment(LawAmendmentVO amendment) throws Exception {
        return lawAmendmentMapper.updateLawAmendment(amendment);
    }

    @Override
    public int deleteLawAmendment(int id) throws Exception {
        return lawAmendmentMapper.deleteLawAmendment(id);
    }
}
