package pack1;
class Student{
	final String usn;
	Student(String usn){
		this.usn=usn;
		
	}
}

public class paraConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student("EC00001");
		Student st2=new Student("EC00002");
		System.out.println("usn of the 1st student:"+st1.usn);
		System.out.println("usn of the 2st student:"+st2.usn);

	}

}
