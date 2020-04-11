package main.java.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by lenovo on 2019/12/31.
 */
@Getter@Setter
public class Employee {
    private Long id;
    private String name;
    private Department dept;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
