//write a java program to print the natural numbers from 1 to 100
import java.util.Scanner;
public class Naturalnum {
    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int n= 100;
      for (int i = 1 ;i<=n;i++)
      System.out.println(""+i+" ");
      s.close();
    }
}
