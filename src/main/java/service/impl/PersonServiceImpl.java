package main.java.service.impl;

import main.java.domain.Person;
import main.java.mapper.PersonMapper;
import main.java.page.PageResult;
import main.java.query.PersonQueryObject;
import main.java.service.IPersonService;
import main.java.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by lenovo on 2019/12/30.
 */
public class PersonServiceImpl implements IPersonService {

    @Override
    public PageResult query(PersonQueryObject qo) {
        SqlSession session = SqlSessionUtil.getSession();
        PersonMapper mapper = session.getMapper(PersonMapper.class);
        List<Person> listData = mapper.listData(qo);
        Long totalCount = mapper.totalCount(qo);
        return new PageResult(listData,qo.getCurrentPage(),qo.getPageSize(),totalCount.intValue());
    }
}
