import java.util.Scanner;

public class BankTeller {

	private static Bank account  = new Bank(100);
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		char command;
		
		printMenu();
		do {
			System.out.println("\nPlease enter a command or type ?");
			
			command = input.next().toLowerCase().charAt(0);
			switch(command) {
				case'a'://add an account
					int SavingsOrCheckings = -1;
					while (SavingsOrCheckings < 0 || SavingsOrCheckings > 2){
						System.out.print("\n Enter 1 for savings account or 2 for checking Account:");
						SavingsOrCheckings = input.nextInt();}
					
						System.out.print("Enter account holder name:");
						String name = input.next();
					     
					          BankAccount b;
					          if (SavingsOrCheckings == 1) {
					            System.out.print("Enter interest rate: ");
					            int p = input.nextInt();
					            b = new SavingsAccount(name,p);
					          }
				          else {
				            System.out.print("Enter starting check number: ");
				            int t = input.nextInt();
				            b = new CheckingAccount(name,t);
				          }
					          
					          if (account.add(b)){
					          System.out.print("\n Account successfully added.\n");}
			
				          else System.out.print("Account not added. No duplicates please.\n");
				           break;
					
						
				case'b'://remove an account
					System.out.print("\nEnter account number: ");
			          int actNum = input.nextInt();
			          if (account.remove(account.find(actNum))) System.out.print("\nAccount successfully removed.\n");
			          else System.out.print("Account not found. Cannot remove.\n");
			          break;
				case 'c'://display the accounts
					System.out.println(account.toString());
			          break;
				case 'd'://count the accounts
					System.out.println("\nThere are " + account.getCount() + " accounts in the bank");
			          break;
				case 'e'://sort the accounts
					account.sort();
					break;
				case 'f'://update an account
					System.out.print("Enter account number:");
					int accountNumber = input.nextInt();
					
					int update = -1;
					System.out.println("Enter 1 for deposit or 2 for withdraw");
					while (true){
						switch (update){
							case 1:System.out.println("enter ammount");
									
									
								
							case 2:System.out.println("enter ammount");
							
							default:System.out.println("Please enter a 1 or a 2");
							}
					}
				case '?': printMenu();
				case 'q': System.out.println("GOOD BYE!");
							break;	
				default:
				System.out.println("Invalid input try again?");
				
				
					
				
		}}while (command != 'q' );
		input.close();
	}
	
		
	
	
	// this method prints out the menu to a user
	// we put it here to keep the main method clean.
	// and code shorter
	  public static void printMenu() {
	    System.out.print(
	    		  "\nCar Lot Options"
	    		+ "\n" + "-----------------------------------"
	    		+ "\na: add an account to the bank"
				+ "\nb: remove an account from the bank "
				+ "\nc: display the accounts in the bank "
				+ "\nd: count the accounts in the bank "
				+ "\ne: sort the accounts in the bank "
				+ "\nf: update an account in the bank "
				+ "\n?: display the menu again "
				+ "\nq: quit this program");
	  } // end of the printMenu method
	
}
