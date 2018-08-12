
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int j;
		Scanner sc=new Scanner (System.in);
		j=sc.nextInt();
		if(j%2==0)
		{
			System.out.println("Even");
		}
		else if(j<0)
		{
			System.out.println("invalid");
			
		}
		else
		{
			System.out.println("Odd");
		}
	}
}
