package stream;

import java.util.Scanner;

public class betweenArmstrong {


	public static void main(String[] arg)
	{
		Scanner sc= new Scanner(System.in);
		int i = sc.nextInt();
int arm;
	System.out.println("Armstrong numbers between "+i+" to 999");
	while(i<1000)
	{
	arm=armstrongOrNot(i);
	if(arm==i)
	System.out.println(i);
	i++;
	}
	}
static int armstrongOrNot(int num)
{
	int x,a=0;
	while(num!=0)
	{
		x=num%10;
		a=a+(x*x*x);
		num/=10 ;
	}
	return a;
}
}