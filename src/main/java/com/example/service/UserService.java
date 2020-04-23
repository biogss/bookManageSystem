package com.example.service;

import com.example.model.User;

import java.util.List;

/**
 * 用户服务类接口
 * @author wanghao
 */
public interface UserService {

	/**
	 * 新增用户信息
	 * @param user 用户对象
	 * @return int
	 */
	int insertUser(User user);

	/**
	 * 根据用户名查询用户信息
	 * @param userName 用户名
	 * @return list
	 */
	List<User> getUserInfoByUserName(String userName);

	/**
	 * 根据用户编号查询用户信息
	 * @param userId 用户编号
	 * @return user
	 */
	User getUserInfoByUserId(int userId);
}
