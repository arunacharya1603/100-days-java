import java.util.Scanner;

public class Sum_Of_Digits{
    public static void main(String args[]){
        int a,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        a=sc.nextInt();

        while(a>0){
            sum=sum+a%10;
            a=a/10;
        }
        System.out.println(sum);
     
    }
    
}
