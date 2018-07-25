import java.util.*;
class librarymember
{
	int memberid;
	String membername;
	String address;
	int phnum;
	int nobt;
	Scanner c=new Scanner(system.in)
	void read()
	{
		System.out.println("memberid auto generated ! ");
		System.out.println("Enter the member name:");
		membername=c.nextLine();
		System.out.println("Enter the address:");
		address=c.nextLine();
		System.out.println("Enter the phone number:");
		phnum=c.nextInt();
		System.out.println("Enter the Number Of Books Taken:");
		nobt=c.nextInt();
	void display()
	{
		System.out.println("Member ID:"+memberid);
		System.out.println("Member NAME:"+membername);
		System.out.println("ADDRESS:"+address);
		System.out.println("Phone number:"+phnum);
		System.out.println("Number of Books Taken:"+nobt);
	}	
}
class student extends librarymember
{
	int rollno;
	String stream;
	Scanner c=new Scanner(system.in)
	void reads()
	{
		super.read();
		System.out.println("Enter the Roll Number:");
		rollno=c.nextInt();
		System.out.println("Enter the Stream:");
		stream=c.nextLine();
	}	
	void displays()
	{
		super.display();
		System.out.println("Student Roll Number:"+rollno);
		System.out.println("Student Stream:"+stream);
	}
}
class faculty extends librarymember
{
	int facultyid;
	String designation;
	Scanner c=new Scanner(system.in)
	void readf()
	{
		super.read();
		System.out.println("Enter the faculty id:");
		facultyid=c.nextInt();
		System.out.println("Enter the designation:");
		designation=c.nextLine();
	}	
	void displayf()
	{
		super.display();
		System.out.println("Faculty ID:"+facultyid);
		System.out.println("Faculty Designation:"+designation);
	}
}		
class librarymembermain
{
	public static void main(String args[])
	{
	Scanner c=new Scanner(system.in)
	int ns,nf,i,j,choice,choice2;
	char character1;
	student s[]=new student();
	faculty f[]=new faculty();
	System.out.println("***Data Entry***");
	System.out.println("*Students*");
	System.out.println("Enter No of students");
	ns=c.nextInt();
	for(i=0;i<ns;i++)
	{
		s[i].memberid=i;
		s[i].reads();
	}	
	System.out.println("*faculties**");
	System.out.println("Enter No of faculties**");
	nf=c.nextInt();
	for(j=0;j<nf;j++)
	{
		f[i].memberid=i;
		f[i].readf();
	}	
	System.out.println("***MAIN MENU***")
	System.out.println("ENTER WHETHER YOU WANT TO DO?\n ENTER A MEMBER(0)\nDISPLAY MEMBER DETAILS(1)\nBORROW BOOK(2)\nRETURN BOOK(3)");
	choice=c.nextInt();
	switch(choice)
	{
	case 0:
			System.out.println("Student(0) or Faculty(1)");
			choice2=c.nextInt();
			if(choice2==0)
			{
				i++
				s[i].memberid=i;
				s[i].reads();
			}
			else if(choice2==1)	
			{
				j++
				s[j].memberid=j;
				s[j].readf();
			}
			break;
	case 1:			
			System.out.println("Enter first character of memberid(F/S)");
			character1=c.nextLine();
			