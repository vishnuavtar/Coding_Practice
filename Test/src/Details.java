
public class Details {
	
	private int houseNumber;
	private int StreetNumber;
	private String Locality;
	private String city;
	private String state;
	private int pincode;
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public int getStreetNumber() {
		return StreetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		StreetNumber = streetNumber;
	}
	public String getLocality() {
		return Locality;
	}
	public void setLocality(String locality) {
		Locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Details(int houseNumber, int streetNumber, String locality, String city, String state, int pincode) {
		super();
		this.houseNumber = houseNumber;
		StreetNumber = streetNumber;
		Locality = locality;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public Details() {
		super();
	}
	

}
