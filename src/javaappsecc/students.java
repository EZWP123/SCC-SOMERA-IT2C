/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappsecc;
import java.util.Scanner;

public class students {
    public void genGrade() {
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

   

