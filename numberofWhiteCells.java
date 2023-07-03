import java.io.*;
import java.util.*;
class numberofWhiteCells {
	public static void main(String [] args) {
		int i,j,n,count=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[][] = new int[n][n];
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				a[i][j] = sc.nextInt();
				if(a[i][j] < 11) {
					count += a[i][j];
				}
			}
		}
		System.out.println(count);
	}
}
