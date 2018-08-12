
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char ch;
		Scanner s=new Scanner(System.in);
		 ch=s.next().charAt(0);
		 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		 {
		 	System.out.println("vowel");
		 }
		  if((ch>='b'&&ch<='d') || (ch>='f'&&ch<='h' )||( ch>='j'&&ch<='n') ||(ch>='p'&&ch<='t') ||(ch>='v'&&ch<='z'))
		  {
		  	System.out.println("consonents");
		  }
		  else
		  {
		  	System.out.println("invalid");
		  }
	}
}
