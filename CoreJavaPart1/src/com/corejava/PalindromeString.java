package com.corejava;

import java.util.Calendar;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuffer str = new StringBuffer();
//		str.append("MOM");
//		System.out.println(str);
//		System.out.println("REVERSE :" + str.reverse());
////
//		long StartingTime = System.currentTimeMillis();
//		StringBuffer sbuffer = new StringBuffer("Hello  ");
//		for (int i = 0; i < 1000; i++) {
//			sbuffer.append("java");
//		}
//		System.out.println(
//				"Time consumed by String Buffer :" + (System.currentTimeMillis() - (StartingTime) + "milliseconds"));
//
//		StringBuilder sbuilder = new StringBuilder("Hello  ");
//		for (int i = 0; i < 1000; i++) {
//			sbuilder.append("java");
//		}
//		System.out.println(	"Time consumed by String Builder:" + (System.currentTimeMillis() - (StartingTime) + "milliseconds"));

		System.gc();
		StringBuilder stringBuilder = new StringBuilder("Vikram");
		long startTime1 = Calendar.getInstance().getTimeInMillis();
		for (long i = 0; i < 10000000; i++) {
			stringBuilder.append(i);
		}
		long endTime1 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Time taken for 10000000 appends for StringBuilder:" + (endTime1 - startTime1) + " ms");

		System.gc();
		StringBuffer stringBuffer = new StringBuffer("Vikram");
		long startTime2 = Calendar.getInstance().getTimeInMillis();
		for (long i = 0; i < 10000000; i++) {
			stringBuffer.append(i);
		}
		long endTime2 = Calendar.getInstance().getTimeInMillis();
		System.out.println("Time taken for 10000000 appends for StringBuffer:" + (endTime2 - startTime2) + " ms");

	}

}
