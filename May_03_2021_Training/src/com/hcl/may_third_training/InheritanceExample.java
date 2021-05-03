package com.hcl.may_third_training;

public class InheritanceExample {
	InheritanceExample(){
		System.out.println("Constructor of parent class");
	}
	public static void main(String[] args) {
		SubClass obj = new SubClass();
	}
}

class SubClass extends InheritanceExample{
	SubClass(){
		super();
		System.out.println("Constructor of child class");
	}
}
