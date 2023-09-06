package Kartikeyan;
import java.io.*;
import java.util.Scanner;
 class MAIN {
    int Total = 10000;
    public void display() {
    	System.out.println("- - - - - - - - - - - -");
        System.out.println("1. Withdraw amount.");
        System.out.println("2. Deposit amount.");
        System.out.println("3. Check balance.");
        System.out.println("4. Exit");
    }
    public void withdraw() {
    	System.out.print("Enter the amount you need to withdraw:");
		Scanner sc=new Scanner(System.in);
		int amt=sc.nextInt();
		if(amt>=400) {
		Total=Total-amt;
			System.out.println("Withdrawal successful! \t Remaining balance now: " + Total +"/-");
		}
		else {
			System.out.println("Only amount above or equal to 400/- can be withdrawn. Thankyou!");
			;
		}
    }
    public void deposit(int amt) {
    	if(amt>=200) {
    		Total+=amt;
    		System.out.println("Amount successfully deposited \t Total Balance: " +Total );
    		}
    		else {
    			System.out.println("Only amount above or equal to 200/- can be deposited.");
    		}
    }
    public void checkBalance() {
    	System.out.println("Your current balance: " +Total +"/-");
    }
}
public class JAVATASK3 {
    public static void main(String[] args) 
    {
        MAIN atm = new MAIN();
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
               System.out.print("AFTER INSERTING YOUR CARD Press ENTER to continue:");
               try 
               {
                   System.in.read();
               }  
               catch(Exception e)
               {}  
        
            atm.display();
            System.out.println("Select one option: " );
            int choice = sc.nextInt(); 
            switch (choice) 
            {
                case 1:
                    atm.withdraw();
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit:");
                    int amt = sc.nextInt();
                    atm.deposit(amt);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("- - - - - - - - - - - -");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
      }
    }
}

