import java.util.Scanner;

public class Alphabet{
    
    public static void main(String[] args) {
        char c;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        c = sc.next().charAt(0);
        if(Character.isAlphabetic(c))
        System.out.println("Alphabet");
        else
        System.out.println("Not an alphabet");
    }
}