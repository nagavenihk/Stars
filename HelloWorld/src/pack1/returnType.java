package pack1;


public class returnType {
	int val=50;

	int operation(int val) {
		val =val*10/100;
		return(val);
	}

	public static void main(String args[]) {
		returnType m = new returnType();
		System.out.println("Before operation value : "+m.val);
		//calling method		
		m.operation(100);
		System.out.println("After operation value : "+m.val);
	}
}
