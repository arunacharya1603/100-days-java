import java.util.Scanner;
public class CapFirstLastLetter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1=sc.nextLine();
        String s2 = "";
        String[] str1 = s1.split("\\s");
        for(String string:str1){
            int length = string.length();
            String f = string.substring(0,1);
            String r = string.substring(1,length-1);
            String l = Character.toString(string.charAt(length-1));
            s2 = s2 + f.toUpperCase() + r + l.toUpperCase();
           
        }
        System.out.println(s2);
    }
}
