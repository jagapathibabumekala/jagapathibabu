import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		m=m^n;
		n=m^n;
		m=m^n;
		System.out.print(m+" "+n);
	}
}
