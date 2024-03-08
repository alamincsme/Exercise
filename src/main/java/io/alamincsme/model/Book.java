package io.alamincsme.model;

public class Book {
    private String name ;
    private Long pageNo ;

    public Book() {

    }

    public Book(String name, Long pageNo) {
        this.name = name;
        this.pageNo = pageNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPageNo() {
        return pageNo;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }
}
