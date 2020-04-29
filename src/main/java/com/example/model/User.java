package com.example.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class User {

	/**用户编号*/
	private int userId;

	/**用户名*/
	private String userName;

	/**密码*/
	private String password;

	/**手机号*/
	private String mobileNo;

	/**用户类型*/
	private String userType;

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
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
		return "User{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				", password='" + password + '\'' +
				", mobileNo='" + mobileNo + '\'' +
				", userType='" + userType + '\'' +
				", createDate=" + createDate +
				", updateDate=" + updateDate +
				'}';
	}
}
