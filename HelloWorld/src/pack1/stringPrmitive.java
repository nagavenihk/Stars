package pack1;

public class stringPrmitive {
	public static void main(String[] args) {
		
	
	String strObject = "124";
	 
	try{
	    
	    int i = Integer.parseInt(strObject);
	    System.out.println("String to int: " + i);
	    
	}catch(NumberFormatException nfe){
	    System.out.println("Invalid number");
	}
	try{
	    
	    long l = Long.parseLong(strObject);
	    System.out.println("String to long: " + l);
	    
	}catch(NumberFormatException nfe){
	    System.out.println("Invalid number");
	}
	try{
	    
	    float f = Float.parseFloat(strObject);
	    System.out.println("String to float: " + f);
	    
	}catch(NumberFormatException nfe){
	    System.out.println("Invalid number");
	}
	try{
	    
	    double d = Double.parseDouble(strObject);
	    System.out.println("String to double: " + d);
	    
	}catch(NumberFormatException nfe){
	    System.out.println("Invalid number");
	}
	}
}
