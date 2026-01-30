package egovframework.lawmatcher.law.service.impl;

import java.util.List;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import egovframework.lawmatcher.law.mapper.LawMapper;
import egovframework.lawmatcher.law.service.LawService;
import egovframework.lawmatcher.law.vo.LawVO;

@Service("lawService")
public class LawServiceImpl implements LawService {

    @Resource(name = "lawMapper")
    private LawMapper lawMapper;

    @Override
    public LawVO getLawById(int id) throws Exception {
        return lawMapper.selectLawById(id);
    }

    @Override
    public List<LawVO> getLawList() throws Exception {
        return lawMapper.selectLawList();
    }

    @Override
    public int createLaw(LawVO law) throws Exception {
        return lawMapper.insertLaw(law);
    }

    @Override
    public int updateLaw(LawVO law) throws Exception {
        return lawMapper.updateLaw(law);
    }

    @Override
    public int deleteLaw(int id) throws Exception {
        return lawMapper.deleteLaw(id);
    }
}
