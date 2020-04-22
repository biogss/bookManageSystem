package com.example.service;

import com.example.model.Book;

import java.util.List;

/**
 * @ClassName BookService
 * @Description 书籍服务接口
 * @Author wangHao
 * @DATE 2020/4/18 16:21
 * @Version 1.0
 */
public interface BookService {
    /**
     * 根据数据名称查询书籍信息
     * @param bookName
     * @return List
     */
    List<Book> getBookListByBookName(String bookName);

    /**
     * 插入书籍
     * @param book
     * @return
     */
    int insertBook(Book book);

    /**
     * 修改书籍信息
     * @param book
     * @return int
     */
    int updateBook(Book book);
    
}
