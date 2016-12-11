// Name:Isaha Miller (collaborators Oscar Arline Adam Swann, Frazer, Morton help from Ms Smith and Mr Wyatt)
// Assignment: PA12 BankAccount
// Description: This class is used to create BankAccount objects
// Time spent: 2.5 hours

import java.util.Random;
import java.util.Date;

public class BankAccount {
protected String name;
protected double balance;
protected int acctNum;
protected Date date;
protected static int accountsCreated;


public BankAccount(String in){
name = in;
balance = 0.0;
acctNum = generateAcctNum();
date=new Date();
accountsCreated+= 1;
}


public double getBalance(){
	return balance;
}

public int getAccountNumber(){
return acctNum;
}
public boolean deposit(double money){
	if(money>0){
	balance += money;
	return true;	
	}
	else return false;
	
}
public boolean withdraw(double money){
	if (money >= balance || money>0)
	{balance -= money;
		return true;}
	else return false; 
		
	
}
public boolean transfer(BankAccount a, double amt){
	if(amt >= 0.0 && amt <= balance){
		withdraw(amt);
		a.deposit(amt);
		return true;
	}
	return false;
}
public String toString(){
	return (name + " [" + acctNum + "]\n"
			+ date.toString() +'\n'
			+ String.format("$%,.2f",balance)
			);
	
}
public boolean equals( BankAccount n){
	if (name.equals(n))
	return true;
	else return false;
	
}
protected int generateAcctNum() {
    Random r = new Random();
    String s = r.nextInt(9) + 1 + "";
    for (int i = 1; i <= 8; i++)
      s += r.nextInt(10);
    return Integer.parseInt(s);
  }

public static int getAccountsCreated(){
	return accountsCreated;
}
}


