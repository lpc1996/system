package com.lpc.demo3.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */

/**
    * menu
    */
@Data
public class Menu {
    /**
    * 主键
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    private Long id;

    /**
    * 菜单名称
    */
    private String name;

    /**
    * 父菜单Id
    */
    private Long parentId;

    /**
    * 菜单级别
    */
    private Integer level;

    /**
    * 菜单地址
    */
    private String url;

    /**
    * 菜单代码
    */
    private String menuCode;

    /**
    * 菜单图标地址
    */
    private String iconUrl;
}