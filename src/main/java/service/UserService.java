package service;

import pojo.Students;

public interface UserService {
	public Students selectByUserId(String userId);
}
