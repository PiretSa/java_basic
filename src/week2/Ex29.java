package week2;

public class Ex29 {
    public static void main(String[] args) {
        int number = 100;
        int i = 2;
        System.out.println("Even numbers from 1 to 100");

        while (i <= number) {
            //check if i is exactly divisible by 2
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
