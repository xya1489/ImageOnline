package com.jd.image.admin.service.impl;

import com.jd.image.admin.entity.User;
import com.jd.image.admin.mapper.UserMapper;
import com.jd.image.admin.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/9/26 0026.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findById(String id) throws Exception {
        return userMapper.findById(id);
    }
}
