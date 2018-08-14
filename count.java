import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,r,sum=0;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		while(num>0)
		{
			r=num%10;
			sum++;
			num=num/10;
		}
		System.out.println(sum);
	}
}
