package oops.relationtype;

public class Employee 
{
	private int id;
	private String name;
	private String dsgn;
	private String orgname;
	private Address address = null;
	public Employee() 
	{
	}
	public Employee(int id, String name, String dsgn, String orgname, Address address) 
	{
		this.id = id;
		this.name = name;
		this.dsgn = dsgn;
		this.orgname = orgname;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDsgn() {
		return dsgn;
	}
	public void setDsgn(String dsgn) {
		this.dsgn = dsgn;
	}
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void disp() 
	{
		System.out.print(getId() + " " + getName() + " " + getDsgn() + " "+getOrgname() + " " );
		Address a = getAddress();
		System.out.println(a.getArea() + " " + a.getCity() + " " + a.getState() + " " + a.getCountry() + " " + a.getContactNO() + " " + a.getPincode());
	}
	public static void main(String[] args) 
	{
		Address rahulAdd = new Address("Isanpur", "Ahm", "Gujarat", "Ind", "21345", "342445");
		Employee rahulEmp = new Employee(1, "rahul", "SE", "Royal", rahulAdd);

		rahulEmp.disp();
		
	} 
}
