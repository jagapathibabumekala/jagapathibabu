import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,k,sum=0,i;
		int a[]=new int[20];
		
		Scanner s=new Scanner(System.in);
		
		  n=s.nextInt();
		  k=s.nextInt();
		  for(i=1;i<n;i++)
		  {
		  	a[i]=s.nextInt();
		  }
		  for(i=1;i<k;i++)
		  {
		  	sum=a[i]+sum;
		  }
		  System.out.println(sum);
	}
}
