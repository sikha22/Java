import java.io.*;
import java.util.*;
class AlternatingCode {
	public static void main(String [] args) {
		int i,s=0;
		String a;
		char x,y;
		Scanner sc = new Scanner(System.in);
		a = sc.next();
		x = a.charAt(0);
		y = a.charAt(1);
         sc.close();
	    if(x==y) { 
	    	s=1;
	    	}
	    else{
	    for(i=0;i<a.length();i++)
	    {
	        if(i%2==0) { 
	        	if(x!=a.charAt(i)) { 
	        		s=1;
	        		break;
	        		}
	        	}
	        else if(y!= a.charAt(i)) { 
	        	s=1;
	        	break;
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
