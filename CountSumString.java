import java.util.Scanner;
public class CountSumString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str= sc.nextLine();
        int sum =0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i)))
              sum=sum+Character.getNumericValue(str.charAt(i));
        }
        System.out.println(sum);

    }
}
