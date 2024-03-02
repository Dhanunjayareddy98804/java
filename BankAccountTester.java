class BankAccountTester{
public static void main(String account[]){

double currentBalance = BankAccount.checkBalance();
System.out.println("Existing balnce is:" + currentBalance);
BankAccount.credited(2000.00);

double currentBalance1 = BankAccount.checkBalance();
System.out.println("Existing balance is:" + currentBalance1);
BankAccount.debited(500.00);

double currentBalance2 = BankAccount.checkBalance();
System.out.println("Existing balance is:" + currentBalance2);




}





}