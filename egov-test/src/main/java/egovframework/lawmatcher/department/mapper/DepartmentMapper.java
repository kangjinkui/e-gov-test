package egovframework.lawmatcher.department.mapper;

import java.util.List;
import egovframework.lawmatcher.department.vo.DepartmentVO;

public interface DepartmentMapper {
    DepartmentVO selectDepartmentById(int id) throws Exception;
    List<DepartmentVO> selectDepartmentList() throws Exception;
    int insertDepartment(DepartmentVO department) throws Exception;
    int updateDepartment(DepartmentVO department) throws Exception;
    int deleteDepartment(int id) throws Exception;
}
