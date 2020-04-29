package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.model.Book;
import com.example.model.BorrowInfo;
import com.example.model.User;
import com.example.service.BookService;
import com.example.service.BorrowService;
import com.example.service.UserService;
import com.example.util.ResultVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 借阅controller
 * @author wanghao
 */
@RestController
public class BorrowController {

	private final Logger logger = LoggerFactory.getLogger(BorrowController.class);
	@Autowired
	private BorrowService borrowService;

	@RequestMapping("/borrowBook")
	@Transactional
	public ResultVo borrowBook(@RequestBody JSONObject params) {
		logger.info(params.toJSONString());
		boolean result = borrowService.borrowBook(params);
		ResultVo resultVo = new ResultVo();
		resultVo.setResultData(result);
		return resultVo;
	}
}
