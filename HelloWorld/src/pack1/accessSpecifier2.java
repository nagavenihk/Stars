package pack1;
class privAccessSpecifier{
	private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 

}

public class accessSpecifier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Private Access Specifier");
		privAccessSpecifier  obj = new privAccessSpecifier();
		//obj.display;
	}

	}


