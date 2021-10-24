package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.User;
//在mybatis-plus中,单表的增删改查,需要继承一个BaseMapper<实体类名>
//则,该dao/mapper持久层就有了增删改查的所有功能,很简洁且功能强大
public interface UserMapper extends BaseMapper<User> {

}
