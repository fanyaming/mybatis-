package main.java.query;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Created by lenovo on 2019/12/21.
 */
@Setter@Getter@ToString
public class PersonQueryObject extends QueryObject{
    private String name;
    private String email;
    private BigDecimal minSalary;
    private BigDecimal maxSalary;
}
