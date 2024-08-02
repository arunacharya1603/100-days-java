import java.util.Scanner;
public class NumberOfHandshakes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int n = sc.nextInt();
        int result=0;
        result = (n*(n-1))/2;
        System.out.println(result);
    }
}
