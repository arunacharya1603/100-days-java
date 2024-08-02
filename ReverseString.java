import java.util.Scanner;
public class ReverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        String str = sc.nextLine();
        StringBuilder n = new StringBuilder(str);
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(n.charAt(i));
        }


    }
}
