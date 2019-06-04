import java.util.Scanner;
class B
{
	int s=0,n=865;
int print()
{
while(n>0)
{
int b=n%10;
s=(s*10)+b;
n=n/10;
}
return s;
}
}

