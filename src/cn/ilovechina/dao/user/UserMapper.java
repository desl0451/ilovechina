package cn.ilovechina.dao.user;

import org.apache.ibatis.annotations.Param;

import cn.ilovechina.pojo.User;

public interface UserMapper {
	/**
	 * 通过userCode获取User
	 * 
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public User getLoginUser(@Param("userCode") String userCode);

	/**
	 * 添加
	 * 
	 * @param user
	 * @return
	 */
	public int add(User user);

	/**
	 * 修改
	 */
}
