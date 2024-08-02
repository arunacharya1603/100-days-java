import java.util.Scanner;
import java.lang.Math;

public class Factorial {
    public static void main(String args[]){
        int fact=1;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            
            fact =fact*i;
        }
        System.out.println(fact);
    }
    
}
