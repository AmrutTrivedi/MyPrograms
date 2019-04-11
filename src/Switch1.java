
public class Switch1 {  
	public static void main(String[] args) {    
	    String levelString="Intermediate";  
	    int level=4, l;
	    switch(levelString){    
	    
	    case "Beginner":
	    level=0;  
	    l=level - 3;
	    break;    
	    
	    case "Intermediate":
	    level=1;  
	    l=level - 2;
	    break;    
	    
	    case "Expert":
	    level=2;
	    l=level - 3;
	    break;    
	    
	    default: level=0;  
	    l=level - 4;
	    break;  
	    
	    }    
	    System.out.println("Your Level is: "+level);  
	}    
	}   
	