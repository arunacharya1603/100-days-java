import  java.util.Scanner;

public class Toggle_char{
    public static void main(String args[]) {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the Character:");
         String str = sc.nextLine();
         String str1 = "";
         for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i)))
                str1=str1+Character.toLowerCase(i);
            else
                str1=str1+Character.toUpperCase(i);
         }    
         System.out.println(str1);
    }
}