package com.lwbldy.myBatisPlus.service.system.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lwbldy.myBatisPlus.mapper.system.UserMapper;
import com.lwbldy.myBatisPlus.model.system.User;
import com.lwbldy.myBatisPlus.service.system.IUserService;

/**
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	
	private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
	
	public Page<User> selectUserPage(Page<User> page, Integer state) {
		return page.setRecords(userMapper.selectUserList(page, state));
	}


}
