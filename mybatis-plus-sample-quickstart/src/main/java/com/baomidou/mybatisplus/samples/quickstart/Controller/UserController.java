package com.baomidou.mybatisplus.samples.quickstart.Controller;

import com.baomidou.mybatisplus.samples.quickstart.entity.User;
import com.baomidou.mybatisplus.samples.quickstart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping("/test")
    public void sout() {
        System.out.println(44444);

    }

    @GetMapping("/{id}")
    public User getById(@PathVariable(name = "id") Integer id) {
        System.out.println(id);
        return userService.getById(id);
    }

    /***
     *
     * @param id
     * @return
     */
    @PutMapping("/{id}")
    public Integer add(@PathVariable(name = "id") Integer id) {
        User user = new User();
        System.out.println(id);
        return 0;
    }


}
