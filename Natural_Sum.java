import java.util.Scanner;
public class Natural_Sum {
    public static void main(String args[]){
        int a;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        sum=a*(a+1)/2;
        System.out.println(sum);
    }
    
}
