package test.main;

import main.java.domain.Department;
import main.java.mapper.DepartmentMapper;
import main.java.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


/**
 * Created by lenovo on 2019/12/31.
 */
public class DepartmentTest {
    @Test
    public void test() throws  Exception{
        SqlSession session = SqlSessionUtil.getSession();
        DepartmentMapper departmentMapper = session.getMapper(DepartmentMapper.class);
        Department department = departmentMapper.get(23L);
        System.out.println(department);
    }
}
