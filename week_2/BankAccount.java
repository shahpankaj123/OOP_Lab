package week_2;

public class BankAccount {
	
	private double bankBalance;
	private String accountHolderName;
	private String accountNumber;
	
	BankAccount(){
		bankBalance = 0;
		accountHolderName = "Test User";
		accountNumber = "0000000001";
	}
	BankAccount(String m ,String n ,double b){
		bankBalance = b;
		accountHolderName = m;
		accountNumber = n;	
	}
	
	public void transferBalance(double money) {
		bankBalance -= money;
	}
	
	public void depositMoney(double money) {
		bankBalance += money;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return bankBalance;
	}
	
	public static String getBankCode() {
		return "EVR001";
	}
	
	
	public static void main(String[] args) {
		
		BankAccount everestBankAccount = new BankAccount();
		System.out.println("Account Holder Name: " + everestBankAccount.getAccountHolderName());	
		System.out.println("Bank Balance: " + everestBankAccount.getBalance());
		System.out.println("Bank Code : " + BankAccount.getBankCode());
		
		
		BankAccount nabilBankAccount = new BankAccount("Pankaj shah","0870050120084",2.0);
		System.out.println("Account Holder Name: " + nabilBankAccount.getAccountHolderName());	
		System.out.println("Bank Balance: " + nabilBankAccount.getBalance());
		System.out.println("Bank Code : " + BankAccount.getBankCode());

}
}
