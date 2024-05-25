package Feb24;

public class Customer {
	
	
	private int id;
	private String name;
	private char gender;
	
	public Customer(int id, String name, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
}

//public class Account  {
//	
//	private int id;
//	private Customer customer;
//	private int balance;
//	
//	public Account(int id, Customer customer, int balance) {
//		this.id = id;
//		this.customer = customer;
//		this.balance = balance;
//	}
//	
//	public int credit(int amount){
//		this.balance=this.balance+amount;
//		return this.balance;
//	}
//	
//	public int debit(int amount){
//		if(amount<=this.balance){
//			this.balance=this.balance-amount;
//		}else{
//			System.out.println("Amount exceeded balance");
//		}
//		return this.balance;		
//	}
//	public int transfer(Account a2,int amount){
//		if(amount<=this.balance){
//			this.balance=this.balance-amount;
//			a2.credit(amount);
//		}else{
//			System.out.println("Amount exceeded balance");
//		}
//		return this.balance;		
//	}
//
//	@Override
//	public String toString() {
//		return "Account [id=" + id + ", customer=" + customer + ", balance=" + balance + "]";
//	}
//
//}