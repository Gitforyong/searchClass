package service;


import pojo.Users;


public interface LoginService {
	
	public Users login(String username, String password);
}
