
package javaappsecc;



public class Grades {
    
   int id;
   String name;
   double p, m, pf, f;
   double average;
   public void addGrades(int sid, String name, double prelim, double midterm, double prefinal, double finals){
  
    
        this.id = sid;
        this.name = name;
        this.pf = prefinal;
        this.m = midterm;
        this.p = prelim;
        this.f = finals;
       
    }

     public void viewGrades() {
         double average = (this.p + this.m + this.pf + this.f)/4;
         String remarks = (average > 3.0) ? "Failed" : "Passed";
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",
                          this.id, this.name, this.p, this.m, this.pf, this.f, average, remarks);

        
    }
     
}







