//Write a program to get Fibonacci Series till 500
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1,c;
        for(int i=1;i<=n;i++){
            System.out.println(a+" ");
            c=a+b; //0 1 1 2
            a=b;
            b=c;
        }
        sc.close();
    }
}
