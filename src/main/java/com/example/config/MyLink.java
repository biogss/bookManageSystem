package com.example.config;

import java.util.NoSuchElementException;

public class MyLink<E> {

	private Node<E> head = null;

	private int count = 0;

	public void addFirst(E e) {
		Node<E> temp = new Node<>(e);
		if (head == null) {
			head = temp;
			temp.next = null;
		}else {
			temp.next = head;
			head = temp;
		}
		count++;
	}

	public void addLast(E e) {
		Node<E> temp = new Node<>(e);
		if (head == null) {
			head = temp;
			temp.next = null;
		}else {
			Node<E> p = head;
			while (p.next != null) {
				p = p.next;
			}
			p.next = temp;
			temp.next = null;
		}
		count++;
	}

	public boolean delete(E e) {
		if (head == null) {
			return false;
		}else {
			Node<E> temp = head;
			while (temp.next != null && !e.equals(temp.next.item)) {
				temp = temp.next;
			}
			if (temp.next == null) {
				return false;
			} else {
				temp.next = temp.next.next;
				count--;
				return true;
			}
		}
	}

	public E getElement(int index) {
		if (head == null) {
			throw new NoSuchElementException();
		}else if (index > count || index < 0) {
			throw new NoSuchElementException();
		}else {
			Node<E> temp = head;
			for (int i = 0; i< index; i++) {
				temp = temp.next;
			}
			return temp.item;
		}
	}

	public int size() {
		return count;
	}


	private static class Node<E> {
		E item;
		Node<E> next;

		 Node (E e) {
			this.item = e;
		}
	}
}
