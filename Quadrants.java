import java.util.Scanner;
public class Quadrants{
    public static void main(String args[]){
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        x = sc.nextInt();
        y = sc.nextInt();
        if(x>0 && y>0){
        System.out.println("This point lies in first quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("This point lies in second quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("This point lies in third quadrant");
        }
        else{
            System.out.println("This point lies in fourth quadrant");
        }
    }
}