import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int sum=0,avg;
        for(int i=0;i<n;i++)
          a[i]=s.nextInt();
          for(int i=0;i<n;i++)
          {
             sum=sum+a[i];
          }
          avg=sum/n;
          System.out.println(avg);
	}
}
