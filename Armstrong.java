import java.util.Scanner;

public class Armstrong{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int temp=n;
        int result=0;
        while(temp>0){
            int ld = temp%10;
            result=result + ld*ld*ld;
            temp=temp/10;
        }
        if(result==n){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
    }
}