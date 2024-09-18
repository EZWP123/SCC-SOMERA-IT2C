/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappsecc;
import java.util.Scanner;

public class students {
    
    public void editGrades(Grades[] grs, int size, int id){
    Scanner sc = new Scanner (System.in);
    
    for(int i = 0; i < size; i++){
            if(grs[i].id == id){
                System.out.println("New Prelim Grade: ");
                double prelim = sc.nextFloat();
                grs[i].p = prelim;
           
             System.out.println("New Midterm Grade: ");
                double midterm = sc.nextFloat();
                grs[i].m = midterm;
        
              System.out.println("New PreFinal Grade: ");
                double prefinal = sc.nextFloat();
                grs[i].pf = prefinal;
    
                System.out.println("New Final Grade: ");
                double finals = sc.nextFloat();
                grs[i].f = finals;
    }
    }
    }

    @SuppressWarnings("empty-statement")
    public void genGrade(){
        Scanner sc = new Scanner(System.in);
        Grades[] gr = new Grades[100];

        String op;
        int nums = 0;
        
        do{
            
           System.out.println("Welcome to Grading App");
        System.out.println("-------------------------------------");
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        System.out.println("-------------------------------------"); 
            
            System.out.print("Enter Action: ");
        int option = sc.nextInt();

        while(option > 5){
            System.out.print("Invalid Action. Try Again: ");
            option = sc.nextInt();
        }
            
            
    
            switch(option){
                

            case 1:
                System.out.print("Enter no. of Students: ");
                nums = sc.nextInt();
             for(int i = 0; i<nums; i++){
            System.out.println("Enter details of student " + (i + 1) + ":");
            System.out.println("ID:");
            int id = sc.nextInt();
            System.out.println("Name:");
            String name = sc.next();
            System.out.println("Prelim:");
            double pr = sc.nextDouble();
            System.out.println("Midterm:");
            double md = sc.nextDouble();
            System.out.println("Prefinal:");
            double pf = sc.nextDouble();
            System.out.println("Finals:");
            double fn = sc.nextDouble();

            gr[i] = new Grades();
            gr[i].addGrades(id, name, pr, md, pf, fn);
        }

        for (int i = 0; i < nums; i++) {
            gr[i].viewGrades();
        }
            break;
            case 2:
                for(int i=0; i < nums; i++){
                    gr[i].viewGrades();
    }
            break;
            case 3:
                System.out.println("Enter the ID to update: ");
                int ids = sc.nextInt();
                System.out.println(""+ids);
                editGrades(gr, nums, ids);
            break;
            }
                
            System.out.println("Do you want to continue?(Y/N): ");
            op=sc.next();
        }while(op.equals("Y")|| op.equals("y"));

    
            
        
      
            }  
}
