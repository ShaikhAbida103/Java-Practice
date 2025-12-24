import java.util.Scanner;
public class DoWhileExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("1.Say Hello");
            System.out.println("2.Exit");
            System.out.println("Enter choice: ");
            choice=sc.nextInt();
            if(choice==1){
                System.out.println("Hello Abida ");
            }
        } while(choice!=2);
        sc.close();
    }
}
