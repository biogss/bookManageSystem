package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Override
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public List<User> getUserInfoByUserName(String userName) {
		return userDao.getUserInfoByUserName(userName);
	}

	@Override
	public User getUserInfoByUserId(int userId) {
		return userDao.getUserInfoByUserId(userId);
	}
}
