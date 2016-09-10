package com.test.universe;

import java.util.*;

public class PaiXu {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(12);
		list.add(4);
		list.add(21);
		list.add(41);
		
		Collections.sort(list);
		System.out.println(list.toString());
	}

}
