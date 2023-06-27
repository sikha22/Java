//Write a program to find the factorial of given number
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int fact = 1;
        for(int i = 1;i<=r;i++){
            fact=fact*i;
        }
        System.out.println("The factorial is "+fact);
        sc.close();
    }
}
