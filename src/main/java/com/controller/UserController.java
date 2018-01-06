package com.controller;

import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.UserService;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/list")
	public String index(HttpServletRequest req, HttpServletResponse response)
	{
		List<User> users = userService.getUser();
		req.setAttribute("users", users);
		return "list.ftl";
	}

	@RequestMapping("/toAdd")
	public String toAdd()
	{
		return "add.ftl";
	}

	@RequestMapping("/doAdd")
	public @ResponseBody String doAdd(HttpServletRequest req, HttpServletResponse response)
	{
		String name = req.getParameter("name");
		String passwd = req.getParameter("passwd");
		User user=new User();
		user.setName(name);
		user.setPasswd(passwd);
		try{
			userService.insert(user);
			return "{\"code\":\"200\",\"status\":\"200\",\"message\":\"ok\"}";
		}catch(Exception e){
			return "{\"code\":\"500\",\"status\":\"500\",\"message\":\"内部服务异常\"}";
		}
	}
}
