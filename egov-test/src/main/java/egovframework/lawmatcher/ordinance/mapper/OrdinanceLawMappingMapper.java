package egovframework.lawmatcher.ordinance.mapper;

import java.util.List;
import egovframework.lawmatcher.ordinance.vo.OrdinanceLawMappingVO;

public interface OrdinanceLawMappingMapper {
    OrdinanceLawMappingVO selectOrdinanceLawMappingById(int id) throws Exception;
    List<OrdinanceLawMappingVO> selectOrdinanceLawMappingList() throws Exception;
    int insertOrdinanceLawMapping(OrdinanceLawMappingVO mapping) throws Exception;
    int updateOrdinanceLawMapping(OrdinanceLawMappingVO mapping) throws Exception;
    int deleteOrdinanceLawMapping(int id) throws Exception;
}
