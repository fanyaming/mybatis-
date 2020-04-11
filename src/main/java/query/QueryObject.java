package main.java.query;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by lenovo on 2019/12/24.
 */
@Setter
@Getter
@ToString
public class QueryObject {
   private Integer currentPage;
   private Integer pageSize;
   public Integer getBeginIndex(){
       return (currentPage-1)*pageSize;
   }
}
