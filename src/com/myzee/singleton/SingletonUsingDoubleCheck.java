/*
 * Double check: thread safe singleton class
 * using synchronized block to access only one thread at time.
 */

package com.myzee.singleton;

public class SingletonUsingDoubleCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singletonex s1 = Singletonex.getSingletonInstance();
		Singletonex s2 = Singletonex.getSingletonInstance();
	}

}

class Singletonex {
	private static Singletonex  instance = null;
	private Singletonex() {
	}
	
	public static synchronized Singletonex getSingletonInstance() {
		if(instance == null) {
			synchronized(Singletonex.class) {
				instance = new Singletonex();
			}
			System.out.println("creating new instance : should execute onle once ");
		}
		return instance;
	}
}

//class A{
static class StaticClass{
	
}
//}
