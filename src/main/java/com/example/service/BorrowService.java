package com.example.service;

import com.example.model.BorrowInfo;

/**
 * 借阅周期接口
 * @author wanghao
 */
public interface BorrowService {
	/**
	 * 新增借阅周期
	 * @param borrowInfo 借阅周期信息
	 * @return int
	 */
	int addBorrowInfo(BorrowInfo borrowInfo);

	/**
	 * 更新借阅信息
	 * @param borrowInfo 借阅信息
	 * @return int
	 */
	int updateBorrowInfo(BorrowInfo borrowInfo);

	/**
	 * 根据用户id和书籍id查询定于信息
	 * @param userId 用户编号
	 * @param bookId 书籍编号
	 * @return BorrowInfo
	 */
	BorrowInfo getBorrowInfoByUserIdAndBookId(String userId, String bookId);
}
