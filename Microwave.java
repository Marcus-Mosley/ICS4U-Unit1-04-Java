import java.lang.Math;
import java.util.Scanner;

/**
* The Microwave program implements an application that
* determines the amount of time needed to heat up 
* certain items in a microwave.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-01-21
*/
public class Microwave {
  /**
  * The Microwave program implements an application that
  * determines the amount of time needed to heat up 
  * certain items in a microwave.
  */
  public static void main(String[] args) {
    String item = " ";
    double itemInt = 0;
    while (true) {
      // Input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the type of item you want to heat up");
      System.out.print(" (Choices are Pizza, Sub, or Soup): ");
      item = input.nextLine();
      if (item.contains("Pizza")) {
        itemInt = 0.75;
        break;
      } else if (item.contains("Sub")) {
        itemInt = 1;
        break;
      } else if (item.contains("Soup")) {
        itemInt = 1.75;
        break;
      } else {
        System.out.printf("That is not a valid input! \n");
      }
    }
    double amount = 0;
    while (true) {
      try {
        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of items needing to be heated up (1-3): ");
        amount = input.nextDouble();
        if (amount > 0 || amount <= 3) {
          break;
        } else {
          System.out.printf("That is not a valid input! \n");
        }
      } catch (Exception e) {
        System.out.printf("That is not a number, please input a number! \n");
      }
    }
    // Process
    double time = itemInt + (amount - 1) / 2 * itemInt;

    // Output
    System.out.printf("You need to heat up those items for %.2f minutes.", new Object[] {time});
  }
}
