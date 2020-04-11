package main.java.page;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import main.java.domain.Person;

import java.util.List;

/**
 * Created by lenovo on 2019/12/26.
 */
@Getter@Setter@ToString
public class PageResult {
    private List<Person> listData;//分页查询的结果集
    private Integer prevPage;//上一页
    private Integer nextPage;//下一页
    private  Integer currentPage;//当前页
    private Integer pageSize;//页面大小
    private Integer totalCount;//总条数
    private Integer beginPage;//首页
    private Integer totalPage;//总页数

    public PageResult(List<Person> listData, Integer currentPage, Integer pageSize, Integer totalCount) {
        this.listData = listData;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.beginPage=1;
        this.totalPage=this.totalCount%this.pageSize==0?(this.totalCount/this.pageSize):(this.totalCount/this.pageSize+1);
        this.prevPage=this.currentPage==1?1:this.currentPage+1;
        this.nextPage=this.currentPage==this.totalPage?this.totalPage:this.currentPage+1;
    }
}
