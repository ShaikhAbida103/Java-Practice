package Day2_Operators;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = src.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        src.close();
    }
}
