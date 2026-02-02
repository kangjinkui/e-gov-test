package egovframework.lawmatcher.law.mapper;
import org.egovframe.rte.psl.dataaccess.mapper.EgovMapper;

import java.util.List;
import egovframework.lawmatcher.law.vo.LawChangeVO;
@EgovMapper("lawChangeMapper")
public interface LawChangeMapper {
    LawChangeVO selectLawChangeById(int id) throws Exception;
    List<LawChangeVO> selectLawChangeList() throws Exception;
    int insertLawChange(LawChangeVO change) throws Exception;
    int updateLawChange(LawChangeVO change) throws Exception;
    int deleteLawChange(int id) throws Exception;
}
