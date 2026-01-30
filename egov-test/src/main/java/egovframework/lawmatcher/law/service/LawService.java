package egovframework.lawmatcher.law.service;

import java.util.List;
import egovframework.lawmatcher.law.vo.LawVO;

public interface LawService {
    LawVO getLawById(int id) throws Exception;
    List<LawVO> getLawList() throws Exception;
    int createLaw(LawVO law) throws Exception;
    int updateLaw(LawVO law) throws Exception;
    int deleteLaw(int id) throws Exception;
}
