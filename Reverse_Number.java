import java.util.Scanner;
public class Reverse_Number {
    public static void main(String args[]){
        int n;
        int r=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        while(n!=0){
            int re=n%10;
            r=r*10+re;
            n=n/10;
        }
        System.out.println(r);
    }
    
}
