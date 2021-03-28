// https://codeforces.com/problemset/problem/112/A

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
		String str1 = sc.next();
		String str2 = sc.next();
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		int key =0;
		for(int i=0;i<str1.length();i++){
		    if (str1.charAt(i) > str2.charAt(i)){
		        key =1; 
		        break;
		    }
		    else if (str1.charAt(i) < str2.charAt(i)){
		        key =-1; 
		        break;
		    }
		    
		}
		
		System.out.println(key);
	}
}
