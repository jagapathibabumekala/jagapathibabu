import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   	Scanner s1=new Scanner(System.in);
		String s=s1.nextLine();
		int count=0;
		for(char c:s.toCharArray())
		{
			if(Character.isDigit(c))
			count++;
		}
		System.out.println(count);
	}
}
