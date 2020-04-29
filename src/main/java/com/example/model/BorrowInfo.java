package com.example.model;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 借阅信息实例
 */
@Component
public class BorrowInfo {

	/**用户编号*/
	private int userId;

	/**书籍编号*/
	private int bookId;

	/**借阅开始时间*/
	private Date borrowStartTime;

	/**借阅结束时间*/
	private Date borrowEndTime;

	/**创建时间*/
	private Date createDate;

	/**更新时间*/
	private Date updateDate;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public Date getBorrowStartTime() {
		return borrowStartTime;
	}

	public void setBorrowStartTime(Date borrowStartTime) {
		this.borrowStartTime = borrowStartTime;
	}

	public Date getBorrowEndTime() {
		return borrowEndTime;
	}

	public void setBorrowEndTime(Date borrowEndTime) {
		this.borrowEndTime = borrowEndTime;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "BorrowInfo{" +
				"userId=" + userId +
				", bookId=" + bookId +
				", borrowStartTime=" + borrowStartTime +
				", borrowEndTime=" + borrowEndTime +
				", createDate=" + createDate +
				", updateDate=" + updateDate +
				'}';
	}
}
