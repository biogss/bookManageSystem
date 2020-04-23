package com.example.service.impl;

import com.example.dao.BorrowDao;
import com.example.model.BorrowInfo;
import com.example.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowServiceImpl implements BorrowService {

	@Autowired
	private BorrowDao borrowDao;
	@Override
	public int addBorrowInfo(BorrowInfo borrowInfo) {
		return borrowDao.addBorrowInfo(borrowInfo);
	}

	@Override
	public int updateBorrowInfo(BorrowInfo borrowInfo) {
		return borrowDao.updateBorrowInfo(borrowInfo);
	}

	@Override
	public BorrowInfo getBorrowInfoByUserIdAndBookId(String userId, String bookId) {
		return borrowDao.getBorrowInfoByUserIdAndBookId(userId, bookId);
	}
}
