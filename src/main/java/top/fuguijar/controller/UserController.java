package top.fuguijar.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.fuguijar.pojo.User;
import top.fuguijar.service.UserService;
import top.fuguijar.vo.Result;

/**
 * @author fuguijar.top
 * @date 2021-01-26
 */
@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/page")
    public Result page(String name,Integer start,Integer end){
        Result result = new Result();
        try {
            IPage<User> page = userService.page(name, start, end);
            result.setCode(0);
            result.setData(page);
        } catch (Exception e) {
            result.setCode(1);
            e.printStackTrace();
        }
        return result;
    }

    @PostMapping("/save")
    public Result save(@RequestBody User user){
        Result result = new Result();
        if (userService.save(user)) {
            result.setCode(0);
        }else {
            result.setCode(1);
        }
        return result;
    }


    @PostMapping("/updateById")
    public Result updateById(@RequestBody User user){
        Result result = new Result();
        if (userService.updateById(user)) {
            result.setCode(0);
        }else {
            result.setCode(1);
        }
        return result;
    }

    @PostMapping("/del")
    public Result del(Integer id){
        Result result = new Result();
        if (userService.del(id)) {
            result.setCode(0);
        }else {
            result.setCode(1);
        }
        return result;
    }





}
