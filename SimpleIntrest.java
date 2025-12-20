package Day2_Operators;
 import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Principal amount: ");
        double p =sc.nextDouble();
        System.out.println("Enter rate of Intrest: ");
        double r = sc.nextDouble();
        System.out.println("Enter Time(in years): ");
        double t=sc.nextDouble();
        double si =(p*r*t)/100;
        System.out.println("Simple Intrest = "+si);
        sc.close();
    }
}
