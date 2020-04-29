package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.model.Book;
import com.example.service.BookService;
import com.example.util.ResultVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    private final Logger logger = LoggerFactory.getLogger(BookController.class);
    @Autowired
    private BookService bookService;

    @RequestMapping("/getBookByName")
    @Transactional
    public ResultVo getBook(@RequestParam("bookName") String bookName){
        ResultVo resultVo = new ResultVo();
        logger.info("getBookByName入参为：" + bookName);
        List<Book> bookList =  bookService.getBookListByBookName(bookName);
        logger.info("第一次查询结果："  + bookList.get(0).toString());
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Book> bookList2 =  bookService.getBookListByBookName(bookName);
        logger.info("第二次查询结果："  + bookList2.get(0).toString());
        resultVo.setResultData(bookList);
        return resultVo;
    }


    @RequestMapping("/insertBook")
    public int insertBook(@RequestBody Book params) {
        logger.info("insertBook：" + params.toString());
        return bookService.insertBook(params);
    }

    @RequestMapping("/updateBook")
    public ResultVo updateBook(@RequestBody Book book) {
        logger.info("updateBook" + book);
        int row = bookService.updateBook(book);
        ResultVo resultVo = new ResultVo();
        resultVo.setResultData(row);
        return resultVo;
    }

}
