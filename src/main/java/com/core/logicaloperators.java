package com.core;

public class logicaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a=10;
		 int b=20;
		 int c=30;
		 int d=45;
		 int e=30;
		 int f=60;
		 System.out.println((a>b&&b>a));
		 System.out.println((e<f&&d>f));
		 System.out.println((d<c&&f>b));
		 System.out.println((e>=f||a<d));
		 System.out.println((c>e||d<f));
	}

}
