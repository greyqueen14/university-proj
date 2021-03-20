/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservation;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class BusReservation {
     
    public static String departure, destination, oras, date, quantity="";
    public static int bus, da = 0;
    public static double price, total = 0; 
    public static void main(String[] args) {
         ImageIcon icon = new ImageIcon("E:/BusReservation/test/travel_bus.png");
        JOptionPane.showMessageDialog(null, "WELCOME TO KYOYA TERMINAL BUS RESERVATION TICKET",
                "Ticket", JOptionPane.PLAIN_MESSAGE, icon);
        
          String name= (String) JOptionPane.showInputDialog(null, "Enter Passenger name", "Ticket", 
                                                                JOptionPane.PLAIN_MESSAGE, icon, null, " ");
          deps();
          JOptionPane.showMessageDialog(null,"Passenger name: "+name+"\n"+departure+" - "+destination+"\nPrice: "+price+"php"+"\nDeparture Day: "+date+
                                    "\nDeparture Time: "+oras +"\nBus#: "+bus+"\nQuantity: "+quantity+"\nTotal amount: "+total+"php",
                                     "Ticket",JOptionPane.PLAIN_MESSAGE, icon);
          yesno();
          JOptionPane.showMessageDialog(null, "Thank you and Have a safe trip!!", "Ticket", 
                  JOptionPane.PLAIN_MESSAGE, icon);
    }

    private static void deps() {
         ImageIcon icon = new ImageIcon("E:/BusReservation/test/travel_bus.png");
        String [] dep = {"departure City","Caloocan, Metro Manila", "Kamias, Quezon City", "Sampaloc, Metro Manila",
                        "Cubao, Quezon City", "Ermita, Metro Manila"};
            departure = (String) JOptionPane.showInputDialog(null, "Departure City (From)", "Ticket", 
                                                                JOptionPane.PLAIN_MESSAGE, null,
                                                                dep, dep[0]);
            String [] des= {"Available Destination","Clark, Pampanga", "Naga city, Camarines Sur", 
                            "Legazpi City, Albay","Daet, Camarines Norte", "Donsol, Sorsogon", "Casiguran, Sorsogon",
                            "Iloilo City, Iloilo", "Ormoc City, Leyte"};
            destination = (String) JOptionPane.showInputDialog(null, "Destination City (To)", "Ticket", 
                                                                JOptionPane.PLAIN_MESSAGE, null, des, des[0]);
            date = (String) JOptionPane.showInputDialog(null, "Departure Date: ", "Ticket", 
                                                                JOptionPane.PLAIN_MESSAGE, icon, null, " ");
            String[] time = {"Time slot ","5:00 AM", "7:30 AM", "10:00 AM", "3:00 PM", "5:30 PM", "7:00 PM"};
            oras = (String) JOptionPane.showInputDialog(null, 
                "Time","Ticket",JOptionPane.PLAIN_MESSAGE, null, time, time[0]);
            bus();
    }

    private static void bus() {
      Random r = new Random(System.currentTimeMillis());
            bus = (r.nextInt(10000) * 0001);
            prices();
    }

    private static void prices() {       
       String quans[] = {"quantity", "1", "2","3", "4", "5"};
        quantity = (String) JOptionPane.showInputDialog(null, 
                "Quantity(max. of 5)","Ticket",JOptionPane.PLAIN_MESSAGE, null, quans, quans[0]);
        String [] des= {"Available Destination","Clark, Pampanga", "Naga city, Camarines Sur", "Legazpi City, Albay",
                        "Daet, Camarines Norte", "Donsol, Sorsogon", "Casiguran, Sorsogon", 
                        "Iloilo City, Iloilo", "Ormoc City, Leyte"};
           price=0;
         da = Integer.parseInt(quantity);
      
            if(destination.equals(des[1])){
                 price = 300.00;
                 total = da*price;
                 total = Math.round(total *100.0)/ 100.0;
                 
             
             }
                else if (destination.equals(des[2])){
                    price = 627.00;
                    total = da*price;
                    total = Math.round(total *100.0)/ 100.0;

                }
                else if (destination.equals(des[3])){
                    price = 795.30;
                    total = da*price;
                    total = Math.round(total *100.0)/ 100.0;

                }
                else if (destination.equals(des[4])){
                    price = 551.10;
                    total = da*price;
                   total = Math.round(total *100.0)/ 100.0;

                }
                else if (destination.equals(des[5])){
                     price = 875.50;
                     total = da*price;
                     total = Math.round(total *100.0)/ 100.0;
                }
                else if (destination.equals(des[6])){
                  price = 905.85;
                  total = da*price;
                  total = Math.round(total *100.0)/ 100.0;
                }
                else if (destination.equals(des[7])){
                    price = 762.30;
                    total = da*price;
                    total = Math.round(total *100.0)/ 100.0;
                }
                else if (destination.equals(des[8])){
                     price = 1567.50;
                     total = da*price;
                     total = Math.round(total *100.0)/ 100.0;
                }
                     else{
                             System.exit(0);
                 }

            
}
     private static void yesno() {
       Object[] options = { "YES", "NO" };
          int choice = JOptionPane.showOptionDialog(null,"are you sure with your reservation?","Ticket", 
                  JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null, options, options[0]);

         if (choice == JOptionPane.YES_OPTION){
         }
         else{
             System.exit(0);
           
  }
}
    }

