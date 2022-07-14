package stream;
import java.util.Scanner;  
 
public class Armstrong 
{  
//function to check if the number is Armstrong or not  
static boolean isArmstrong(int n)   
{   
int temp, last=0, sum=0;   
//assigning n into a temp variable  
temp=n;   
   
  
while(temp>0)   
{   
//determines the last digit from the number      
last = temp % 10;   
//calculates the power of a number up to digit times and add the resultant to the sum variable  
sum +=  last*last*last;  
//removes the last digit   
temp = temp/10;   
}  
//compares the sum with n  
if(n==sum)   
//returns if sum and n are equal  
return true;      
//returns false if sum and n are not equal  
else return false;   
}   
//driver code  
public static void  main(String args[])     
{     
int num;   
Scanner sc= new Scanner(System.in);  
System.out.print("Enter the number: ");  
//reads the limit from the user  
num=sc.nextInt();  
if(isArmstrong(num))  
{  
System.out.print("Armstrong ");  
}  
else   
{  
System.out.print("Not Armstrong ");  
}  
}   
}  
