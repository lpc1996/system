package com.lpc.demo3.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */

/**
    * dict
    */
@Data
@Table(name = "dict")
public class Dict {
    /**
    * 主键
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
    * 表名
    */
    private String tableName;

    /**
    * 列名
    */
    private String columnName;

    /**
    * 类型代码
    */
    private String typeCode;

    /**
    * 类型名称
    */
    private String typeName;

    /**
    * 数据数值
    */
    private Integer valueId;

    /**
    * 数据名称
    */
    private String valueName;

    /**
    * 类型状态
    */
    private Byte status;

    /**
    * 最后修改时间
    */
    private Date updateTime;
}