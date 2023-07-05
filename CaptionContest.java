import java.io.*;
import java.util.*;
class CaptionContest {
	public static void main(String [] args) {
		int i,min=0,max=0;
		String str1,str2;
		Scanner sc = new Scanner(System.in);
		str1 = sc.next();
		str2 = sc.next();
	    for(i=0;i<str1.length();i++)
	    {
	        if(str1.charAt(i)!=str2.charAt(i)) {
	            if((str1.charAt(i)!=63)&&(str2.charAt(i)!=63)) {
	            	min++;
	            	max++;
	            	}
	            else {
	            	max++;
	            	}
	        }
	        else if((str1.charAt(i)==str2.charAt(i))&&(str1.charAt(i)==63)) {
	        	max++;
	        	}
	    }
	    System.out.print(min+" "+max);
        sc.close();
	}
}