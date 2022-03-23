package com.lpc.demo1.model;

import lombok.Data;

import javax.persistence.*;

/**
  @package:com.lpc.model
  @Author:旁观者
  @Date:2022/2/13-16:52
  @FileName:Archive.java
*/

/**
 * archive
 */
@Data
@Table(name = "archive")
public class Archive {
    /**
     * 学/工号
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "select upper(replace(uuid(),'-',''))")
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 账户类型
     */
    private String type;

    /**
     * 政治面貌
     */
    private String politic;

    /**
     * 民族
     */
    private String nation;
}