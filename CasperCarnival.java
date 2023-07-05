import java.io.*;
import java.util.*;
class CasperCarnival {
	public static void main(String [] args) {
	    int i,s,n;
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    String str[] = new String[n];
	    if(n>1) {
	    	s=0;
	    }
	    else {
	    	s=1;
	    }
	    for(i=0;i<n;i++)
	    {
	    	str[i] = sc.next();
	        if(i>0)
	        {
	        	if(str[i-1].equals("cookie") && !(str[i].equals("juice"))) {
	            	s=1;
	            	}
	        }
	        if(i==n-1) {
	        	if(str[n-1].equals("cookie")) {
	        		s=1;
	        		}
	        	}
	    }
	    if(s==1) {
	    	System.out.println("No");
	    }
	    else {
	    	System.out.println("Yes");
	    }
	}
}