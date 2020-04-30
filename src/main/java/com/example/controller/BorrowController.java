package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.config.SystemConfig;
import com.example.config.ValueConfig;
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
import org.springframework.beans.factory.annotation.Value;
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

	@Autowired
	private SystemConfig systemConfig;

	@Autowired
	private ValueConfig valueConfig;

	@RequestMapping("/borrowBook")
	public ResultVo borrowBook(@RequestBody JSONObject params) {
        logger.error("系统参数type***********" + systemConfig.getType());
        logger.error("系统参数name***********" + valueConfig.getName());
		User user = new User();
		user.setUserId(params.getInteger("userId"));
		Book bookInfo = new Book();
		bookInfo.setBookId(params.getInteger("bookId"));
		BorrowInfo borrowInfo = new BorrowInfo();
		borrowInfo.setBookId(params.getInteger("bookId"));
		borrowInfo.setUserId(params.getInteger("userId"));
		borrowInfo.setBorrowStartTime(params.getDate("borrowStartTime"));
		borrowInfo.setBorrowEndTime(params.getDate("borrowEndTime"));
		//调用service完成借书的逻辑
		boolean result = borrowService.borrowBook(user, bookInfo, borrowInfo);
		ResultVo resultVo = new ResultVo();
		resultVo.setResultData(result);
		return resultVo;
	}
}
