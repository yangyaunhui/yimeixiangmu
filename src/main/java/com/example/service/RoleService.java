package com.example.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.Role;
import com.example.mapper.RoleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//这是业务层 接口省略了   cglib
//单表的业务层只需要依赖一个持久层即可,代码想当简洁
@Service
public class RoleService extends ServiceImpl<RoleMapper, Role> {

    @Resource
    private RoleMapper roleMapper;

}
