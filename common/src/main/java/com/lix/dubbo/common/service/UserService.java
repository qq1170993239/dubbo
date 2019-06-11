package com.lix.dubbo.common.service;

import com.lix.dubbo.common.entity.UserEntity;

/**
 * Created by lixiang on 2019/6/10 0010.
 */
public interface UserService {

    UserEntity findUser(int id);

}
