import java.util.Scanner;

class EnrollNumbers {
    public void printNumbers(int N) {
        if (N > 0) {
            printNumbers(N - 1);
            System.out.print(N + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        EnrollNumbers enrollNumbers = new EnrollNumbers();
        enrollNumbers.printNumbers(N);
        
        System.out.println();
    }
}
