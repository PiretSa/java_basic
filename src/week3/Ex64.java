package week3;
import java.util.ArrayList;

public class Ex64 {
    public static double average(ArrayList<Integer> list) {
    // write your code here
        int helper = 0;
        int sum = 0;
        double average = 0;

        for (int x : list) {
            sum += x;
            helper++;
        }
        average = sum / helper;
        return average;
}

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(6);

        System.out.println("The average is: " + average(list));
    }
}
