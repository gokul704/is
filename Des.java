import java.util.*;
public class Des {
	public static int[] perm(int[] a)
	{
		int[] p8=new int[8];
		p8[0]=a[5];
		p8[1]=a[2];
		p8[2]=a[6];
		p8[3]=a[3];
		p8[4]=a[7];
		p8[5]=a[4];
		p8[6]=a[9];
		p8[7]=a[8];
		return p8;
	}
	public static int[] tempo(int[] ls1,int[] ls2)
	{
		int[] temp1=new int[10];
		int i,j;
		for(i=0;i<5;i++)
		{
			temp1[i]=ls1[i];
		}
		j=0;
		for(i=5;i<10;i++)
		{
			temp1[i]=ls2[j];
			j++;
		}	
		return temp1;
	}
	public static int[] left1(int[] temp)
	{
		int[] ls1=new int[5];
		int i,j=0;
		for(i=0;i<5;i++)
		{
			if(j==4)
				ls1[j]=temp[0];
			else
			{
			ls1[j]=temp[i+1];
			j++;
		}
		}
		return ls1;
	}
	public static int[] left2(int[] temp)
	{
		int i,j=0;
		int ls2[]=new int[5];
		//System.out.println("\n"+"ls2:");
		for(i=5;i<10;i++)
		{
			if(j==4)
			{
				ls2[j]=temp[5];
				j++;
			}
				else
			{
			ls2[j]=temp[i+1];
			j++;
			}
		}
		return ls2;
	}
	public static void printls(int[] ls)
	{
		for(int i=0;i<5;i++)
			System.out.print(ls[i]);
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the key");
    int[] key=new int[10];
	int[] p10=new int[10];
	int[] p8=new int[8];
	int[] ls11=new int[5];
	int[] ls12=new int[5];
	int[] ls21=new int[5];
	int[] ls22=new int[5];
	int[] temp=new int[10];
	int[] temp1=new int[10];
    int i,j=0;
	for(i=0;i<10;i++)
	{
		key[i]=sc.nextInt();
		//System.out.print('a');
	}
	System.out.println("p10 permutation:");
	p10[0]=key[2];
	p10[1]=key[4];
	p10[2]=key[1];
	p10[3]=key[6];
	p10[4]=key[3];
	p10[5]=key[9];
	p10[6]=key[0];
	p10[7]=key[8];
	p10[8]=key[7];
	p10[9]=key[5];
	for(i=0;i<10;i++)
	System.out.print(p10[i]);
	System.out.println("\n"+"Left Shift operation: ");
	System.out.println("ls1:");
	ls11=left1(p10);
	printls(ls11);

	System.out.println("\n"+"ls2:");
	ls12=left2(p10);
	printls(ls12);
	temp=tempo(ls11,ls12);
	p8=perm(temp);
	System.out.println("\n"+"p8 is i.e, key1 is  :");
	for(i=0;i<8;i++)
		System.out.print(p8[i]);
	System.out.println("\n"+"Left Shift 2 " );
	ls11=left1(temp);
	ls12=left2(temp);
	temp1=tempo(ls11,ls12);
	
	System.out.println("ls1:");
	ls21=left1(ls11);
	printls(ls21);
	System.out.println("\n"+"ls2:");
	ls22=left2(temp1);
	printls(ls22);
	temp1=tempo(ls21,ls22);
	p8=perm(temp1);
	System.out.println("\n"+"p8 is i.e, key2 is :");
	for(i=0;i<8;i++)
		System.out.print(p8[i]);
	sc.close();
}
}
