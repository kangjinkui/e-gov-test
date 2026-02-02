package egovframework.lawmatcher.department.mapper;
import org.egovframe.rte.psl.dataaccess.mapper.EgovMapper;

import java.util.List;
import egovframework.lawmatcher.department.vo.DepartmentVO;
@EgovMapper("departmentMapper")
public interface DepartmentMapper {
    DepartmentVO selectDepartmentById(int id) throws Exception;
    List<DepartmentVO> selectDepartmentList() throws Exception;
    int insertDepartment(DepartmentVO department) throws Exception;
    int updateDepartment(DepartmentVO department) throws Exception;
    int deleteDepartment(int id) throws Exception;
}
