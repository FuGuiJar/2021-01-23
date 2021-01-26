package top.fuguijar.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.fuguijar.mapper.UserMapper;
import top.fuguijar.pojo.User;
import top.fuguijar.service.RoleService;
import top.fuguijar.service.UserService;

import java.util.List;

/**
 * @author fuguijar.top
 * @date 2021-01-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleService roleService;

    @Override
    public IPage<User> page(String name, Integer start, Integer end) {
        Page<User> userPage = new Page<>(start,end);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(!StringUtils.isBlank(name),"username",name);
        Page<User> userPage1 = userMapper.selectPage(userPage, queryWrapper);
        for (User record : userPage1.getRecords()) {
            record.setRole(roleService.getById(record.getUserRole()));
        }
        return userPage;
    }
    @Override
    public List<User> like(String name){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(!StringUtils.isBlank(name),"username",name);
        return super.list(queryWrapper);
    }

    @Override
    public boolean save(User user){
        return userMapper.insert(user) > 0;
    }

    @Override
    public boolean updateById(User user){
        return userMapper.updateById(user) > 0;
    }

    @Override
    public boolean del(Integer id){
        return userMapper.deleteById(id) > 0;
    }





}
