package com.corejava;

public class StringOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emptystr = " ";
		String s = "java";
		System.out.println("String" + emptystr.isEmpty());
		System.out.println("String" + emptystr.isBlank());
		System.out.println("String" + s.stripLeading());
		System.out.println("string" + s.stripTrailing());
//		char[] dest=new char[4];
//		s.getChars(0, 4, dest, 0);
//		System.out.println(Arrays.toString(dest));
//		String s1="java";
//		s1.tocharArray();

	}

}
