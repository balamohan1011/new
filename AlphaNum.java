package com.simon.demo;

public class AlphaNum {

	String str="Vignesh1234";

	public void result() {

		String input1=str.replaceAll("[^a-zA-Z]","  ");        
		String input2=str.replaceAll("[^0-9]", " ");
		 

		System.out.print("The alpha is:"+input1);
		System.out.println("The numeric is:"+input2);
		

	}




	public static void main(String[] args) {

		AlphaNum a=new AlphaNum();
		a.result();
	}

}
