
public class Address {
String city,state,country;

public Address(String city,String state,String country)
{
	this.city = city;
	this.state = state;
	this.country = country;
}
}
class Emp{
	int id;
	String Name;
	Address address;

	Emp(int id,String Name,Address address)
	{
		this.id = id;
		this.Name = Name;
		this.address = address;	
	}
	void print()
	{
		System.out.println(id+" "+Name);
		System.out.println(address.city+"  "+address.state+" "+address.country);
		
	}
	public static void main(String args[])
	{
		Address address1 = new Address("Chennai","TN","India");
		Address address2 = new Address("Chennai","TN","India");
		
		Emp e = new Emp(105,"Rajesh",address1);
		Emp e1 = new Emp(106,"Mohit",address2);		
		e.print();
		e1.print();
	}
}
