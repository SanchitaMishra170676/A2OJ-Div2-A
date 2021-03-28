// https://codeforces.com/problemset/problem/4/A
 
import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		if(n%2 == 0 && n>2)
		System.out.println("YES");
		else
		System.out.println("NO");
	}
}
