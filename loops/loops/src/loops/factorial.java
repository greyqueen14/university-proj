/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class factorial {

  
    public static void main(String[] args) {
        int i, fact=1;  
        int num =0;  
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer: ");
        num = scan.nextInt();
        for(i=1;i<=num;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+num+" is: "+fact);    
       }  
      }  
    
    

