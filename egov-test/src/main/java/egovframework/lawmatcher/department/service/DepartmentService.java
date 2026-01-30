package egovframework.lawmatcher.department.service;

import java.util.List;
import egovframework.lawmatcher.department.vo.DepartmentVO;

public interface DepartmentService {
    DepartmentVO getDepartmentById(int id) throws Exception;
    List<DepartmentVO> getDepartmentList() throws Exception;
    int createDepartment(DepartmentVO department) throws Exception;
    int updateDepartment(DepartmentVO department) throws Exception;
    int deleteDepartment(int id) throws Exception;
}
