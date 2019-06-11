package com.lix.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lix.dubbo.common.entity.UserEntity;
import com.lix.dubbo.common.service.UserService;

/**
 * Created by lixiang on 2019/6/10 0010.
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public UserEntity findUser(int id) {
        // 模仿从数据库获取数据
        UserEntity entity = new UserEntity();
        entity.setId(id);
        entity.setAge(id + 16);
        entity.setName("name");
        entity.setSex(id % 2 == 0 ? "男" : "女");
        return entity;
    }
}
