package com.core;

public class UsaStates extends Usa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      UsaStates us=new UsaStates();
      us.Chicago();
      us.NorthCarolina();
	}
    public  void California()
    {
    	System.out.println("California");
    }
	@Override
	public void NorthCarolina() {
		// TODO Auto-generated method stub
		System.out.println("NorthCarolina");
	}
	@Override
	public void NewYork() {
		// TODO Auto-generated method stub
		System.out.println("NewYork");
	}
}
