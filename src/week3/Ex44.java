package week3;

public class Ex44 {
    public static int least(int number1, int number2) {
        // write program code here
        int answer;

        if (number1 < number2) {
            answer = number1;
            return answer;
        } else {
            answer = number2;
            return answer;
        }
    }

    public static void main(String[] args) {
        int answer =  least(7, 9);
        System.out.println("Least: " + answer);
    }
}
