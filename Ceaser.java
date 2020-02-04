import java.util.*;
public class Ceaser {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the plain text : ");
	String str=sc.nextLine();
	char[] ch=str.toCharArray();
	int i,n;
	n=str.length();
	char[] res=new char[n];
	System.out.println("plain text is : "+str);
	System.out.print("encrypted text is :   ");
	for(i=0;i<n;i++)
	{
		ch[i]+=3;
		if(ch[i]>='a'&&ch[i]<='z' )
		{
			res[i]=ch[i];
		}
		else
		{
			res[i]=(char)(ch[i]-26);
		}
		System.out.print(res[i]);
	}
	sc.close();
}
}
