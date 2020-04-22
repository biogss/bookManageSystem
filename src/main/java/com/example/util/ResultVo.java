package com.example.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class ResultVo {

	private final Logger logger = LoggerFactory.getLogger(ResultVo.class);

	private int errorNo;

	private String errorMsg;

	private Map<String, Object> resultData;

	public ResultVo() {
		this.errorNo = 0;
		this.errorMsg = "调用成功";
		this.resultData = new HashMap<>();
	}

	public void setErrorNo(int errorNo) {
		this.errorNo = errorNo;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public void setResultData( String key, Object data) {
		this.resultData.put(key, data);
	}
	public void setResultData( Object data) {
		this.resultData.put("dataSet", data);
	}

	public int getErrorNo() {
		return errorNo;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public Map<String, Object> getResultData() {
		return resultData;
	}
}
