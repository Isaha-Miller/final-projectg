
public class CheckingAccount extends BankAccount {

private int checkNumber = 1000;

public CheckingAccount(String in, int s){
	super(in);
	if (checkNumber >1){
		checkNumber = s;
	}
	else checkNumber = 1000;
}
public int getCheckNumber(){
	return checkNumber;
}
public String toString(){
	return (super.toString() +  "\n checking number is:" + checkNumber);
	}



public void writeCheck(){
	checkNumber ++;	
}

}
