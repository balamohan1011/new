package com.simon.demo;

public class AlphabetNumber {

	String input="vignesh1234";


	public void result() {
		//int rev=0;
		String number=" ";
		String alpha=" ";
		for(int i=0;i<input.length();i++) {  
			char ch=input.charAt(i);

			if(Character.isDigit(ch)) {
				number=number+ch;

			}else 
			{
				alpha=alpha+ch;		
			}
		}
		System.out.println("The letetr is:"+alpha);
		System.out.println("The number is:"+number);
	}





	public static void main(String[] args) {
		AlphabetNumber a=new AlphabetNumber();
		a.result();


	}

}
