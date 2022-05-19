package com.sap.mapper;

import com.sap.bean.Department;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @Author i531869
 * @Date 2020/6/3 16:41
 * @Version 1.0
 */
// @Mapper
public interface DepartmentMapper {
  @Select("select * from department where id=#{id}")
  Department getDepartmentById(Integer id);

  @Options(useGeneratedKeys = true, keyProperty = "id")
  @Insert("insert into department(department_name) values(#{departmentName})")
  int insertDepartment(Department department);

  @Delete("delete from department where id = #{id}")
  int deleteDepartment(Integer id);

  @Update("update department set department_name=#{departmentName} where id=#{id}")
  int updateDepartment(Department department);
}
