package com.example.model;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName Book
 * @Description 书籍实例类
 * @Author wangHao
 * @DATE 2020/4/18 15:34
 * @Version 1.0
 */
@Component
public class Book {

    /**书籍编号*/
    private int bookId;

    /**书籍名称 */
    private String bookName;

    /**书籍代码 */
    private String bookCode;

    /**书籍价格 */
    private BigDecimal bookPrice;

    /**书籍类型 */
    private String bookType;

    /**书籍作者 */
    private String bookAuthor;

    /**书籍出版社 */
    private String bookPublishingHouse;

    /**书籍折旧率 */
    private int bookDepreciation;

    /**书籍封面 */
    private String bookCover;

    /**书籍状态 */
    private String bookStatus;

    /**书籍描述 */
    private String bookDesc;

    /**书籍出版时间 */
    private Date bookPublishDate;

    /**数据创建时间 */
    private Date createDate;

    /**数据更新时间 */
    private Date updatedate;


    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublishingHouse() {
        return bookPublishingHouse;
    }

    public void setBookPublishingHouse(String bookPublishingHouse) {
        this.bookPublishingHouse = bookPublishingHouse;
    }

    public int getBookDepreciation() {
        return bookDepreciation;
    }

    public void setBookDepreciation(int bookDepreciation) {
        this.bookDepreciation = bookDepreciation;
    }

    public String getBookCover() {
        return bookCover;
    }

    public void setBookCover(String bookCover) {
        this.bookCover = bookCover;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }

    public Date getBookPublishDate() {
        return bookPublishDate;
    }

    public void setBookPublishDate(Date bookPublishDate) {
        this.bookPublishDate = bookPublishDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookCode='" + bookCode + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookType='" + bookType + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPublishingHouse='" + bookPublishingHouse + '\'' +
                ", bookDepreciation=" + bookDepreciation +
                ", bookCover='" + bookCover + '\'' +
                ", bookStatus='" + bookStatus + '\'' +
                ", bookDesc='" + bookDesc + '\'' +
                ", bookPublishDate=" + bookPublishDate +
                ", createDate=" + createDate +
                ", updatedate=" + updatedate +
                '}';
    }
}
