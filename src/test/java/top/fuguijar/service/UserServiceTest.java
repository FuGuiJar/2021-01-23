package top.fuguijar.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import top.fuguijar.config.SpringConfig;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author fuguijar.top
 * @date 2021-01-23
 */
@SpringJUnitConfig(classes = SpringConfig.class)
class UserServiceTest {

    @Autowired
    private UserService userService;


    @Test
    public void list(){
        userService.list().forEach(System.err::println);
    }
//
//    @Test
//    void page() {
//        userService.page("张",0,2).getRecords().forEach(System.err::println);
//    }
//
//    @Test
//    void like() {
//        System.err.println(userService.like("张"));
//    }
//
//    @Test
//    void save() {
//        userService.save();
//    }
//
//    @Test
//    void updateById() {
//        userService.updateById();
//    }
//
//    @Test
//    void del() {
//        userService.del();
//    }
}