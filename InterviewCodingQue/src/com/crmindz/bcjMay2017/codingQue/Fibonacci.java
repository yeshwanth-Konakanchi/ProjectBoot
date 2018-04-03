package com.crmindz.bcjMay2017.codingQue;

public class Fibonacci {
		

	public static void main(String[] args) {
		String s = "1.0.1";
		String s1 = "1.0.2";
		
		String s2 = s.replace('.', '0');
		String s3 = s1.replace('.', '0');
		
		System.out.println(s2);
		System.out.println(s3);
		
		long i = Long.parseLong(s2);
		
		
		System.out.println(i);
	}
}
