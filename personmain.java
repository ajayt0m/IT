import java.util.*;
class person
{
	String recordname;
	int age,salary;
	void display()
	{
		System.out.println("Record Name:"+recordname);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
	}	
}
class personmain
{
	public static void main(String arg[])
		{
			person obj1=new person();
			Scanner c=new Scanner(System.in);
			System.out.println("Enter Record Name");
			obj1.recordname=c.nextLine();
			System.out.println("Enter age");
			obj1.age=c.nextInt();
			System.out.println("Enter Salary");
			obj1.salary=c.nextInt();
			obj1.display();
		}
}		