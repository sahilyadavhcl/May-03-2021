package com.hcl.may_third_training;

public interface SampleInterface {
default void hello() {
	int x = 1;
	int y = 1;
	System.out.println(x+y);
}
}
