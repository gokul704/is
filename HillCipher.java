import java.util.*;
public class HillCipher {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter plain text : ");
	String str=sc.nextLine();
	char[] ch=str.toCharArray();
	int n=str.length();
	int a[]=new int[n];
	int i,j,k;
	int[][] b=new int[n][n];
	int[] c=new int[n];
	char[] d=new char[n];
	System.out.println("plain text matrix is ");
	for(i=0;i<n;i++)
	{
		a[i]=ch[i]-'A';
		System.out.println(a[i]);
	}
	System.out.println("enter key: ");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			b[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
		        c[i]+=b[i][j]*a[j];
		}
	}
	System.out.println("matrix is ");
	for(i=0;i<n;i++)
	{
		System.out.println(c[i]);
	}
	for(i=0;i<n;i++)
	{
		c[i]=c[i]%26;
	}
	System.out.println("matrix after mod is  ");
	for(i=0;i<n;i++)
	{
		System.out.println(c[i]);
	}
	System.out.println("cipher text is : ");
	for(i=0;i<n;i++)
	{
		d[i]=(char)('A'+c[i]);
		System.out.print(d[i]);
	}
}
}
