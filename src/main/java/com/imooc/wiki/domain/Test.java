package com.imooc.wiki.domain;

/**
 * 描述：持久层叫Mapper层，即广为人知的Dao层。因为后续要用到官方代码生成器，其生成的代码是XXXMapper
 */
public class Test {
    private Integer id;
    private String name;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
