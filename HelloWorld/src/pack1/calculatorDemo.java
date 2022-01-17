package pack1;
import java.util.Scanner;
public class calculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		double num2;
		double ans;
		char op;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		num1=scan.nextDouble();
		num2=scan.nextDouble();
		System.out.println("Enter an operator:");
		op=scan.next().charAt(0);
		switch(op) {
		case '+': ans=num1+num2;
				break;
		case '-': ans=num1-num2;
				break;
		case '*': ans=num1*num2;
				break;
		case '/': ans=num1/num2;
				break;
		default:System.out.println("Error! Enter correct operator");
			return;
		}
		System.out.println("\n The result of the given output:");
		System.out.println(num1+" "+op+" "+num2+"="+ans);
		

	}

}
