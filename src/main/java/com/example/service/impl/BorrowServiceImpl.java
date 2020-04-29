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
    public boolean borrowBook(User user, Book bookInfo, BorrowInfo borrowInfo) {
        boolean result = false;
        User userInfo = userDao.getUserInfoByUserId(user.getUserId());
        String userType = "1";
        if (userInfo != null && userType.equals(userInfo.getUserType()) ) {
            borrowDao.addBorrowInfo(borrowInfo);
            bookInfo.setBookDepreciation(10);
            bookDao.updateBook(bookInfo);
            result = true;
        }
        return result;
    }
}
