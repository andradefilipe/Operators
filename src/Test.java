import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        double tip, tax;
        
        tip = mealCost * (tipPercent/100f);
        tax = mealCost * (taxPercent/100f);
        
        double total = mealCost+tip+tax;
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(total);
      
        System.out.printf("The total meal cost is %d dollars.", totalCost);
    }

}
