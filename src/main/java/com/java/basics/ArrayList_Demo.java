package com.java.basics;

import java.util.ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		
			ArrayList<String> list = new ArrayList<>();
			
			list.add("Ajaaj");
			list.add("Rahul");
			list.add("Akku");
			
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
	}

}
