package inheritance;

interface Account {
    public default String getId() {
        return "0000";
    }
}

interface PremiumAccount extends Account {
    //public String getId();
	
	 public default String getId() {
         return Account.super.getId();
   }
}

public class BankAccount_override implements PremiumAccount {
//	public String getId(){
	//	return "0002";
	//}
	
	public String getId(){
		return PremiumAccount.super.getId();
	}
	
	
    public static void main(String args[]) {
        Account acct = new BankAccount_override();
        System.out.println(acct.getId());

	}
}

