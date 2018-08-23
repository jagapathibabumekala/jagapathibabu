import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s1=new Scanner(System.in);
		int m=s1.nextInt();
		int n=s1.nextInt();
		int temp;
		temp=m;
		m=n;
		n=temp;
		System.out.print(m+" "+n);
	}
}
