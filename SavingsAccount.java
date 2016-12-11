
public class SavingsAccount extends BankAccount {
private double interestRate = 0.01;
	
public SavingsAccount(String in,double s) {
	super(in);
	if(s>0.0 && s<0.1){
		interestRate = s;
	}
	else interestRate=0.01;
}

public double getRate(){
return interestRate;
}
public String toString(){
	double a = (interestRate*100);
	
	return (super.toString() + "Interest Rate: " + String.format("$%,.3f",a) +"%");
}
public void addInterest(){
	balance += (super.balance * interestRate);
	}
}