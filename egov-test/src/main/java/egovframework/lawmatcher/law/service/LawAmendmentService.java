package egovframework.lawmatcher.law.service;

import java.util.List;
import egovframework.lawmatcher.law.vo.LawAmendmentVO;

public interface LawAmendmentService {
    LawAmendmentVO getLawAmendmentById(int id) throws Exception;
    List<LawAmendmentVO> getLawAmendmentList() throws Exception;
    int createLawAmendment(LawAmendmentVO amendment) throws Exception;
    int updateLawAmendment(LawAmendmentVO amendment) throws Exception;
    int deleteLawAmendment(int id) throws Exception;
}
