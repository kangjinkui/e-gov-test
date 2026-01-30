package egovframework.lawmatcher.department.service.impl;

import java.util.List;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import egovframework.lawmatcher.department.mapper.DepartmentMapper;
import egovframework.lawmatcher.department.service.DepartmentService;
import egovframework.lawmatcher.department.vo.DepartmentVO;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Resource(name = "departmentMapper")
    private DepartmentMapper departmentMapper;

    @Override
    public DepartmentVO getDepartmentById(int id) throws Exception {
        return departmentMapper.selectDepartmentById(id);
    }

    @Override
    public List<DepartmentVO> getDepartmentList() throws Exception {
        return departmentMapper.selectDepartmentList();
    }

    @Override
    public int createDepartment(DepartmentVO department) throws Exception {
        return departmentMapper.insertDepartment(department);
    }

    @Override
    public int updateDepartment(DepartmentVO department) throws Exception {
        return departmentMapper.updateDepartment(department);
    }

    @Override
    public int deleteDepartment(int id) throws Exception {
        return departmentMapper.deleteDepartment(id);
    }
}
