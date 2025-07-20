import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get year input from user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear;

        // Leap year logic
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeapYear = (year % 400 == 0);
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        // Display result
        if (isLeapYear) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }
    }
}
