package com.core;

public class Apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Apple ap=new Apple();
     ap.Red(20);
     ap.Red(30, "With out seeds");
     ap.Red();
	}

	public void Red()
	{
		System.out.println("Apple is good for Health");
		
	}
	public void Red(int Price)
	{
		System.out.println("Apple price is:"+Price);
	}
	public void Red(int Price,String Hybrid)
	{
		System.out.println("Apple is Hybrid"+Hybrid);
	}
}
