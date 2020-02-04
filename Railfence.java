import java.util.*;
public class Railfence {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter plain text: ");
	String str=sc.nextLine();
	//String str1=str.replaceAll(" ", "");
	char[] ch=str.toCharArray();
	int n=str.length();
	char[] b=new char[n];
	char[] c=new char[n];
	int j=0,k=0;
	for(int i=0;i<n;i++)
	{
		if(i%2==0)
		{
			b[k]=ch[i];
			k++;
		}
			else
		{
			c[j]=ch[i];
			j++;
		}
	}
	System.out.println("cipher text is : ");
	for(int i=0;i<n/2;i++)
	{
		System.out.print(b[i]);
	}
	for(int i=0;i<n/2;i++)
	{
		System.out.print(c[i]);
	}
}
}
