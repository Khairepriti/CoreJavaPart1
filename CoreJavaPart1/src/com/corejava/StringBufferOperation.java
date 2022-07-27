package com.corejava;

public class StringBufferOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("capacity" + str.capacity());
//		System.out.println("Append :" + str.append(". i like programming"));
//		System.out.println("Capacity " + str.capacity());
//		System.out.println("String length" + str.length());
//		System.out.println(str.charAt(4));
//		System.out.println(str.delete(3, 5));
//		System.out.println("Delete  " + str.deleteCharAt(5));
//		System.out.println("Reverse  " + str.reverse());
//		System.out.println("replace  " + str.replace(3, 6, "C++"));
//		System.out.println("insert " + str.insert(2, "dbms0"));
//		str.ensureCapacity(2);
//		System.out.println("Ensure capacity :" + str.capacity());
		StringBuffer sb = new StringBuffer();
		System.out.println("capacity: " + sb.capacity());
		sb.append("DataFlair");
		System.out.println("Capacity 1: " + sb.capacity());
		sb.append("DataFlair is company that teaches programming!!!");
		System.out.println("Appends capacity: " + sb.capacity());
		sb.ensureCapacity(10);
		System.out.println("ensures capacity :" + sb.capacity());
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());

	}

}
