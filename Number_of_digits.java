import java.util.Scanner;
import java.math.MathContext;

public class Number_of_digits {
    public static void main(String args[]){
        double a,b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");

        a=sc.nextInt();
        b=String.valueOf(a).length();
        System.out.println(b);
    }

                                   
}
