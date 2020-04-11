package main.java.mapper;

import main.java.domain.Employee;

import java.util.List;

/**
 * Created by lenovo on 2019/12/31.
 */
public interface EmployeeMapper {
    void save(Employee e);
    Employee get(Long id);
    List<Employee> list();
}
