package com.flipcard.inheritanceExample;

public class InteheritanceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		C c = new C();
		D d = new D();
		
//		a.printA();
		
		b.printA(); //single
		b.printB();
		b.printAbstractA();
		System.out.println(b.hi);
		
		d.printA();
		d.printD(); //hierarchical
		d.printAbstractA();
		System.out.println(d.hi);
		
		c.printA(); //multilevel
		c.printB();	//single
		c.printC();
		System.out.println(c.hi);
	}

}
