package week2;
import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        System.out.println("Type number: ");

        Scanner reader = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;

        while (true) {
            number = Integer.parseInt(reader.nextLine());

            if (number ==-1) {
                break;  // end the loop
            }
            sum += number;
            count++;
        }
        System.out.println("Sum of numbers is: " + sum);
        System.out.println("How many numbers you typed: " + count);
        System.out.println("Average of the numbers is " + (double)sum / count);
        System.out.println("Thank you and see you later");

    }
}
