package com.lpc.module2.service;

import com.lpc.module2.model.SysDict;

/**
 * @package:com.lpc.demo1.service
 * @Author:旁观者
 * @Date:2022/2/21-10:45
 * @By:IntelliJ IDEA
 * @FileName:DictService.java
 */
public interface DictService extends Service {

    boolean addDict(SysDict record);
}
