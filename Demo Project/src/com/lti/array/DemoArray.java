package com.lti.array;
import com.lti.bean.Customer;
public class DemoArray {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // primitive data type array
         int arrayOfInt[] = new int[] {2, 3, 5};
           for (int i = 0; i < arrayOfInt.length; i++) {
            System.out.println("The " + i + " element has value  : " + arrayOfInt[i]);
           }
           char arrayOfChars[] = new char[] {'c', 'r', '1'};
           for (int i = 0; i < arrayOfChars.length; i++) {
                System.out.println("The " + i + " element has value in char  : " +  arrayOfChars[i]);
           }
         // wrapper class array
           String names[] = new String[] {"Shakir", "Priyanka", "Sumeet"};
           for (int i = 0; i < names.length; i++) {
             System.out.println("The " + i + " name is : " + names[i]);
           }
           String departmentNames[] = new String[5];
           departmentNames[0] = "Accounts";
           departmentNames[1] = "H.R.";
           departmentNames[2] = "I.T";
           departmentNames[3] = "P.R.";
           departmentNames[4] = "Sales";
           for (int i = 0; i < departmentNames.length; i++) {
             System.out.println("The " + i + " name is : " +  departmentNames[i]);
           }
           // custom array
           Customer myCustomers[] = new Customer[] {new Customer(), new Customer(), new Customer()};
           // First Recod Insert
            myCustomers[0].setCustID(101);
            myCustomers[0].setName("Sebastian");
            myCustomers[0].setAddress("US");
            myCustomers[1].setCustID(102);
            myCustomers[1].setName("Sebastian2");
            myCustomers[1].setAddress("US");
            myCustomers[2].setCustID(103);
            myCustomers[2].setName("Sebastian3");
            myCustomers[2].setAddress("US");
            // Also note that we have given i < 4 and not i < 5 - I ll explain Why.
               for (int i = 0; i <= 2; i++) {
                 System.out.println("The id of " + i + " Customer ID is :" + myCustomers[i].getCustID() + " and name is : " +  myCustomers[i].getName() + "" + myCustomers[i].getAddress());
               }
    }
}