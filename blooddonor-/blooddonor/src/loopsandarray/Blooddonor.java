/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsandarray;

import java.util.Scanner;

/**
 *
 * @author National University
 */
public class Blooddonor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int donor=0;
        int a= 0, b=0, c=0,d=0, e=0;
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter number of Donors: ");
        donor = scan.nextInt();
        
        String arr[] = new String[donor];
        
        
         for (int i = 0; i <arr.length; i++) {
            System.out.print("donor #" + (i+1) + ":");
            arr[i] = scan.next();
            
            if(arr[i].equals("A") || arr[i].equals("a")){
                    a=a+1;
            }
            if(arr[i].equals("B") || arr[i].equals("b")){
                    b=b+1;
            }
            if(arr[i].equals("AB") || arr[i].equals("ab")){
                    c=c+1;
            }
            if (arr[i].equals("O") || arr[i].equals("o")){
                    d=d+1;
            }
             else {
                e=e+1;
            }
         }
         System.out.println("Number of donors who donated type A: " + a);
         System.out.println("Number of donors who donated type B: " + b);
         System.out.println("Number of donors who donated type AB: " + c);
         System.out.println("Number of donors who donated type O: " + d);
         System.out.println("Number of cancelled donor: " + e);
        
        }
}
    
         
    



    



        
    
    

