package com.sap.controller;

import com.sap.bean.Department;
import com.sap.bean.Employee;
import com.sap.mapper.DepartmentMapper;
import com.sap.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author i531869
 * @Date 2020/6/3 16:29
 * @Version 1.0
 */
@RestController
public class DruidController {

  @Autowired
  DepartmentMapper departmentMapper;

  @Autowired
  EmployeeMapper employeeMapper;

  @GetMapping("/emp/{id}")
  public Employee getEmp(@PathVariable("id") Integer id) {
    return employeeMapper.getEmployee(id);
  }

  @PostMapping("/emp")
  public Integer insert(Employee employee) {
    return employeeMapper.insert(employee);
  }

  @PutMapping("/emp")
  public Integer update(Employee employee) {
    return employeeMapper.update(employee);
  }

  @DeleteMapping("/emp/{id}")
  public Integer deleteEmp(@PathVariable("id") Integer id) {
    return employeeMapper.delete(id);
  }

  @GetMapping("/emp/{name}/{gender}")
  public List<Employee> getEmpByName(@PathVariable("name") String name,
      @PathVariable("gender") Integer gender){
    Map<String, Object> params = new HashMap<>();
    params.put("name", name);
    params.put("gender", gender);
    return employeeMapper.getEmpByName(params);
  }

  @GetMapping("/dept/{id}")
  public Department getDepartment(@PathVariable("id") Integer id) {
    return departmentMapper.getDepartmentById(id);
  }

  // @PutMapping("/dept/#{id}")
  // public Integer update(Department department) {
  //   return departmentMapper.updateDepartment(department);
  // }

  @PostMapping("/dept")
  public Integer insert(Department department) {
    return departmentMapper.insertDepartment(department);
  }

  @DeleteMapping("/dept/{id}")
  public Integer delete(@PathVariable("id") Integer id) {
    return departmentMapper.deleteDepartment(id);
  }
}
