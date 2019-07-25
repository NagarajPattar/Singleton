/*
 * private constructor
 * not sure for multithreaded environment. If one or more threads creating the instances in same time it voilate the singleton rule.
 * It will solved by double checking
 */
package com.myzee.singleton;


public class TestSingleton {
	public static void main(String[] args) {
		SingletonExample s1 = SingletonExample.getSingletonInstance();
		s1.a = 10;
		SingletonExample s2 = SingletonExample.getSingletonInstance();
		System.out.println(s2.a);
	}
}

class SingletonExample {
	int a;
	// Static member holds only one instance of the
	// SingletonExample class
	private static SingletonExample singletonInstance;

	// private SingletonExample constructor prevents any other class from instantiating
	private SingletonExample() {
	}

	// Providing Global point of access
	public static SingletonExample getSingletonInstance() {
		if (null == singletonInstance) {
			singletonInstance = new SingletonExample();
			System.out.println("creating new instance");
		}
		return singletonInstance;
	}

	public void printSingleton() {
		System.out.println("Inside print Singleton");
	}
}