package Feb24;

public class Account {
	
	private int id;
	private String name;
	private int balance;
	
	public Account(int id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public int credit(int amount){
		this.balance=this.balance+amount;
		return this.balance;
	}
	
	public int debit(int amount){
		if(amount<=this.balance){
			this.balance=this.balance-amount;
		}else{
			System.out.println("Amount exceeded balance");
		}
		return this.balance;		
	}
	public int transfer(Account a2,int amount){
		if(amount<=this.balance){
			this.balance=this.balance-amount;
			a2.credit(amount);
		}else{
			System.out.println("Amount exceeded balance");
		}
		return this.balance;		
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}	
	
}