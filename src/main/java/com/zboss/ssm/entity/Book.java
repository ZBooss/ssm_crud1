package com.zboss.ssm.entity;


import lombok.Data;


/**
 * 图书实体
 * @author zbooss
 */
@Data
public class Book {

    /**
     * 图书ID
     */
    private long bookId;

    /**
     * 图书名称
     */
    private String name;

    /**
     * 馆藏数量
     */
    private int number;
}
