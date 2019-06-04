class Student 
{
int rollno;
String name;
int mark;
void display()
{
System.out.println(rollno);
System.out.println(name);
System.out.println(mark);
}
void result()
{
	if(mark>50)
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
}