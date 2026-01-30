package egovframework.lawmatcher.department.controller;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import egovframework.lawmatcher.department.service.DepartmentService;
import egovframework.lawmatcher.department.vo.DepartmentVO;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Resource(name = "departmentService")
    private DepartmentService departmentService;

    @GetMapping("/{id}")
    public DepartmentVO getDepartment(@PathVariable("id") int id) throws Exception {
        return departmentService.getDepartmentById(id);
    }

    @GetMapping
    public List<DepartmentVO> getDepartmentList() throws Exception {
        return departmentService.getDepartmentList();
    }

    @PostMapping
    public int createDepartment(@RequestBody DepartmentVO department) throws Exception {
        return departmentService.createDepartment(department);
    }

    @PutMapping("/{id}")
    public int updateDepartment(@PathVariable("id") int id, @RequestBody DepartmentVO department) throws Exception {
        department.setId(id);
        return departmentService.updateDepartment(department);
    }

    @DeleteMapping("/{id}")
    public int deleteDepartment(@PathVariable("id") int id) throws Exception {
        return departmentService.deleteDepartment(id);
    }
}
