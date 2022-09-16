package com.lti.condition;

public class SwitchDemo {

	public static void main(String[] args) {  
	    //Declaring a variable for switch expression  
	    int number=21;  
	    //Switch expression  
	    // for designing menu, we take input from user and using a for loop for continuous execution until exit case is called
	    switch(number){  
	    //Case statements  
	    case 10: System.out.println("10");  
	    break;  
	    case 20: System.out.println("20");  
	    break;  
	    case 30: System.out.println("30");  
	    break;  
	    //Default case statement  
	    default:System.out.println("Not in 10, 20 or 30");  
	    }  
	}

}
