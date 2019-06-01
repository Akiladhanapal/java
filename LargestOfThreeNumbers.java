import java.util.Scanner;
class LargestOfThreeNumbers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first num");
int a=sc.nextInt();
System.out.println("Enter the second num");
int b=sc.nextInt();
System.out.println("Enter the third num");
int c=sc.nextInt();
if(a>b && a>c)
{
System.out.println(a+ "is largest no");
}
else if(b>c && b>a)
{
System.out.println(b+ "is largest no");
}
else{
System.out.println(c+ "is largest no");
}
}
}