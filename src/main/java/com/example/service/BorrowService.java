package com.example.service;

import com.alibaba.fastjson.JSONObject;
import com.example.model.Book;
import com.example.model.BorrowInfo;
import com.example.model.User;

/**
 * 借阅周期接口
 * @author wanghao
 */
public interface BorrowService {

	/**
	 * 借阅shuj
	 * @param params 参数列表
	 * @return 借阅的数据信息
	 */
	boolean borrowBook(User user, Book book, BorrowInfo borrowInfo);
}
