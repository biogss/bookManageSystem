package com.example.test;

import com.example.config.MyLink;

import java.lang.reflect.Field;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreadLocalDemo {

//	threadLocalMap createMap () {
//		return new threadLocalMap();
//	}
//	static class threadLocalMap {
//
//	}

	public static void main(String[] args) {

		MyLink<String> strLink = new MyLink<>();
		strLink.addLast("java1");
		strLink.addLast("java2");
		strLink.addLast("java3");
		strLink.addLast("java4");
		strLink.addFirst("php");
		strLink.delete("java3");
		System.out.println(strLink.delete("adb"));
		System.out.println(strLink.getElement(1));
//		System.out.println(strLink.getElement(5));
		int size = strLink.size();
		for (int i = 0; i< size; i++) {
			System.out.println(strLink.getElement(i));
		}
//		String str1 = new String("123");
//		String str2 = new String("123");
//		System.out.println(str1.intern());
//		System.out.println(str2.intern());
//		System.out.println(str1 == str2);
//		ThreadLocalDemo threadLocalDemo = new ThreadLocalDemo();
//		System.out.println(threadLocalDemo.createMap());
//		System.out.println(threadLocalDemo.createMap());

//		ThreadLocal<String> threadLocal = new ThreadLocal<>();
//		for (int i = 0; i < 10; i++) {
//			threadLocal.set(String.valueOf(i));
//			System.out.println(threadLocal.get());
//		}
//		int[] arrays = new int[10];
//		System.out.println(arrays.length);
//		int[] arraysNew = Arrays.copyOf(arrays, 5);
//		System.out.println(arraysNew.length);
//		try {
//			List<String> list1 = new ArrayList<>();
//			List<String> list2 = new ArrayList<>();
//			Class class1 = list1.getClass();
//			Class class2 = list2.getClass();
//			Field data1 = class1.getDeclaredField("DEFAULTCAPACITY_EMPTY_ELEMENTDATA");
//			Field data2 = class2.getDeclaredField("DEFAULTCAPACITY_EMPTY_ELEMENTDATA");
//			System.out.println(data1==data2);
//		}
//		catch (NoSuchFieldException e) {
//			e.printStackTrace();
//		}
	}
}
