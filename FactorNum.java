import java.util.Scanner;
public class FactorNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n,sum=0;
        n= sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+",");
            }
        }
    }
    
}
