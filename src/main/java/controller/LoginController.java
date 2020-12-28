package controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.Users;
import service.impl.LoginServiceImpl;

@Controller
public class LoginController {
	
	@Autowired
	LoginServiceImpl loginServiceImpl;
	
	@RequestMapping("/index")
	public String login(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");	
		Users user = loginServiceImpl.login(username, password);
		if(user!=null) {
			request.getSession().setAttribute("user",user);
			return "index.jsp";
		}else {
			return "login.jsp";
		}
	}
}
