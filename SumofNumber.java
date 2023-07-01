// Write a java program to find the sum of natural number fromm 1 to 100
import java.util.Scanner;
public class SumofNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n =100;
        int sum=0;
        for(int i=1;i<=n;i++){
         sum = sum + i;
        }
       
        System.out.println(sum);
        sc.close();
    }

}
