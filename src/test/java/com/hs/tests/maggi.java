package com.hs.tests;

public class maggi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String na="manju";
		System.out.println(na);
		String s="sandy";
		System.out.println(s);
		na=na+s;
		System.out.println(na);
		
		StringBuffer sb= new StringBuffer("manju").append(s);
		System.out.println(sb);
		
		StringBuffer sb1= new StringBuffer("manju").reverse();
		System.out.println(sb1);

	}

}
