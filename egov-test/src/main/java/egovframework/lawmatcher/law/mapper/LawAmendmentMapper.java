package egovframework.lawmatcher.law.mapper;

import java.util.List;
import egovframework.lawmatcher.law.vo.LawAmendmentVO;

public interface LawAmendmentMapper {
    LawAmendmentVO selectLawAmendmentById(int id) throws Exception;
    List<LawAmendmentVO> selectLawAmendmentList() throws Exception;
    int insertLawAmendment(LawAmendmentVO amendment) throws Exception;
    int updateLawAmendment(LawAmendmentVO amendment) throws Exception;
    int deleteLawAmendment(int id) throws Exception;
}
