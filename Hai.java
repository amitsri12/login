package com.core.Logical.fabnaocci;

public class Hai {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int c=0;
	System.out.print(a);
	for(int i=0;i<=10;i++) {
		c=a+b;
		System.out.print(" " +c);
		a=b;
		b=c;
	}
}
}