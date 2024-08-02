import java.util.Scanner;

public class AddFraction {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int x1, x2;
        int y1, y2;
        int z;
        int Div;
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        y1 = sc.nextInt();
        y2 = sc.nextInt();

        z = (x1 * y2) + (x2 * y1);
        int y = (y1 * y2);
        if (z > y) {
             Div = z;
        } else {
            Div = y;
        }
        for (int i = Div; i > 0; i--) {
            if (z % i == 0 && y % i == 0) {
                z= z / i;
                y = y / i;
            }

        }
        System.out.print("Sum of fractions is "+z+"/"+y);
        int a = z / y;
        System.out.println(z);
        System.out.println(y);
        System.out.println(a);
        System.out.println(z / y);

    }
}
