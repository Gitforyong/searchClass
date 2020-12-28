package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.Students;
import service.impl.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@RequestMapping("/usersInfo/{userId}")
	public String getUserInfo(@PathVariable("userId") String userId,HttpServletRequest request) {
		Students userInfo = userServiceImpl.selectByUserId(userId);
		request.getSession().setAttribute("userInfo",userInfo);
		System.out.println(userInfo);
		return "/usersDetailInfo.jsp";
	}
	
}
