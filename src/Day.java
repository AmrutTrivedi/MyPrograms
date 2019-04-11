
public enum Day 
{
Sun, Mon, Tue, Wed, Thu, Fri, Sat;
public static void main(String args[])
{
	Day daynow[] = Day.values();
	for(Day Now:daynow)
	{
	switch(Now)
	{
	case Sun:
		System.out.println("Sunday");
	break;
	case Mon:
		System.out.println("Monday");
	break;
	case Tue:
		System.out.println("Monday");
	break;
	case Wed:
		System.out.println("Monday");
	break;
	case Thu:
		System.out.println("Monday");
	break;
	case Fri:
		System.out.println("Monday");
	break;
	case Sat:
		System.out.println("Monday");
	break;
	default:
		break;
	}
	}
}}