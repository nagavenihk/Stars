package pack1;
class defAccessSpecifier {
	void display() 
    { 
        System.out.println("You are using defalut access specifier"); 
    } 
}

public class accessSpecifier1 {

	public static void main(String[] args) {
		//default access specifier
				System.out.println("Default Access Specifier");
				defAccessSpecifier obj = new defAccessSpecifier(); 		  
		        obj.display(); 
			}

	}


