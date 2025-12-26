import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Say Hello");
        System.out.println("2. Say Bye");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Hello Riya");
                break;
            case 2:
                System.out.println("Bye");
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }
        sc.close();
    }
}
