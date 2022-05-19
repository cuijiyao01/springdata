package com.sap.mapper;

import com.sap.bean.Employee;

import java.util.List;
import java.util.Map;

/**
 * @Author i531869
 * @Date 2020/6/3 20:35
 * @Version 1.0
 */
public interface EmployeeMapper {
  int insert(Employee employee);
  //
  // int delete(Integer id);
  //
  // int update(Employee employee);

  Employee getEmployee(Integer id);

  Integer update(Employee employee);

  Integer delete(Integer id);

  List<Employee> getEmpByName(Map<String, Object> params);
}
