import java.util.Scanner;

public class vowel{
    
    public static void main(String args[]) {
        char c;
        int num;
        System.out.println("Enter the character:");
        Scanner sc = new Scanner(System.in);
        
        c = sc.next().charAt(0);
        if(c=='a'|| c =='e' || c == 'i' || c == 'o' || c=='u' || c== 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
        System.out.println("Vowel");
        else if(Character.isDigit(c)) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Consonant");
        } 
       
        

    }
}