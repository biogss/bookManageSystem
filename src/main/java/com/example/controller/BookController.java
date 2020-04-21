package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.model.Book;
import com.example.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @ClassName bookController
 * @Description TODO
 * @Author wangHao
 * @DATE 2020/4/18 16:37
 * @Version 1.0
 */

@RestController
public class BookController {

    Class clazz;
    private final Logger logger = LoggerFactory.getLogger(BookController.class);
    @Autowired
    private BookService bookService;

    @RequestMapping("/getBookByName")
    public List<Book> getBook(@RequestBody String bookName){
        logger.error("getBookByName入参为：" + bookName.toString());
        JSONObject jsonObject = JSON.parseObject(bookName);
        return bookService.getBookListByBookName(jsonObject.getString("bookName"));
    }


    @RequestMapping("/insertBook")
    public int insertBook(@RequestBody Book params) {
        logger.error("insertBook：" + params.toString());
        return bookService.insertBook(params);
    }

}
