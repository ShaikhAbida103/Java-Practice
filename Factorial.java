import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int fact=1; // factorial start 1 se hota hai
        for(int i=1; i<=n; i++){
            fact=fact*i; //multiply...
        }
        System.out.println("Factorial=" +fact);
        sc.close();
    }
}
