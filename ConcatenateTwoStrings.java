import java.util.Scanner;
public class ConcatenateTwoStrings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1:");
        String str1 = sc.nextLine();
        System.out.println("Enter the String 2:");
        String str2 = sc.nextLine();
        System.out.println(str1+" "+str2);
    }
}
