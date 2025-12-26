import java.util.Scanner;
public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n1.Print Hello");
            System.out.println("2.Print numbers 1 to 5");
            System.out.println("3. Exit");
            System.out.println("Enter choice: ");
            choice =sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hello Riya");
                    break;
                case 2:
                    for(int i=1; i<=5; i++){
                        System.out.println(i);
                    }
                    break;
                case 3:
                    System.out.println("Program Exit");    
                default:
                    System.out.println("Invalid Choice");
                    break;
            }    
        }while (choice !=3); 
        sc.close();
     }
    }
