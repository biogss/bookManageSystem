package com.example.config;

import java.util.*;

public class MyArrayList<E> extends AbstractList<E>
		implements List<E>,RandomAccess, Cloneable,java.io.Serializable {

	private static final long serialVersionUID = 123456L;

	private static final int DEFAULT_CAPACITY = 10;

	private static final Object[] EMPTY_ELEMENTDATA = {};

	private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

	transient Object[] elementData;

	private int size;

	public MyArrayList(int initialCapacity) {
		if (initialCapacity > 0) {
			elementData = new Object[initialCapacity];
		}else if (initialCapacity == 0) {
			elementData = EMPTY_ELEMENTDATA;
		}else {
			throw new IllegalArgumentException("Illegal Capacity: "+ initialCapacity);
		}
	}

	public MyArrayList() {
		elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	}

	public MyArrayList(Collection<? extends E> C){
		elementData = C.toArray();
		if ((size = elementData.length) != 0) {
			if (elementData.getClass() != Object[].class) {
				elementData = Arrays.copyOf(elementData, size, Object[].class);
			}
		}else {
			elementData = EMPTY_ELEMENTDATA;
		}
	}

	public void trimToSize() {
		modCount++;
		if (size < elementData.length) {
			elementData = (size == 0) ? EMPTY_ELEMENTDATA: Arrays.copyOf(elementData, size);
		}
	}

	public void ensureCapacity(int minCapacity) {
		int minExpand = (elementData !=DEFAULTCAPACITY_EMPTY_ELEMENTDATA) ?
				0:DEFAULT_CAPACITY;
		if (minCapacity > minExpand) {
			ensureExplicitCapacity(minCapacity);
		}
	}

	public static int calculateCapacity(Object[] elementData, int minCapacity) {
		if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
			return Math.max(minCapacity, DEFAULT_CAPACITY);
		}
		return minCapacity;
	}

	private void ensureCapacityInternal(int minCapacity){
		ensureExplicitCapacity(calculateCapacity(elementData, minCapacity));
	}

	private void ensureExplicitCapacity(int minCapacity) {
		modCount++;
		if (minCapacity - elementData.length > 0) {
			grow(minCapacity);
		}
	}

	public static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

	private void grow(int minCapacity) {
		int oldCapacity = elementData.length;
		int newCapacity = oldCapacity + (oldCapacity>>1);
		if (newCapacity - minCapacity < 0) {
			newCapacity = minCapacity;
		}else if (newCapacity - MAX_ARRAY_SIZE > 0) {
			newCapacity = hugeCapacity(minCapacity);
		}
		elementData = Arrays.copyOf(elementData, newCapacity);
	}

	private static int hugeCapacity(int minCapacity) {
		if (minCapacity < 0) {
			throw new OutOfMemoryError();
		}
		return (minCapacity > MAX_ARRAY_SIZE)? Integer.MAX_VALUE:MAX_ARRAY_SIZE;
	}

	@Override
	public boolean isEmpty(){
		return size == 0;
	}



	@Override
	public E get(int index) {
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	public static void main(String[] args) {
//		System.out.println(ArrayList.class + "----------" + Arrays.toString(ArrayList.class.getInterfaces()));
//		System.out.println(MyArrayList.class + "----------" + Arrays.toString(MyArrayList.class.getInterfaces()));
	}
}
