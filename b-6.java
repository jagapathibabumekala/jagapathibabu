/* package whatever; // don't place package name! */

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
    	 int count,i;
    	 for(i=m+1;i<n;i++)
    	 {
    	 	count=0;
    	 	for(int j=1;j<=i;j++)
    	 	{
    	 		if(i%j==0)
    	 		 count++;
    	 	}
    	 	 if(count==2)
    	   System.out.print(i+" ");
    	 }
	}
}
