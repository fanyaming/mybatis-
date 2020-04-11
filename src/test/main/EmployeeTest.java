package test.main;

import main.java.domain.Department;
import main.java.domain.Employee;
import main.java.mapper.DepartmentMapper;
import main.java.mapper.EmployeeMapper;
import main.java.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by lenovo on 2019/12/31.
 */
public class EmployeeTest {
    @Test
    public void testSave() throws  Exception{
        Employee employee = new Employee();
        employee.setName("xiaohong");
        Department department = new Department();
        department.setName("技术部");
        employee.setDept(department);
        SqlSession session = SqlSessionUtil.getSession();
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        DepartmentMapper departmentMapper = session.getMapper(DepartmentMapper.class);
        departmentMapper.save(department);
        employeeMapper.save(employee);
        session.commit();
        session.close();
    }
    @Test
    public void testList() throws  Exception{
        SqlSession session = SqlSessionUtil.getSession();
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        List<Employee> employees = employeeMapper.list();
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println(employee.getDept());
        }
        session.close();
    }
    @Test
    public void test() throws  Exception{
        SqlSession session = SqlSessionUtil.getSession();
        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.get(24L);
        System.out.println(employee.getDept());
    }
}
