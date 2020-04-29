package com.example.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.dao.BookDao;
import com.example.dao.BorrowDao;
import com.example.dao.UserDao;
import com.example.model.Book;
import com.example.model.BorrowInfo;
import com.example.model.User;
import com.example.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BorrowServiceImpl implements BorrowService {

    /**借阅dao*/
    private final BorrowDao borrowDao;

    /**用户dao*/
    private final UserDao userDao;

    /**书籍dao*/
    private final BookDao bookDao;

    @Autowired
    public BorrowServiceImpl(BorrowDao borrowDao, UserDao userDao, BookDao bookDao) {
        this.borrowDao = borrowDao;
        this.userDao = userDao;
        this.bookDao = bookDao;
    }


    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public boolean borrowBook(JSONObject params) {
        boolean result = false;
        User userInfo = userDao.getUserInfoByUserId(params.getInteger("user_id"));
        String userType = "1";
        if (userInfo != null && userType.equals(userInfo.getUserType()) ) {
            BorrowInfo borrowInfo = new BorrowInfo();
            borrowInfo.setUserId(params.getInteger("user_id"));
            borrowInfo.setBookId(params.getInteger("book_id"));
            borrowInfo.setBorrowStartTime(params.getDate("borrow_start_time"));
            borrowInfo.setBorrowEndTime(params.getDate("borrow_end_time"));
            borrowDao.addBorrowInfo(borrowInfo);

            Book bookInfo = new Book();
            bookInfo.setBookDepreciation(10);
            bookInfo.setBookId(params.getInteger("book_id"));
            bookDao.updateBook(bookInfo);
            result = true;
        }
        return result;
    }
}
