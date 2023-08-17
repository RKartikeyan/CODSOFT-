package Kartikeyan;
import java.util.Scanner;
public class JAVATASK2 
{
	public static void main(String args[])
	{
		int subjects,marks,totalmarks=0;
		float percentage;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of the Student");
		name=sc.next();
		
		System.out.println("Enter the Number of subjects");
		subjects=sc.nextInt();
		for(int i=1;i<=subjects;i++)
		{
			System.out.println("Enter the Marks in subject"+i+"=");
			marks=sc.nextInt();
			if(marks<33)
			{
				System.out.println("Disqualified");
				System.exit(0);
			}
			else
			{
				totalmarks+=marks;
			}
		}
		
		percentage=totalmarks/subjects;
		
		char grade;
		if(percentage>=90)
		{
			grade='A';
		}
		else if(percentage>=80)
		{
			grade='B';
		}
		else if(percentage>=70)
		{
			grade='C';
		}
		else if(percentage>=60)
		{
			grade='D';
		}
		else
		{
			grade='F';
		}
		System.out.println("Name of the student:" +name);
		System.out.println("Percantage:"+percentage);
		System.out.println("Grade:"+grade);
		
		
	}
	

}
