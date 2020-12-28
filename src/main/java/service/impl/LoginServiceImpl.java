package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.LoginMapper;
import pojo.Users;
import service.LoginService;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	LoginMapper loginMapper;
	@Override
	public Users login(String username, String password) {
		
		return loginMapper.Login(username, password);
	}

}
