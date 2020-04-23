package com.example.dao;

import com.example.model.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName BookDao
 * @Description TODO
 * @Author wangHao
 * @DATE 2020/4/18 15:45
 * @Version 1.0
 */
@Mapper
@Repository
public interface BookDao {

    /**
     * 根据数据名称查询书籍信息
     * @param bookName 书籍名称
     * @return List
     */
    List<Book> getBookListByBookName(@Param("bookName") String bookName);

    /**
     * 插入书籍
     * @param book 书籍对象
     * @return int
     */
    int insertBook(@Param("book") Book book);

    /**
     * 修改书籍信息
     * @param book 书籍对象
     * @return int
     */
    int updateBook(@Param("book") Book book);
}
