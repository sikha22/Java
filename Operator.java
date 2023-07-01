public class Operator {
    public static void main(String args[]) {
        int x = 5;
        int y = 8;
        // Increment Operator

        System.out.println(x++);
        // System.out.println(x++ + ++x); 12
        System.out.println(++x);
        // System.out.println((++x)++); Error
        // System.out.println((--x)--); Error

        // Decrement Operator
        System.out.println(y--);
        System.out.println(--y);

        // Conditional Operator
        System.out.println((x % 2 == 0) ? "Even" : "Odd");
        System.out.println((y % 2 == 0) ? "Even" : "Odd");

        // Largest Number
        int a = 69;
        int b = 89;
        int c = 79;
        int largestNumber = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The largest numbers is:  " + largestNumber);

        System.out.println(~(x=5));
        System.out.println(x &= 3);
        System.out.println(x |= 3);
        byte z = 101;
        System.out.println(z << 1);
        System.out.println(x!=y);
        System.out.println(x>=5 && y<=9);
        System.out.println(x>9 || y<=8);
    }
}
