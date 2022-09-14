package com.lti.app;

import com.lti.service.*;

public class CalcApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create the instance of the object
		
		SciCalc calc = new SciCalc();
		System.out.println("Addition-->" + calc.addition(10, 10));
		System.out.println("Subtraction-->" + calc.subtraction(10, 10));
		System.out.println("Multiplication-->" + calc.multiplication(10, 10));
		System.out.println("Division-->" + calc.division(10, 10));
		System.out.println(BasicCalc.myStaticMethod());
		
		System.out.println("Square root-->" + calc.sqrt(10));
		System.out.println("Sin-->" + calc.sinx(1.62));
	}

}
