package com.hcl.may_third_training;

public class InheritanceExample implements SampleInterface {
	InheritanceExample(){
		System.out.println("Constructor of parent class");
	}
	
	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.hello();
	}
	public long A() {
		return 0;
	}
}

class SubClass extends InheritanceExample{
	SubClass(){
		super();
		System.out.println("Constructor of child class");
	}
	@Override
	public long A() {
		return 1;
	}
}
