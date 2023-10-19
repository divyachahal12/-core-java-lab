package com.merc.demo.day3.col;

import java.util.ArrayList;
import java.util.List;

import com.merc.demo.day2.col.Blog;
import com.merc.oop.Employee;

public class WildDemo {
	static void printList(List<?> list) {

	}

	static void printList2(List<? extends Employee> list) {

	}

	public static void main(String[] args) {

		List<Blog> blogList = new ArrayList<>();
		WildDemo.printList(blogList);
		List<Employee> empList = new ArrayList<>();
		WildDemo.printList2(empList);

	}
}
