package Kartikeyan;
import java.util.Scanner;
public class JAVATASK1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int range=100,Chances=5,Score=0,genNumber,choice,Number;
		double random;
		String play;
		while(true)
		{
			random=Math.random();
			genNumber=(int)(random*range);
			System.out.println("Welcome to the Number Game");
			System.out.println("Generating a Number...");
			System.out.println("...");
			System.out.println("...");
			System.out.println("...NUMBER GENERATED!");
			for(choice=1;choice<=Chances;choice++)
			{
				System.out.println("Chance "+ choice +" out of "+Chances+"=");
				Number=sc.nextInt();
			
			if(Number==genNumber)
			{
				System.out.println("WOHOO! Correct Guess");
				Score++;
				break;
			}
			else
			{
				System.out.println("Wrong Number");
			}
			if(choice==Chances)
			{
				System.out.println("Chancces Exhausted");
			}
		
	}
			System.out.println("DO YOU WANT TO PLAY IT AGAIN PRESS 'Y' FOR YES AND 'N' FOR NO ");
			play=sc.next();
			if(!play.equalsIgnoreCase("Y"));
			{
			    System.out.println("THANK YOU PLAYING");
			    System.out.println( "YOUR SCORE-----> + Score");
                break;
			}
			
}
}
}