class BankAccount{
static double balance;

public static void credited(double amount){
	System.out.println("Credited started");
	balance = balance + amount;
	System.out.println("credited to bank account" + balance);
	System.out.println("thank credited ended");
	
}



public static void debited(double amount){
	System.out.println("debited started");
	balance= balance - amount;
	System.out.println("debited to bank account" + balance);
	System.out.println("thank debited ended");
		
}

public static double checkBalance(){
	return balance;
}
}



