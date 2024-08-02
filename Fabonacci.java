import java.util.Scanner;

public class Fabonacci{
    public static void main(String args[]){
        int n1=0;
        int n2=1;
        int i;
        int n3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n3 = sc.nextInt();

        for(i=0;i<n3;i++){
            System.out.print(n1 + " ");
            int c=n1+n2;
            n1=n2;
            n2=c;
           
        }
       

    }
}