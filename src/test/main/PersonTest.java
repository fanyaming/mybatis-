package test.main;

import main.java.page.PageResult;
import main.java.query.PersonQueryObject;
import main.java.service.impl.PersonServiceImpl;
import org.junit.Test;

/**
 * Created by lenovo on 2019/12/30.
 */
public class PersonTest {
    @Test
    public void testQuery() throws  Exception{
        PersonQueryObject qo = new PersonQueryObject();
        qo.setCurrentPage(1);
        qo.setPageSize(2);
        qo.setName("a");
        PersonServiceImpl service = new PersonServiceImpl();
        PageResult results = service.query(qo);
        System.out.println(results);
    }

}

