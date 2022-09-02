package week1;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.println("Type the radius: ");
        double radius = reader.nextDouble();

        System.out.println("Circumference of the circle: " + 2 * Math.PI * radius);
    }
}
