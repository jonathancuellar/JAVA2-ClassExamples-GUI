// 10/15/14
// program to calculate future value

import javax.swing.JOptionPane;
import java.util.Formatter;

public class FutureValue
{
  public static void main (String[] args)
  {
    Formatter formatter = new Formatter();

    String yearlyPayment = JOptionPane.showInputDialog(
      "Enter yearly payment" );
    String interestRate = JOptionPane.showInputDialog(
      "Enter rate of interest");
    String numberYears = JOptionPane.showInputDialog(
      "Enter number of years");

    //Convert string inputs into int and double for calculations
    double y = Double.parseDouble(yearlyPayment);
    double r = Double.parseDouble(interestRate)/100;
    int n = Integer.parseInt(numberYears);

    // Compute future value
    double futureValue = y * (Math.pow((1+r),n) - 1)/r;

    formatter.format("%.2f", futureValue);

    // Display the result in a JOptionPane message dialog
    JOptionPane.showMessageDialog(null, "Future value" +formatter.toString(),
      "Future Value", JOptionPane.PLAIN_MESSAGE);

  } // end main
} // end class
