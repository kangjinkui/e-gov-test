package egovframework.lawmatcher.law.mapper;
import org.egovframe.rte.psl.dataaccess.mapper.EgovMapper;

import java.util.List;
import egovframework.lawmatcher.law.vo.LawSnapshotVO;
@EgovMapper("lawSnapshotMapper")
public interface LawSnapshotMapper {
    LawSnapshotVO selectLawSnapshotById(int id) throws Exception;
    List<LawSnapshotVO> selectLawSnapshotList() throws Exception;
    int insertLawSnapshot(LawSnapshotVO snapshot) throws Exception;
    int updateLawSnapshot(LawSnapshotVO snapshot) throws Exception;
    int deleteLawSnapshot(int id) throws Exception;
}
