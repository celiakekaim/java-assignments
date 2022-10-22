/* Celia Miranda 
   MIS 350 
   October 22, 2022 
*/

public class CurrencyConverter {
   public static void main (String [] args){
//the header table line 
   System.out.println(" US $\t   \tYuan\t \t|\t \tYuan\t \t  \tUS $");
   System.out.println("----------------------------------------------");
//for loop
   for (double u = 1, y = 7.24; u <=1002; u+=100, y+=724.38){
   
    System.out.printf("%5.2f  %8.2f\t \t|\t \t%7.2f\t \t%6.2f\n", u, CyUnitConversion.currencyutoy(u), y, CyUnitConversion.currencyytou(y));
    
// if correct, should print 10 records displaying conversions
  }
 }
}