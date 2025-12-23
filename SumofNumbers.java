import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int sum=0; 
        for(int i=1; i<=n; i++){
            sum=sum+i; // sum me i add hota rahega
        }
        System.out.println("sum="+sum);
        sc.close();
    }
}
