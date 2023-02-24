import java.sql.SQLOutput;
import java.util.*;
public class demo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter time in club");
        double time=sc.nextDouble();
        System.out.println(time);
        if (time == 9.30) {
            System.out.println("you are allowed in club");
        }
        else if(time==10.30){
            System.out.println("you are allowed in club");
        }
        else if(time==11.30){
            System.out.println("you are  allowed in club");
        }
        else if(time==12.30){
            System.out.println("you are  allowed in club");
        }
        else if(time==1.30){
            System.out.println("you are  allowed in club");
        }
        else {
            System.out.println("you are not allowed in club");
        }
    }
}