package pack1;
class Employee{
	int id;
	String name;
	
//default constructor
	
void display() {
	System.out.println(id+" "+name);
	}
}
public class defConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		Employee emp2=new Employee();

		emp1.display();
		emp2.display();

	}

}
