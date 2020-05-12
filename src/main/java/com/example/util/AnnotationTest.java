package com.example.util;

import com.example.config.MyAnnotation;

/**
 * 测试自定义注解
 */
public class AnnotationTest {

	@MyAnnotation
	private String name;

	private int age;

	@MyAnnotation(value = "annotationAddress")
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
