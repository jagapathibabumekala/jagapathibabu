import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s1=new Scanner(System.in);
		String s=s1.next();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch)||Character.isLetter(ch))
			count++;
		}
		if(count==0)
		System.out.println("No");
		else
		   System.out.println("Yes");
	}
}
