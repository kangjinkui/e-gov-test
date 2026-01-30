package egovframework.lawmatcher.law.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import egovframework.lawmatcher.law.mapper.LawChangeMapper;
import egovframework.lawmatcher.law.service.LawChangeService;
import egovframework.lawmatcher.law.vo.LawChangeVO;

@Service("lawChangeService")
public class LawChangeServiceImpl implements LawChangeService {

    @Resource(name = "lawChangeMapper")
    private LawChangeMapper lawChangeMapper;

    @Override
    public LawChangeVO getLawChangeById(int id) throws Exception {
        return lawChangeMapper.selectLawChangeById(id);
    }

    @Override
    public List<LawChangeVO> getLawChangeList() throws Exception {
        return lawChangeMapper.selectLawChangeList();
    }

    @Override
    public int createLawChange(LawChangeVO change) throws Exception {
        return lawChangeMapper.insertLawChange(change);
    }

    @Override
    public int updateLawChange(LawChangeVO change) throws Exception {
        return lawChangeMapper.updateLawChange(change);
    }

    @Override
    public int deleteLawChange(int id) throws Exception {
        return lawChangeMapper.deleteLawChange(id);
    }
}
