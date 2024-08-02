import java.util.Scanner;
public class Posi_Nega {
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        if(num<0)
        System.out.println("Negative");
        else if (num>0) {
            System.out.println("Positive");
        } else {
            System.out.println("Neither positive nor negative");
        }
    }
    
}
