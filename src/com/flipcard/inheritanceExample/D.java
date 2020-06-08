package com.flipcard.inheritanceExample;

public class D extends A {
	public void printD() {
		System.out.println("D " + this);
	}

	@Override
	public void printAbstractA() {
		// TODO Auto-generated method stub
		System.out.println("D " + this);
	}
}
