/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturepractice;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author National University
 */
public class Lecturepractice {

    /**...3 lines...**/
    public static void main(String[] args) {
        double quotient = 0.0;
       Scanner scan = new Scanner(System.in);
       try{
           System.out.print("enter first number: ");
           double num1 = scan.nextDouble();
           System.out.print("enter second number: ");
           double num2 = scan.nextDouble();
           
           quotient = (double) num1/num2;
           System.out.println("The quotient is " + quotient);
       }
       catch (ArithmeticException e){
               System.out.println("dont divide any number from zero");
       }
       catch (InputMismatchException e){
               System.out.println("Input Mismatch");
       }
       finally{
           System.out.println ("There's something wrong with your program");
       }
      
}
}