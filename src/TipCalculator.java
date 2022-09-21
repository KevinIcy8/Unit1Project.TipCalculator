import java.util.Scanner;
import java.text.DecimalFormat;
public class TipCalculator {
    public static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // user input variables
        System.out.print("What is the total bill: $ ");
        float totalBill = s.nextFloat();
        System.out.print("What tip percentage do you want to give: ");
        int tipPercentage = s.nextInt();
        System.out.print("How many people are in the party: ");
        int numberOfPeople = s.nextInt();
        // calculation variables
        float tipPercentageAsDecimal = (float)tipPercentage/100; //doing this makes calculations easier
        float totalTip = totalBill*tipPercentageAsDecimal;
        float roundedTotalTip = (float)Math.round(totalTip*100)/100;
        float totalBillWithTip = totalBill+roundedTotalTip;
        float tipPerPerson = roundedTotalTip/numberOfPeople;
        float roundedTipPerPerson = (float)Math.round(tipPerPerson*100)/100;
        float totalBillPerPerson = totalBillWithTip/numberOfPeople;
        float roundedBillPerPerson = (float)Math.round(totalBillPerPerson*100)/100;
        // print statements and format
        System.out.println();
        System.out.println("Total Tip: $" + df.format(roundedTotalTip));
        System.out.println("Total Bill Including Tip: $" + totalBillWithTip);
        System.out.println("Tip Per Person: $" + roundedTipPerPerson);
        System.out.println("Total Bill Per Person: $" + roundedBillPerPerson);



    }
}
