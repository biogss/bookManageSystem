package com.example.dao;

import com.example.model.BorrowInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 借阅周期实例类
 * @author wanghao
 */
@Mapper
@Repository
public interface BorrowDao {

	/**
	 * 新增借阅周期
	 * @param borrowInfo 借阅周期信息
	 * @return int
	 */
	int addBorrowInfo(@Param("borrowInfo")BorrowInfo borrowInfo);

	/**
	 * 更新借阅信息
	 * @param borrowInfo 借阅信息
	 * @return int
	 */
	int updateBorrowInfo(@Param("borrowInfo")BorrowInfo borrowInfo);

	/**
	 * 根据用户id和书籍id查询定于信息
	 * @param userId 用户编号
	 * @param bookId 书籍编号
	 * @return BorrowInfo
	 */
	BorrowInfo getBorrowInfoByUserIdAndBookId(@Param("userId") String userId, @Param("bookId") String bookId);
}
