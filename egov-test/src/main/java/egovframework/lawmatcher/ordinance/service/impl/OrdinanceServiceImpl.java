package egovframework.lawmatcher.ordinance.service.impl;

import java.util.List;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import egovframework.lawmatcher.ordinance.mapper.OrdinanceMapper;
import egovframework.lawmatcher.ordinance.service.OrdinanceService;
import egovframework.lawmatcher.ordinance.vo.OrdinanceVO;

@Service("ordinanceService")
public class OrdinanceServiceImpl implements OrdinanceService {

    @Resource(name = "ordinanceMapper")
    private OrdinanceMapper ordinanceMapper;

    @Override
    public OrdinanceVO getOrdinanceById(int id) throws Exception {
        return ordinanceMapper.selectOrdinanceById(id);
    }

    @Override
    public List<OrdinanceVO> getOrdinanceList() throws Exception {
        return ordinanceMapper.selectOrdinanceList();
    }

    @Override
    public int createOrdinance(OrdinanceVO ordinance) throws Exception {
        return ordinanceMapper.insertOrdinance(ordinance);
    }

    @Override
    public int updateOrdinance(OrdinanceVO ordinance) throws Exception {
        return ordinanceMapper.updateOrdinance(ordinance);
    }

    @Override
    public int deleteOrdinance(int id) throws Exception {
        return ordinanceMapper.deleteOrdinance(id);
    }
}
