// This program will calculate tip based on the bill total
import java.util.Scanner; 
public class TipCalculator{
   // Main method
   public static void main (String [] args) {
      Scanner input = new Scanner(System.in); 
      
      // Input for bill amount
      System.out.print("Please enter your bill amount: $");
      double billAmt = input.nextDouble(); 
      System.out.println(); 
      
      // 3. Call the receipt printing method
       
      
   }
   
   // 1. Write a method to display tip options, allow user to select one, and then calculate and return tip 
   
   public static double tipAmount(double billAmt){
      Scanner input = new Scanner(System.in);
      System.out.printf("Please select the number corresponding to the tip amount\n 1.15%\n 2.18%\n 3.20%\n 4.25%\n 5.enter your own tip amount ");
         tipSelection = input.nextInt();
      if (tipSelection == 1)
         return (billAmt*.15);
      if else (tipSelection == 2)
         return (billAmt*.18);
      if else (tipSelection == 3)
         return (billAmt*.20);
      if else (tipSelection == 4)
         return (billAmt*.25);
      
      else {
         System.out.println("Please enter the desired tip amount: ");
         
         return ();
      
      }
   
   }
   
   
   
      
   // 2. Write a method to calculate tax, call the above method to get calculated tip, calculate total to pay; Display a nice receipt
   
   
   
   
       
}
