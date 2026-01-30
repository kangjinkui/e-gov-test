package egovframework.lawmatcher.ordinance.service;

import java.util.List;
import egovframework.lawmatcher.ordinance.vo.OrdinanceVO;

public interface OrdinanceService {
    OrdinanceVO getOrdinanceById(int id) throws Exception;
    List<OrdinanceVO> getOrdinanceList() throws Exception;
    int createOrdinance(OrdinanceVO ordinance) throws Exception;
    int updateOrdinance(OrdinanceVO ordinance) throws Exception;
    int deleteOrdinance(int id) throws Exception;
}
