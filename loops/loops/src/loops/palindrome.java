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
public class palindrome {
    public static void main(String args[]){  
        int a,sum=0,temp;    
        int num;
          
        Scanner scan = new Scanner(System.in);
          System.out.print("Enter a number: ");
          num = scan.nextInt();
          temp = num;
          
          while(num>0){    
           a=num%10;   
           sum=(sum*10)+a;    
           num=num/10;    
          }    
          if(temp==sum)    
           System.out.println("palindrome number ");    
          else    
           System.out.println("not palindrome");    
        }  
       }  

