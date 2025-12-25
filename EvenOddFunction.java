import java.util.Scanner;
public class EvenOddFunction {
     static void checkEvenOdd(int num){
        if (num % 2==0)
        System.out.println("Even");
        else
            System.out.println("Odd");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        checkEvenOdd(n);
        sc.close();
    }
}
