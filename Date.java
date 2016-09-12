/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_testing;

import static java.lang.Math.abs;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



public class Date {
    
    public int year;
    public int month;
    public int day;
        
    public Date(int y, int m, int d) {
        year = y;
        month = m;
        day = d;
    }
    
    public int daysTo( Date pDate){
        //Will Chekc to verify all entries are within the proper limit
        //Will return -1 if the function has an input error
        //Will not return a negative number
        
        
        if(year < 0 || pDate.year < 0 ){ //Test if years is posotive
                System.out.println("Error: Years must be > 0");
                return -1;
        }
        if(month <= 0 || pDate.month <=0  ){ //Test if months is posotive
                System.out.println("Error: Months must be >= 0");
                return -1;
        }
        if(month > 12 || pDate.month  > 12   ){ //Test if months is < 13
                System.out.println("Error: Months must be <= 12");
                return -1;
        }
        if(day <= 0 || pDate.day  <= 0   ){ // Test if day is non neagtive
                System.out.println("Error: Days must be > 0");
                return -1;
        }
        if(day > 30 || pDate.day  > 30   ){ // Test if days is less then 30
                System.out.println("Error: Days must be <= 31");
                return -1;
        }
        
        int total_myDays = (year *365) + (month *30) + day; //Turn first date into days
        int total_passedDays = (pDate.year *365) + (pDate.month *30) +pDate.day; //Turn second date into days
        return abs(total_myDays - total_passedDays); //Take the posotive difference off the two
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        System.out.println("Hellow worlld"); // Test the code
        Result result = JUnitCore.runClasses(junit_testing.Junit_testing.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString()); //Print the errors
      }
    }

}



