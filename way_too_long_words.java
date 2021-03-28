// https://codeforces.com/problemset/problem/71/A

/* package codechef; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		while(n>0){
		    String str = sc.next();
		    if(str.length()<=10){
		        System.out.println(str);
		    }
		    else{
		        int p = str.length();
		        System.out.print(str.charAt(0) );
    		        System.out.print(p-2 );
    		        System.out.println(str.charAt(p-1) );
		    }
		    n--;
		}
	}
}
