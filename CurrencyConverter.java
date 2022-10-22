/* Celia Miranda 
   MIS 350 
   October 22, 2022 
*/

public class CurrencyConverter {
   public static void main (String [] args){
//the header table line 
   System.out.printf("US $\t \tYuan\t \t|\t \tYuan\t \tUS $\n");
   System.out.printf("------------------------------------------------");
//for loop
   for (double u = 1, y = 7.24; u <=1000; u+=100, y+=724.38){
   
    System.out.printf("\n%.2f\t \t%.2f\t \t|\t \t%.2f\t \t%.2f\n", u, CyUnitConversion.currencyutoy(u), y, CyUnitConversion.currencyytou(y));
  }
 }
}