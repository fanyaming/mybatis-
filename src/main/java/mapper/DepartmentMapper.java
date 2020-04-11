package main.java.mapper;

import main.java.domain.Department;

import java.util.List;

/**
 * Created by lenovo on 2019/12/31.
 */
public interface DepartmentMapper {
    void save(Department dept);
    Department get(Long id);
    List<Department> list();
}
