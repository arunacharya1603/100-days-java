import java.util.Scanner;
public class Exp_num_sumOfTwo_primeNumber {
    static int sumprime(int n){
        int i,isPrime=1;
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                isPrime=0;
                break;
            }
        }
        return isPrime;
    }


    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num =sc.nextInt();
        int c=0;
        for(int i=2;i<=num/2;i++){
            if(sumprime(i)==1){
                if(sumprime(num-i)==1){
                    System.out.println(num+" can be expressed as " +i+ " and "+(num-i));
                    c=1;
                }
            }
        }
        if(c==0){
            System.out.println("Number can't be expressed as the sum of two prime number");
        }

    }
    
}
