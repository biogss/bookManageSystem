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
	private BookService bookService;

	@Autowired
	private UserService userService;

	@RequestMapping("/borrowBook")
	public ResultVo borrowBook(@RequestBody JSONObject params) {
		logger.info(params.toJSONString());

		User userInfo = userService.getUserInfoByUserId(params.getInteger("userId"));
		if (userInfo != null && "1".equals(userInfo.getUserType())) {
			BorrowInfo borrowInfo = new BorrowInfo();
			borrowInfo.setBookId(params.getInteger("bookId"));
			borrowInfo.setUserId(params.getInteger("userId"));
			borrowInfo.setBorrowStartTime(params.getDate("borrowStartTime"));
			borrowInfo.setBorrowEndTime(params.getDate("borrowEndTime"));
			borrowService.addBorrowInfo(borrowInfo);

			Book book = new Book();
			book.setBookId(params.getInteger("bookId"));
			book.setBookDepreciation(10);
			bookService.updateBook(book);
		}
		ResultVo resultVo = new ResultVo();
		return resultVo;
	}
}
