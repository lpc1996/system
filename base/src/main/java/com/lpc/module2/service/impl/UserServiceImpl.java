package com.lpc.module2.service.impl;

import com.github.pagehelper.PageHelper;
import com.lpc.module2.mapper.impl.ArchiveMapperImpl;
import com.lpc.module2.mapper.impl.UserMapperImpl;
import com.lpc.module2.mapper.tkMapper.ArchiveMapperTk;
import com.lpc.module2.mapper.tkMapper.UserMapperTk;
import com.lpc.module2.model.Archive;
import com.lpc.module2.model.User;
import com.lpc.module2.pojo.JqGridListForm;
import com.lpc.module2.pojo.Pagination;
import com.lpc.module2.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl extends MyService implements UserService {

    @Resource
    private UserMapperImpl userMapper;
    @Resource
    private UserMapperTk userMapperTk;
    @Resource
    private ArchiveMapperImpl archiveMapper;
    @Resource
    private ArchiveMapperTk archiveMapperTk;

    @Override
    public boolean login(String userName, String password) {
        if(userMapper.ifNullByPrimaryKeyAndPass(userName,password) == 1){
            return true;
        }
        return false;
    }

    @Override
    public User getUser(String userName) {
        return userMapperTk.selectByPrimaryKey(userName);
    }

    @Override
    public Archive getArchive(String id) {
        return archiveMapperTk.selectByPrimaryKey(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userMapperTk.selectAll();
    }

    @Override
    public List<User> getUsersByPage(Integer pageId, Integer size) {
        PageHelper.startPage(pageId,size);
        List<User> users = userMapperTk.selectAll();
        return users;
    }

    @Override
    public boolean updatePass(String userName, String oldPass, String newPass) {
        return userMapper.updatePassByIdAndOldPass(userName, oldPass, newPass) == 1;
    }

    @Override
    public boolean regsiter(User user,String pass) {
        user.setPass(pass);
        return userMapperTk.insert(user) == 1;
    }

    @Override
    public boolean updateUserName(String userName, String id) {
        return userMapper.updateNameById(userName,id) == 1;
    }

    @Override
    public boolean updateUser(User user) {
        return userMapperTk.updateByPrimaryKey(user) == 1;
    }

    public Integer getCount(User record) {
        Integer count=0;
        if(record == null){
            count = userMapperTk.selectCount(record);
        }
        return count;
    }

    public JqGridListForm findByPage(Pagination pagination) {
        int pageId = pagination.getPage() <= 0? 1:pagination.getPage();
        int pageSize = pagination.getRows() <= 0? 20: pagination.getRows();
        PageHelper.startPage(pageId,pageSize);
        List<User> userList = userMapperTk.selectAll();
        return createJqGridListForm(userList,getCount(null),pageId,pageSize);
    }

    public boolean delUser(User user){
        return userMapperTk.delete(user) == 1;
    }
}
