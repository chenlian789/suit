package com.service;

import java.util.List;

import com.dao.mapper.UserMapper;
import com.dao.readmapper.UserReadMapper;
import com.utils.UuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pojo.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserReadMapper userReadMapper;

	public List<User> getUser()
	{
		return userReadMapper.queryAll();
	}

	public User queryById(Integer id){
		return userReadMapper.queryById(id);
	}

	public int insert(User user){
		user.setUserId(UuidUtil.getUid("wx"));
		return userMapper.insert(user);
	}
}
