package com.imooc.wiki.req;

import javax.validation.constraints.NotNull;

/**
 * 描述：ToDo
 */
public class EbookQueryReq extends PageReq{
    private Long id;
//    @NotNull(message = "【名字】不能为空")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EbookReq{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
