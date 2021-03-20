/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsandarray;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class examscoe {
    public static void main(String [] args){
        
        int a=0, b=0,c=0,d=0,f=0;
        int valid=0;
       int i;
       int grade[]=new int[7];
       Scanner scan = new Scanner(System.in);
        
        for(i=0; i<grade.length; i++){
        System.out.print("Exam score"+"["+(i+1)+"]: ");
        grade[i]=scan.nextInt();
        
        if (grade[i]>=90 && grade[i]<=100){
            a++;
        }
        else if (grade[i]>=80 && grade[i]<=89){
            b++;
        }
        else if (grade[i]>=70 && grade[i]<=79){
            c++;
        }
        else if (grade[i]>=60 && grade[i]<=69){
            d++;
        }
        else if (grade[i]>=0 && grade[i]<=59){
            f++;
        }
        else {
                 valid++;   
                    }
         
        }
     System.out.println("\nTotal Number of valid grades: " +(a+b+c+d+f));
    System.out.println("Number of A's: "+ a);
    System.out.println("Number of B's:  "+ b);
    System.out.println("Number of C's "+ c);
    System.out.println("Number of D's "+ d);
    System.out.println("Number of F's "+ f);
    System.out.println("Number of Invalid grade "+ valid);
}
        }
    




