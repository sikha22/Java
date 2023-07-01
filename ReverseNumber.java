//Write a java program for reverse the number
import java.util.Scanner; 
public class ReverseNumber {
    public static void main(String[] args)
    {
      Scanner s = new Scanner(System.in);
    int n = s.nextInt();
      // int rev = 0;
      while(n> 0){
        int rem = n %10;
        // rev = rev * 10 + rem;
        System.out.print(rem);
        n = n/10 ;
      }
      // System.out.println("The reverse of the number is " + rem);
    s.close();
    }
}
