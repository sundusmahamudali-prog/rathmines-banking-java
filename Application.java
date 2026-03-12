package SA1Sundus;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		ArrayList<Profile>profiles=new ArrayList<>();
		Scanner scanner= new Scanner(System.in);
		Bank bank = new Bank();
		bank.addUser(new Profile("Rathmines" , "1234" , 1000.0));
		bank.addUser(new Profile("Megha" , "abcd" , 1500.0));
		System.out.println("Welcome to rathmines banking system");
		boolean running =true;
		while (running)
		{
			System.out.println("\nMain Menu :");
			System.out.println("1.Create a new profile ");
			System.out.println("2. Login to an existing profile");
			System.out.println("Exit");
			System.out.println("choose an option :");
			int mainChoice= scanner.nextInt();
			scanner.nextLine();
			switch(mainChoice)
			{
			case 1:
				System.out.print("Enter a new username:");
				String newUsername=scanner.nextLine();
				
				System.out.print("Enter a new password:");
				String newPassword=scanner.nextLine();
				
				System.out.print("Enter anew initial deposit:");
				double initialDeposit =scanner.nextDouble();
				scanner.nextLine();
				bank.addUser(new Profile(newUsername, newPassword,initialDeposit));
				System.out.println("profile created successfully");
				break;
			case 2 :
						
				System.out.println("Enter your username :");
				String username=scanner.nextLine();
				System.out.println("Enter your password  :");
				String password =scanner.nextLine();
				
				Profile loggedInProfile=bank.login(username,password);
				if(loggedInProfile==null)
				{
					System.out.println("Access Denied : Invalid Username or Password Try again.");
					return;
				}
				if(loggedInProfile != null)
				{
					System.out.println("Access Granted");
					boolean userSession=true;
					while(userSession)
					{
						System.out.println("/n User menu");
						System.out.println("1.check Balance");
						System.out.println("2. Deposit");
						System.out.println("3. Withdraw");
						System.out.println("4. Logout ");
						System.out.println("choose an option");
						int userChoice=scanner.nextInt();
						switch (userChoice)
						{
						case 1:
							System.out.println("Balance:" + loggedInProfile.getBalance());
							break;
						case 2:
							System.out.println("Enter amount to deposit.");
							double depositAmount=scanner.nextDouble();
							loggedInProfile.deposit(depositAmount);
							break;
						case 3:
						System.out.print("Enter an amount to withdraw :");
						double withdrawAmount = scanner.nextDouble();
						loggedInProfile.withdraw(withdrawAmount);
						break;
						
						case 4:
							userSession=false;
						System.out.println("Logged out successfully");
						break;
						
						default:
							System.out.println("Invalid option .Try again ");
						}
					}
				}
				
				else {
					System.out.println("invalid user or password");
				}
				break;
				
				case 3:
				running=false;
				System.out.println("Thank you for using the banking system");
				break;
				
				default:
					System.out.println("Invalid option Try again.");
			}
		
		}
		scanner.close();
		}
}

