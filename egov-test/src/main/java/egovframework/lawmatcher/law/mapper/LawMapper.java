package egovframework.lawmatcher.law.mapper;
import org.egovframe.rte.psl.dataaccess.mapper.EgovMapper;

import java.util.List;
import egovframework.lawmatcher.law.vo.LawVO;
@EgovMapper("lawMapper")
public interface LawMapper {
    LawVO selectLawById(int id) throws Exception;
    List<LawVO> selectLawList() throws Exception;
    int insertLaw(LawVO law) throws Exception;
    int updateLaw(LawVO law) throws Exception;
    int deleteLaw(int id) throws Exception;
}
