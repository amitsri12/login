package com.core.Logical.fabnaocci;

public class C {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int c=0;
	for(int i=1;i<10;i++) {
		c=a+b;//2,3,5
		System.out.print(" "+c);
		a=b;//1,2,3
		b=c;//2,3,5
	}
}
}
