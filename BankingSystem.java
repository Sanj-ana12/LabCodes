package text;
import java.util.Scanner;
public class BankingSystem {
String accountnumber;
String accountholder;
Double balance;
BankingSystem(String acc, String acco, double bal){
	accountnumber= acc;
	accountholder= acco;
	balance= bal;
}
    public void deposit(double amount) {
    	if(amount > 0) {
			balance += amount;
			System.out.println("Invalid amount");
    	}		
    }
     public void withdraw(double amount) {
    	 if (amount>0 && amount<= balance) {
    		 balance -= amount;
    		 System.out.println("withdrawn: "+amount);
    	 }else {
    		 System.out.println("insufficient balance");
    	 }
     }
     public void displaybalance() {
    	 System.out.println("account:"+accountnumber+"|holder:"+accountholder+"|balance:"+balance);
     }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String accnumber1=sc.nextLine();
		String accoholder1= sc.nextLine();
		double balance1= sc.nextDouble();
		BankingSystem acc1=new BankingSystem (accnumber1, accoholder1, balance1);
		acc1.displaybalance();
		acc1.deposit(50000);
		acc1.withdraw(3000);
		acc1.displaybalance();
		
	}
	

}
