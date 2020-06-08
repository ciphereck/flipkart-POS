package com.flipcard.inheritanceExample;

public abstract class A {
	public final String hi = "Hi";
	public void printA() {
		System.out.println("A " + this);
	}
	
	public abstract void printAbstractA();
}
