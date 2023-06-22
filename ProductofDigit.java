//Write a java program to compute product of digits in the number
import java.util.Scanner;
public class ProductofDigit {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any positive integer");
        int n=s.nextInt();
       int p =1;
       while(n>0){
        p = p * n % 10;
        n = n/10;
       }
       System.out.println("The product is "+p);
       s.close();
    }

}
