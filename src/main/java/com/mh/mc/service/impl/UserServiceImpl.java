package com.mh.mc.service.impl;

import com.mh.mc.entity.User;
import com.mh.mc.entity.UserExample;
import com.mh.mc.mapper.UserMapper;
import com.mh.mc.service.UserService;
import org.springframework.stereotype.Service;

/**
 * createtime:2020
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User, UserExample> implements UserService {
}
