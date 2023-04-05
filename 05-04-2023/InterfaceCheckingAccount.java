/* Create an interface called "BankAccount" with methods called "deposit" and "withdraw". Create a class called "CheckingAccount" that implements the BankAccount interface and 
implements the "deposit" and "withdraw" methods. Create an object of the CheckingAccount
 class and call both the "deposit" and "withdraw" methods. */
 
 interface BankAccount{
   public void deposit();
   public void withdraw();
 
 }
 class CheckingAccount implements BankAccount{
	 
	 public void deposit()
	 {
		 System.out.println("here is deposit method");
	 }
	 public void withdraw()
	 {
		 System.out.println("here is withdraw method");
	 }
 }
 class InterfaceCheckingAccount{
     
    public static void main(String args[])
	{
		CheckingAccount ca =new CheckingAccount();
		ca.deposit();
		ca.withdraw();
	}
 }