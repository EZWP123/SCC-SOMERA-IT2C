
package javaappsecc;




public class Salary {
    
    int id;
    String name;
    double rate;
    double hoursWorked;
    double grossPay;
    double deduction;
    double netPay;

    public Salary(int id, String name, double rate, double hoursWorked, double deduction) {
        
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.hoursWorked = hoursWorked;
        this.grossPay = rate * hoursWorked;
        this.deduction = deduction;
        this.netPay = grossPay - deduction;
    }

    
    
    
    
}
