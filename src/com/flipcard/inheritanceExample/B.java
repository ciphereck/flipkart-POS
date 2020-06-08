package com.flipcard.inheritanceExample;

public class B extends A {
	public void printB() {
		System.out.println("B " + this);
//		hi = "Hey";
	}

	@Override
	public void printAbstractA() {
		// TODO Auto-generated method stub
		System.out.println("B "+ this);
	}
	
}
