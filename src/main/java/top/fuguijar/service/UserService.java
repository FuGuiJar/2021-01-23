package top.fuguijar.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import top.fuguijar.pojo.User;

import java.util.List;

/**
 * @author fuguijar.top
 * @date 2021-01-23
 */
public interface UserService extends IService<User> {

    IPage<User> page(String name, Integer start, Integer end);

    List<User> like(String name);

    boolean save(User user);

    boolean updateById(User user);

    boolean del(Integer id);
}
