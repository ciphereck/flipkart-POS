package com.flipcard.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();
		
		System.out.println(al.size());
		
		al.add("Delhi");
		al.add("Male");
		al.add("Mumbai");
		al.add("Pune");
		
		System.out.println(al.size());
		
		al.remove("Male");
		al.remove(0);
		
		System.out.println(al);
		
		al.add("Mudit");
		al.add("Mudit");
		
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String value : al) {
			System.out.println(value);
		}
	}

}
