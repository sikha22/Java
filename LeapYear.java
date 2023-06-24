//Write a java program to find year is a leap year or not?
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Year");
        int yr=sc.nextInt();
        //century 100%=0 && 400%=0
        //yearly 100%!=0 && 4%=0
        if((yr%4==0 && yr % 100!=0) || yr%400 == 0 ){
            System.out.println("Leap Year");
            }else{
                System.out.println("Not A Leap Year");
    }
    sc.close();
}
}
