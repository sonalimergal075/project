import java.io.*;
class SumOfD
{
public static void main(String args[])throws Exception
{

int num,sum=0;
int rem;

num=133;
while(num>0)
{
rem=num%10;
sum=sum+rem;
num=num/10;
}
if(sum%3==0)
{
	System.out.println("true");
}
else
{
System.out.println("false");
}
}
}