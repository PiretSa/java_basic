package week4;
import java.util.Scanner;

public class Ex79 {
        public static void main(String[] args) {
            NumberStatistics stats = new NumberStatistics();
            Scanner reader = new Scanner(System.in);

            System.out.println("Type a number: ");
            int number;
            int sum = 0;
            int count = 0;
            int even = 0;
            int odd = 0;

            while (true) {
                number = Integer.parseInt(reader.nextLine());

                if (number == -1) {
                    break;  // end the loop
                }
                sum += number;
                count++;
                if(number % 2 == 0){
                    even++;
                } else {
                    odd++;
                }
            }

            System.out.println("sum of numbers is:" + sum);
            System.out.println("sum of even: " + even);
            System.out.println("sum of odd: " + odd);
        }
    }
