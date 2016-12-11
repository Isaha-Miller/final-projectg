
public class Bank {
  private BankAccount[] accounts;
  private int count;

  public Bank(int cap) {
    accounts = new BankAccount[cap];
    count = 0;
  }

  private int indexOf(BankAccount a) {
	  if (a == null) return -1;
	  for (int i = 0; i < count; i++)
	  if (accounts[i].equals(a)) return i;
	  return -1;
	  }
  public BankAccount find(int acct) {
	  for (int i = 0; i < count; i++)
	  if (accounts[i].getAccountNumber() == acct) return accounts[i];
	  return null;
	  }

	

  public boolean contains(BankAccount a) {
    if (indexOf(a) != -1){
    return true;}
    else return false;
  }

  public boolean add(BankAccount a) {
	  if (count >= accounts.length)
			return false;
		if (contains(a))
			return false;
		accounts[count] = a;
		count++;
		return true;

  }

  public boolean remove(BankAccount a) {
	  if (!contains(a))
			return false;
		int location = indexOf(a);
		accounts[location] = accounts[count - 1];
		accounts[count - 1] = null;
		count--;
		return true;

  }

  public int getCount() {
    return count;
  }

  public void sort() {
	  BankAccount[] temp = new BankAccount[accounts.length];
		int m = 0;

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				temp[m] = accounts[i];
				m++;
		}
		}
  
		
  }


  protected void doubleCapacity() {
	  BankAccount[] temp = new BankAccount[count * 2];
		for (int i = 0; i < count; i++) {
			temp[i] = accounts[i];
		}
		accounts = temp;

  }

  protected boolean full() {
    return count == accounts.length;
  }
  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Bank Accounts\n");
	    for (int i = 0; i < count; i++)
	      sb.append(accounts[i] + "\n    **************    \n");
	    return sb.toString();
	  } 
}