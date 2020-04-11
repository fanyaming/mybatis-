package main.java.service;

import main.java.page.PageResult;
import main.java.query.PersonQueryObject;

/**
 * Created by lenovo on 2019/12/30.
 */
public interface IPersonService {
    PageResult query(PersonQueryObject qo);
}
