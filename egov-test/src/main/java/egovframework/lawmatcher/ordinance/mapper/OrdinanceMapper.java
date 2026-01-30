package egovframework.lawmatcher.ordinance.mapper;

import java.util.List;
import egovframework.lawmatcher.ordinance.vo.OrdinanceVO;

public interface OrdinanceMapper {
    OrdinanceVO selectOrdinanceById(int id) throws Exception;
    List<OrdinanceVO> selectOrdinanceList() throws Exception;
    int insertOrdinance(OrdinanceVO ordinance) throws Exception;
    int updateOrdinance(OrdinanceVO ordinance) throws Exception;
    int deleteOrdinance(int id) throws Exception;
}
