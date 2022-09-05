package week1;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you? ");
        int number = reader.nextInt();

        if (number > 0 && number <= 105) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible");
        }
    }
}
