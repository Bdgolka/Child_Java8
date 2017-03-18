package com.bdgolka.lambda;


//Generic functional interface
//that returns boolean type
interface SomeTest<T> {
	boolean test(T n, T m);
}
