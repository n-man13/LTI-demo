/**
 * 
 */
package com.lti.service;

/**
 * @author user101
 *
 */
public class BasicCalc {

	// methods
	// these are all instanced methods
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	public int subtraction(int a, int b) {
		return a-b;
	}
	
	public int multiplication(int a, int b) {
		return a*b;
	}
	public int division(int a, int b) {
		return a/b;
	}
	
	//static methods can be called by class name
	
	public static String myStaticMethod() {
		return "This is static";
	}
}
