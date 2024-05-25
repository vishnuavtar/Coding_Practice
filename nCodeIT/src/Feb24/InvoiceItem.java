package Feb24;

// Task6: Design a class called InvoiceItem, which models an item of an invoice, with ID, description, quantity and unit price. Add a method to getTotalPrice (unit price * quantity) and add toString method to print below msg.

public class InvoiceItem {

	private int id;
	private String desc;
	private int qty;
	private float unitPrice;
	
	public InvoiceItem(int id, String desc, int qty, float unitPrice) {
		super();
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	
	public float getTotal(){
		return this.unitPrice*this.qty;
	}

	@Override
	public String toString() {
		return "InvoiceItem [id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
	}

}

