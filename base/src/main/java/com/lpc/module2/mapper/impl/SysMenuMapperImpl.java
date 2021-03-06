package com.lpc.module2.mapper.impl;

import com.lpc.module2.mapper.SysMenuMapper;
import com.lpc.module2.model.SysMenu;

import java.util.List;

/**
 * @package:com.lpc.module2.mapper.impl
 * @Author:旁观者
 * @Date:2022/5/2-16:54
 * @By:IntelliJ IDEA
 * @FileName:SysMenuMapperImpl.java
 */
public class SysMenuMapperImpl extends MyMapperImpl<SysMenuMapper> implements SysMenuMapper {

    @Override
    public List<SysMenu> getMenuByUserId(String userId) {
        return getMapper(SysMenuMapper.class).getMenuByUserId(userId);
    }
}
