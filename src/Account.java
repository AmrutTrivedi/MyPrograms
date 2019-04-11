
public class Account {
int acc_no;
String name;
int amount;

void insert(int a,String n,int amt)
{
acc_no = a;
name = n;
amount = amt;
}
void accountstatement(int amt)
{
	if(amount<amt)
	{
		System.out.println("low Balance:"+amt);	
	}
	else 
	{
		amount = amount +amt;
		System.out.println("The Account Statment is:"+amt);
	
	}
	
}
}
class account1{
	public static void main(String args[])
	{
		Account A1 = new Account();
		Account A2 = new Account();
		A1.insert(100044,"Rakesh",5000);
		A1.accountstatement(2000);
		A2.insert(100056,"Umesh",10000);
		A2.accountstatement(20000);
		
	}
}