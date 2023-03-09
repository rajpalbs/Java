package com.hamming;

public class Main{
	public static void main(String[] args){
		org.bar.MessageProvider barMessageProvider = new org.bar.MessageProvider();
		System.out.println(barMessageProvider.message());
		org.foo.MessageProvider fooMessageProvider = new org.foo.MessageProvider();
		System.out.println(fooMessageProvider.message());			
	}
}