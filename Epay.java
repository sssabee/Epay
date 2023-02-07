package sab;
public class Epay {

	private static final int Id = 0;
	private static final String RewardPoints = null;
	private String userName;
	private double walletBalance;

	//constructor to initialize variable
	public void user(int id, String userName, String emailId, double walletBalance) {
	this.userName = userName;
	this.walletBalance = walletBalance;
	}
	//method to make payment
	public boolean makePayment() {
	System.out.println("Insufficient funds!");
	return false;

	}
	public int getId() {
	return Id;
	}
	public void setId(int id) {
	}
	public String getUserName() {
	return userName;
	}
	public void setUserName(String userName) {
	this.userName = userName;
	}
	public String getEmailId() {
	return getEmailId();
	}
	public String setEmailId(String emailId) {
	return emailId;
	}
	public double getWalletBalance(){
	return walletBalance;
	}
	public double setWalletBalance(double walletBalance) {
	return walletBalance;
	}

	class PremiumUser{
	//constructor to initialize variables
	public PremiumUser(int id, String userName, String emailId, double walletBalance) {
	} 
	public boolean makePayment(int rewardPoints) {
	System.out.println("Insufficient funds!");
	return false;
	}

	public int getRewardPoints() {
	return Id;
	}
	public String setRewardPoints() {
	return RewardPoints;
	}
	public class Main{
	public static void main(String args[]) {
	Epay e = new Epay();

	//call make Payment() method
	System.out.println("The Wallet Balance is: " + walletBalance());
	System.out.println();
	System.out.println("Epay info: " + e.print() + "The Reward Points for this use");
	}

	private static String walletBalance() {
		// TODO Auto-generated method stub
		return null;
	}
	}

	public String print() {
		// TODO Auto-generated method stub
		return null;
	}
	}

	public String print() {
		// TODO Auto-generated method stub
		return null;
	}
	}
	




