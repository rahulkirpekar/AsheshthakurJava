package oops.relationtype;

public class Address 
{
	private String area;
	private String city;
	private String state;
	private String country;
	private String contactNO;
	private String pincode;
	public Address() 
	{
		
	}
	public Address(String area, String city, String state, String country, String contactNO, String pincode) 
	{
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.contactNO = contactNO;
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getContactNO() {
		return contactNO;
	}
	public void setContactNO(String contactNO) {
		this.contactNO = contactNO;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
}
