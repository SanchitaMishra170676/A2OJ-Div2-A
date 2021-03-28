// https://codeforces.com/problemset/problem/118/A

/* package codechef; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
        public static boolean isVowel (char ch){
            if (ch == 'a'|| ch == 'e'|| ch=='i' ||ch == 'o' || ch == 'u' || ch == 'y')
             return true;
            return false;
        }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		String str = sc.next();
		str = str.toLowerCase();
		for (char ch: str.toCharArray()){
		    if (! isVowel(ch)){
		        System.out.print("."+ch);
		    }
		} 
	}
}
