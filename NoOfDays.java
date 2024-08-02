import java.util.Scanner;
public class NoOfDays {
    public static void main(String arg[]){
        int m,y,Days=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month no.:");
        m=sc.nextInt();
        if(m<=12&&m>=1)
        System.out.println("Enter year:");
        y=sc.nextInt();
        if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
            Days=31;
        }
        else if(m==4||m==6||m==9||m==11){
            Days=30;
        }
        else if(m==2){
            if(y%400==0&&y%100==0){
                Days=29;
            }
            else {
                if(y%4==0 && y%100!=0){
                    Days=29;
                }
                else{
                    Days=28;
                }
            }
        }
        System.out.println(Days);
        
    }
}
