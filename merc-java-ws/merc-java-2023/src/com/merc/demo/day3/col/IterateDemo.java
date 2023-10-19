package com.merc.demo.day3.col;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.merc.demo.day2.col.Blog;

public class IterateDemo {
	public static void main(String[] args) {
		List<Blog> blogList = new ArrayList<>();

		blogList.add(new Blog(11, "abc", "absccf"));
		blogList.add(new Blog(12, "def", "asddf"));
		blogList.add(new Blog(13, "asd", "xcasdsaf"));
		Iterator<Blog> iterator = blogList.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
