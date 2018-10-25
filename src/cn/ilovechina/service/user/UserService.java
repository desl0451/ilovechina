package cn.ilovechina.service.user;

import cn.ilovechina.pojo.User;

public interface UserService {
	public User Login(String userCode, String userPass);

	public boolean addNewUser(User user);
}
