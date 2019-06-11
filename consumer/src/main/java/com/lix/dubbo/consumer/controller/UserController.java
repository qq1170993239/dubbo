package com.lix.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lix.dubbo.common.entity.UserEntity;
import com.lix.dubbo.common.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by lixiang on 2019/6/10 0010.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("/getUser/{userId}")
    public UserEntity user(@PathVariable("userId") Integer userId){
        System.out.println("------调用到了消费端-----");
        return userService.findUser(userId);
    }
}
