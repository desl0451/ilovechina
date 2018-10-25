package cn.ilovechina.dao.user;

import org.apache.ibatis.annotations.Param;

import cn.ilovechina.pojo.User;

public interface UserMapper {
	/**
	 * ͨ��userCode��ȡUser
	 * 
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public User getLoginUser(@Param("userCode") String userCode);

	/**
	 * ���
	 * 
	 * @param user
	 * @return
	 */
	public int add(User user);

	/**
	 * �޸�
	 */
}
