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
public class fibonnaci {
      public static void main(String[]args){
              
        int n1=0,n2=1,n3=0,i,count=0; 
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        count = scan.nextInt();
        System.out.print(n1+" "+n2); 

        for(i=2;i<count;++i){ 
         n3=n1+n2;      
         System.out.print(" " +n3);
         n1=n2;    
         n2=n3;    
        }    

       }}  


