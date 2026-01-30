package egovframework.lawmatcher.ordinance.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import egovframework.lawmatcher.ordinance.mapper.OrdinanceLawMappingMapper;
import egovframework.lawmatcher.ordinance.service.OrdinanceLawMappingService;
import egovframework.lawmatcher.ordinance.vo.OrdinanceLawMappingVO;

@Service("ordinanceLawMappingService")
public class OrdinanceLawMappingServiceImpl implements OrdinanceLawMappingService {

    @Resource(name = "ordinanceLawMappingMapper")
    private OrdinanceLawMappingMapper ordinanceLawMappingMapper;

    @Override
    public OrdinanceLawMappingVO getOrdinanceLawMappingById(int id) throws Exception {
        return ordinanceLawMappingMapper.selectOrdinanceLawMappingById(id);
    }

    @Override
    public List<OrdinanceLawMappingVO> getOrdinanceLawMappingList() throws Exception {
        return ordinanceLawMappingMapper.selectOrdinanceLawMappingList();
    }

    @Override
    public int createOrdinanceLawMapping(OrdinanceLawMappingVO mapping) throws Exception {
        return ordinanceLawMappingMapper.insertOrdinanceLawMapping(mapping);
    }

    @Override
    public int updateOrdinanceLawMapping(OrdinanceLawMappingVO mapping) throws Exception {
        return ordinanceLawMappingMapper.updateOrdinanceLawMapping(mapping);
    }

    @Override
    public int deleteOrdinanceLawMapping(int id) throws Exception {
        return ordinanceLawMappingMapper.deleteOrdinanceLawMapping(id);
    }
}
