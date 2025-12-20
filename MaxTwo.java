package Day2_Operators;
 import java.util.Scanner;

public class MaxTwo {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a =src.nextInt();
        System.out.println("Enter second number:");
        int b =src.nextInt();
        if (a>b){
            System.out.println("First number is greator");
        } else if (b>a){
            System.out.println("Second number is greator");
        } else{
            System.out.println("Both numbers are equal");
        }
        src.close();
    }
}
