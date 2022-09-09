package week2;
import java.util.Scanner;


public class Ex30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number?: ");

        int inserted = reader.nextInt();
        int number = 1;

        while(number <= inserted){
            System.out.println(number);
            number++;
        }

    }
}
