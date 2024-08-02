import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int[] freq = new int[str.length()];
        int i, j;
        char strnew[] = str.toCharArray();
        for (i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (j = i + 1; j < str.length(); j++) {
                if (strnew[i] == strnew[j]) {
                    freq[i]++;
                    strnew[j] = '0';
                }
            }
        }
        System.out.println("Frequencies: ");
        for (i = 0; i < freq.length; i++) {
            if (strnew[i] != ' ' && strnew[i] != '0')
                System.out.println(strnew[i] + " - " + freq[i]);
        }
    }
}