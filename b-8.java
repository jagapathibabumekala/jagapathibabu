
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  int m=s.nextInt();
	   int sum,digit,arm;
	  for(int i=n;i<m;i++)
	   {
	   	arm=i;
	  	sum=0;
	   while(arm>0)
	   {
	   	digit=arm%10;
	   	sum=sum+digit*digit*digit;
	   	arm=arm/10;
	   }
	   if(sum==i)
	    System.out.print(i+" ");
	   }
	}
}
