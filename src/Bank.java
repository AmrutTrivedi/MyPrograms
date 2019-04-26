
class Bank {
	void getrateofinterest(float x)
	{
		System.out.println("The interest of various banks are:"+x);
	}}
class SBI extends Bank{
	void getrateofinterest(float x)
	{
		System.out.println("The Rate Of Interest for SBI IS:"+x);
	}}
class ICICI extends Bank{
	void getrateofinterest(float x)
	{
		System.out.println("The Rate Of Interest for ICICI IS:"+x);
	}}
class AXIS extends Bank{
	void getrateofinterest(float x)
	{
		System.out.println("The Rate Of Interest for AXIS IS:"+x);
	}
}
class Poly{
public static void main(String[] args)
{
	Bank b = new SBI();
	Bank b1 = new ICICI();
	Bank b2 = new AXIS();
	
	b.getrateofinterest(8.4F);
	b1.getrateofinterest(7.3F);
	b2.getrateofinterest(9.7F);

}}


