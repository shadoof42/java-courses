import java.lang.Math.*;
public class Calculate{
	public static void main (String... arg){
		System.out.println("Calculate...");
		if(arg[0]!=null&&arg[1]!=null){
			double first = Double.valueOf(arg[0]);
			double second = Double.valueOf(arg[1]);
			double sum = first + second;
			double sub = first - second;
			double multi = first*second;
			double div = first/second;
			double power = Math.pow(first,second);
			System.out.println("Sum = " + sum);
			System.out.println("Sub = " + sub);
			System.out.println("Multiplication = " + multi);
			System.out.println("Division = " + div);
			System.out.println("Power = " + power);
		}else{
			System.out.println("Enter two numbers!");
		}
	}
}