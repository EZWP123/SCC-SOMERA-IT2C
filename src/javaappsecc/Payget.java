
 
package javaappsecc;

import java.util.Scanner;

public class Payget {
public void getPay(){
     Scanner input = new Scanner(System.in);    
    double money = 19500;
    
        
       String name;
       int birthyear, total, diff, deduction, rate, hours;
       
       
 
        System.out.print("Enter your name: ");
        name = input.nextLine();
        
        System.out.print("Enter Birthyear: ");
        birthyear = input.nextInt();
              
        System.out.print("Enter Rate per Hour: ");    
        rate = input.nextInt();
        
        System.out.print("Enter Total Hours Worked; ");
        hours = input.nextInt();
        
        System.out.print("Enter Total Deduction: ");
        deduction = input.nextInt();
        
        total = rate*hours;
        diff = total - deduction;
        
        
        
        System.out.println("August 14, 2024");
        System.out.println("hello "+name+"\nyour age is "+(2024-birthyear) );
        System.out.println("Total Gross: "+total);
        System.out.println("Total Deduction "+deduction);
        System.out.printf("Net pay: %.2f%n", (double)rate*hours-deduction);
        
    }
    
}