package week1;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Type the password: ");

            String command = reader.nextLine();
            if (command.equals("carrot")) {
                System.out.println("Right!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("The secret is: jryy qbar!");
    }



}
