package week2;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class Ex32 {
    public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);

            System.out.print("Sum until what?: ");
            int number = Integer.parseInt(reader.nextLine());
            int sum = 0;
            int helper = 0;

            while (number >= helper) {
                sum = sum + helper;
                helper++;
            }

            System.out.print(sum);
        }
    }

