

package javaappsecc;

import java.util.Scanner;


public class JavaAppSecC {
    public static void main(String[] args) {
//        
//    Payget pg = new Payget();
//    pg.getPay();
//        
//    }
//    
//}

//        Product pr = new Product();
//        pr.addProduct(1011, "soap",20,30,20.00);
//        pr.viewProduct();
//            }
//Grades gr = new Grades();
//Scanner sc = new Scanner (System.in);
//
//
//    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
//                      "Student ID", "Name", "Prelim", "Midterm", "Prefinal", "Final", "Average", "Remarks"); 
//
//gr.addGrades(1001, "Mike",1.0,1.0, 1.0, 1.0);
//gr.viewGrades();
//
//Grades gr1 = new Grades ();
//gr1.addGrades(1002, "john", 2.2, 1.0, 1.0, 1.0);
//gr1.viewGrades();
//
//}
//}


        Scanner sc = new Scanner(System.in);
        Grades[] gr = new Grades[100];

        System.out.println("Enter number of students:");
        int nums = sc.nextInt();

        for (int i = 0; i < nums; i++) {
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
    }
}
