package main.java.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Created by lenovo on 2019/12/30.
 */
@Getter@Setter@ToString
public class Person {
    private Long id;
    private String name;
    private String email;
    private BigDecimal salary;
}
