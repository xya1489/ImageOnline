package com.jd.image.admin.mapper;

import com.jd.image.admin.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Administrator on 2017/9/26 0026.
 *
 */
@Mapper
public interface UserMapper {

     User  findById(String userId);
}
