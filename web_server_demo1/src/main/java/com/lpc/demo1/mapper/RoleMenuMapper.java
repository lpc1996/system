package com.lpc.demo1.mapper;

import com.lpc.demo1.model.RoleMenu;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */
public interface RoleMenuMapper extends Mapper<RoleMenu> {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(RoleMenu record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(RoleMenu record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    RoleMenu selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(RoleMenu record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(RoleMenu record);
}