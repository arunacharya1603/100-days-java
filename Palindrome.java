import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int reverseNumber=0;
        int temp=n;
        while(n>0){
            int r=n%10;
            reverseNumber=(reverseNumber*10)+r;
            n=n/10;
        }
        if(temp==reverseNumber)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
