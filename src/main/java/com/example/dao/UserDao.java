package com.example.dao;

import com.example.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户类DAO
 * @author wanghao
 */
@Mapper
@Repository
public interface UserDao {

	/**
	 * 新增用户
	 * @param user user对象
	 * @return int
	 */
	int insertUser(@Param("userInfo")User user);

	/**
	 * 根据用户名查询产品
	 * @param userName 用户名
	 * @return list
	 */
	List<User> getUserInfoByUserName(@Param("userName") String userName);

	/**
	 * 根据用户编号查询产品
	 * @param userId 用户编号
	 * @return user
	 */
	User getUserInfoByUserId(@Param("userId") int userId);
}
