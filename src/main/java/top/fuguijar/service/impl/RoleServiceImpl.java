package top.fuguijar.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.fuguijar.pojo.Role;
import top.fuguijar.service.RoleService;
import top.fuguijar.mapper.*;

/**
 * @author fuguijar.top
 * @date 2021-01-26
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper,Role> implements RoleService {

}
