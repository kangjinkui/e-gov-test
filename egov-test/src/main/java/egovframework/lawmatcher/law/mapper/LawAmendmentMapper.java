package egovframework.lawmatcher.law.mapper;
import org.egovframe.rte.psl.dataaccess.mapper.EgovMapper;

import java.util.List;
import egovframework.lawmatcher.law.vo.LawAmendmentVO;
@EgovMapper("lawAmendmentMapper")
public interface LawAmendmentMapper {
    LawAmendmentVO selectLawAmendmentById(int id) throws Exception;
    List<LawAmendmentVO> selectLawAmendmentList() throws Exception;
    int insertLawAmendment(LawAmendmentVO amendment) throws Exception;
    int updateLawAmendment(LawAmendmentVO amendment) throws Exception;
    int deleteLawAmendment(int id) throws Exception;
}
