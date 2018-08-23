
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner s=new Scanner(System.in);
	  long int n=s.nextInt();
	   int sum=0,digit,m;
	   m=n;
	   while(n<=100000)
	   {
	   while(n>0)
	   {
	   	digit=n%10;
	   	sum=sum+digit*digit*digit;
	   	n=n/10;
	   }
	   if(sum==m)
	    System.out.println("yes");
	   else
	      System.out.println("no");
	   }
	}
}
