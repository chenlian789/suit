package com.dao.readmapper;

import com.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserReadMapper {
	public List<User> queryAll();

	public User queryById(Integer id);

}
