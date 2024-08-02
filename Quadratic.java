import java.util.Scanner;
import java.lang.Math;
public class Quadratic{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = input.nextDouble();
        System.out.print("Input b: ");
        double b = input.nextDouble();
        System.out.print("Input c: ");
        double c = input.nextDouble();
        double n,m;

        double z= b * b - 4.0 * a * c;


        if(z>0){
            n=(-b+Math.sqrt(z))/(2*a);
            m=(-b-Math.sqrt(z))/(2*a);
            System.out.format("n=%.2f and m=%.2f",n,m);
        }
        else if(z==0){
            n=m=-b/(2*a);
            System.out.format("n=m=%.2f",n);
        }
        else{
            System.out.println("The equation has no real roots.");
        }
    }
}