package main.java.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by lenovo on 2019/12/31.
 */
@Getter@Setter
public class Department {
    private Long id;
    private String name;
    private List<Employee> emps;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
