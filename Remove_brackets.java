import java.util.Scanner;
public class Remove_brackets {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Expression:");
        String str= sc.nextLine();
        String newstr = str.replaceAll("[(){}[]*&^%$#@!~`_=]", "");
        System.out.println(newstr);
    }
    
}
