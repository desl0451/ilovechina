package cn.ilovechina.service.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.ilovechina.dao.user.UserMapper;
import cn.ilovechina.pojo.User;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public User Login(String userCode, String userPass) {
		User user = userMapper.getLoginUser(userCode);
		if (user.getUserPassword().equals(userPass)) {
			return user;
		}
		return null;
	}

	@Override
	public boolean addNewUser(User user) {
		boolean result = false;
		try {
			if (userMapper.add(user) == 1)
				result = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
