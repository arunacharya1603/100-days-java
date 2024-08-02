import java.util.Scanner;
public class Remove_Vowel {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();
        String str1 = "";
        str1= str.replaceAll("[aeiouAEIOU]", "" );
        System.out.println(str1);

    }
    
}
