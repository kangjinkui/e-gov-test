package egovframework.lawmatcher.law.service;

import java.util.List;
import egovframework.lawmatcher.law.vo.LawChangeVO;

public interface LawChangeService {
    LawChangeVO getLawChangeById(int id) throws Exception;
    List<LawChangeVO> getLawChangeList() throws Exception;
    int createLawChange(LawChangeVO change) throws Exception;
    int updateLawChange(LawChangeVO change) throws Exception;
    int deleteLawChange(int id) throws Exception;
}
