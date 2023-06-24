
//Write a java program to find the max number between two number
import java.util.Scanner;

public class Max {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int num1 = r.nextInt();
        System.out.println("Enter the number2: ");
        int num2 = r.nextInt();
        if(num1>num2){
            System.out.print("The largest number is "+num1);
        }else {
            System.out.println("The largest number is "+num2);
        }

        r.close();
    }
}
