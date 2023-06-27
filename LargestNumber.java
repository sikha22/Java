//Write a java program to find the Largest of among Three Numbers
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter three numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if((num1>num2)&&(num1>num3)){
            System.out.print(num1+" is largest number.");
            }else{
                if ((num2 > num1) && (num2 > num3))
                System.out.print(num2 + "is largest number ");
                else
                System.out.print(num3 +"is largest number");
    }
    sc.close();
}
}
