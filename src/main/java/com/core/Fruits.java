package com.core;

public class Fruits implements PineApple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Fruits ft=new Fruits();
        ft.CherryPrice();
        ft.GuavaPrice();
       ft.PineApplePrice();
	}

	public void Red() {
		System.out.println("Cherry");
		
	}

	public void CherryPrice() {
		System.out.println("Cherry price is 50");
		
	}

	public void Green() {
		System.out.println("Guava");
		
	}

	public void GuavaPrice() {
		System.out.println("Guava price is 40");
		
	}

	public void yellow() {
		System.out.println("PineApple");
		
	}

	public void PineApplePrice() {
		System.out.println("PineApple price is 30");
		
	}

}
