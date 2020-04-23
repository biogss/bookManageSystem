package com.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.model.User;
import com.example.service.UserService;
import com.example.util.ResultVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户controller
 * @author wanghao
 */
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	private final Logger logger = LoggerFactory.getLogger(UserController.class);

	@RequestMapping("/addUser")
	public ResultVo addUser(@RequestBody User user) {
		logger.info(user.toString());
		int rows = userService.insertUser(user);
		ResultVo resultVo = new ResultVo();
		resultVo.setResultData(rows);
		return resultVo;
	}

	@RequestMapping("/getUserInfoByUserName")
	public ResultVo getUserInfoByUserName(@RequestBody JSONObject userParam) {
		logger.info(userParam.toJSONString());
		List<User> userList = userService.getUserInfoByUserName(userParam.getString("userName"));
		ResultVo resultVo = new ResultVo();
		resultVo.setResultData(userList);
		return resultVo;
	}
}
