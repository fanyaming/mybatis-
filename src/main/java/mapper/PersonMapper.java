package main.java.mapper;

import main.java.domain.Person;
import main.java.query.PersonQueryObject;

import java.util.List;

/**
 * Created by lenovo on 2019/12/30.
 */
public interface PersonMapper {
    /**
     *
     * @param qo
     * @return
     */
    List<Person> listData(PersonQueryObject qo);

    /**
     *
     * @param qo
     * @return
     */
    Long totalCount(PersonQueryObject qo);
}
