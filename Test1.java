import java.until.Scanner;
class Test
{
	public static void main(String[] args)
	{
	Scanner b1=new Scanner(System.in);
	System.out.println("Enter employee name:");
	String name=b1.nextLine();
	System.out.println("Enter empolyee age:");
	int age=b1.nextInt();
	System.out.println("Enter employee salary:");
	double salary=b1.nextDouble();
	System.out.println("--------");
	System.out.println("Employee name="+name);
	System.out.println("Age="+age);
	System.out.println("Salary="+salary);
	System.out.println("--------");
	}
} 