package com.example.util;

import com.example.config.MyAnnotation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MySerializer {

	public static String serialize(Object object) throws IllegalAccessException{
		Map<String, String> jsonMap = new HashMap<>(16);
		Class<?> target = object.getClass();
		Field[] declaredFields = target.getDeclaredFields();
		for (Field field : declaredFields) {
			field.setAccessible(true);
			if (field.isAnnotationPresent(MyAnnotation.class)) {
				jsonMap.put(getSerializedKey(field), (String) field.get(object));
			}
		}
		return toJsonString(jsonMap);
	}

	private static String getSerializedKey(Field field) {
		String annotationValue = field.getAnnotation(MyAnnotation.class).value();
		if (annotationValue.isEmpty()) {
			return field.getName();
		}else {
			return annotationValue;
		}
	}

	private static String toJsonString(Map<String, String> jsonMap) {
		String elementsString = jsonMap.entrySet()
				.stream()
				.map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
				.collect(Collectors.joining(","));
		return "{" + elementsString + "}";
	}
}
