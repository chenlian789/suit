package com.dao.mapper;

import com.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
	public int insert(User user);
}
