package com.zboss.ssm.entity;

import lombok.Data;

import java.util.Date;

/**
 * 预约图书实体
 * @author zbooss
 */
@Data
public class Appointment {
    // 图书ID
    private long bookId;
    // 学号
    private long studentId;
    // 预约时间
    private Date appointTime;

    // 多对一的复合属性
    // 图书实体
    private Book book;

    // 省略构造方法，getter和setter方法，toString方法

}
