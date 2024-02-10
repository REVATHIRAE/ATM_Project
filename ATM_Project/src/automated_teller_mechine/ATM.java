package automated_teller_mechine;

import java.util.*;


public class ATM {

	public static void main(String[] args) 
	{
		int pin = 1234;
		int balance = 0;
		int add_amount = 0;
		int widthdraw_amount =0;
		String name;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your PIN number:");
		int password = scanner.nextInt();
		
			if(password==pin)
				{
					System.out.println("Enter Your Name :");
					name=scanner.next();
					System.out.println("Welcome " + name);
					while(true)
						{
							System.out.println("Press 1.check your Balance");
							System.out.println("Press 2.Add Amount");
							System.out.println("Press 3.Widthdraw cash");
							System.out.println("Press 4.Print Receipt");
							System.out.println("Press 5.Exit");
					
						int opt = scanner.nextInt();	
						
						
						switch(opt)
							{
								case 1:
									System.out.println("Your current Balance is: " +balance);
								 
									
									break;
								case 2:
									System.out.println("Add Amount");
									add_amount = scanner.nextInt();
									System.out.println("Successully Credited");
									balance = add_amount + balance;
									break;
								case 3:
									System.out.println("Enter your Widthdrawl Amount");
									widthdraw_amount = scanner.nextInt();
									if(widthdraw_amount>balance)
										{
											System.out.println("Insufficient Balance!");
										}
									else 
										{
											System.out.println("cash Widthdrawl");
											balance = balance - widthdraw_amount;
										}
									break;
								case 4:
									System.out.println("State Bank Of India");
									System.out.println("Your Available Balance is: "+ balance);
									System.out.println("Deposit Amount :" + add_amount);
									System.out.println("Widthdrawl cash :" + widthdraw_amount);
									System.out.println("Thank you!");
									break;
							}
							if(opt==5)
								{
									System.out.println("Thank you!");						
									break;
								}
						}
				}		
				else 
					{
						System.out.println("Please Enter Valid PIN Number");
					}
	}			
	
}