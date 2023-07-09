import java.util.Scanner;

class NumberofWays {
    public static int countWays(int x, int n, int currentNum) {
        if (x == 0)
            return 1;
        else if (x < 0 || currentNum <= 0)
            return 0;
        else {
            int includeCurrent = countWays(x - (int) Math.pow(currentNum, n), n, currentNum - 1);
            int excludeCurrent = countWays(x, n, currentNum - 1);
            return includeCurrent + excludeCurrent; 
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int count = NumberofWays.countWays(x, n, (int) Math.floor(Math.pow(x, 1.0 / n)));
        System.out.println(count);
    }
}
