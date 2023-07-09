import java.util.Scanner;

class Position {
    public static int findPos(int N) {
        if (N == 1)
            return 1; 
        else
            return 2 * (findPos(N / 2)); 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int finalPosition = Position.findPos(N);
        System.out.println(finalPosition);
    }
}
