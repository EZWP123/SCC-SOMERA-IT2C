
package javaappsecc;

import java.util.Scanner;

public class Salaries {
    public void genSalaries() {
        Salary[] salaries;
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of employees: ");
        int emp = input.nextInt();
        salaries = new Salary[emp];

        for (int i = 0; i < emp; i++) {
            System.out.println("details of employee " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = input.nextInt();  

            System.out.print("Name: ");
            String name = input.next();  

            System.out.print("Rate: ");
            double rate = input.nextDouble();

            System.out.print("Hours Worked: ");
            double hrs = input.nextDouble();
            
            System.out.print("Total Deduction: ");
            double deduct = input.nextDouble();

            
            
            salaries[i] = new Salary(id, name, rate, hrs, deduct);
        }

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                "ID", "Name", "Rate", "Hours", "Gross", "Deduction", "Net Pay");

        for (int i = 0; i < salaries.length; i++) {
            System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f\n", 
                    salaries[i].id, salaries[i].name, salaries[i].rate, salaries[i].hoursWorked,
                    salaries[i].grossPay, salaries[i].deduction, salaries[i].netPay);
            
            
        }
    }
}
    
    
    
    
    
    
    
    
    
    

