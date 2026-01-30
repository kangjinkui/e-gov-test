package egovframework.lawmatcher.law.service;

import java.util.List;
import egovframework.lawmatcher.law.vo.LawSnapshotVO;

public interface LawSnapshotService {
    LawSnapshotVO getLawSnapshotById(int id) throws Exception;
    List<LawSnapshotVO> getLawSnapshotList() throws Exception;
    int createLawSnapshot(LawSnapshotVO snapshot) throws Exception;
    int updateLawSnapshot(LawSnapshotVO snapshot) throws Exception;
    int deleteLawSnapshot(int id) throws Exception;
}
