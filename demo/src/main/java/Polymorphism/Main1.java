package Polymorphism;

class Main1 {
	
	void f1() {
		System.out.println("THis is main1");
	}

}

class  methodOverriding extends Main1{
	
	void f1() {
		System.out.println("This is methodOverriding class");
	}
}

class methodOverriding2 extends Main1{
	
	void f1() {
		System.out.println("This is methodOverriding2 class");
	}
}
