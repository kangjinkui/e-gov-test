package egovframework.lawmatcher.ordinance.service;

import java.util.List;
import egovframework.lawmatcher.ordinance.vo.OrdinanceLawMappingVO;

public interface OrdinanceLawMappingService {
    OrdinanceLawMappingVO getOrdinanceLawMappingById(int id) throws Exception;
    List<OrdinanceLawMappingVO> getOrdinanceLawMappingList() throws Exception;
    int createOrdinanceLawMapping(OrdinanceLawMappingVO mapping) throws Exception;
    int updateOrdinanceLawMapping(OrdinanceLawMappingVO mapping) throws Exception;
    int deleteOrdinanceLawMapping(int id) throws Exception;
}
