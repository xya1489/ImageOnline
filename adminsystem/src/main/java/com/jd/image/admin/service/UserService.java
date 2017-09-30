package com.jd.image.admin.service;

import com.jd.image.admin.entity.User;

/**
 * Created by Administrator on 2017/9/26 0026.
 */
public interface UserService {

    User findById(String id)throws Exception;

}
