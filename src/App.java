import static symjava.symbolic.Symbol.*;
import symjava.bytecode.BytecodeFunc;
import symjava.symbolic.*;

//A program to implement the bisection method
//No error checking for undefined values

public class App {
	
    public static void main(String[] args) {


		//Enter your function below
		//Below means: 5x^2 - x - 1
        Expr expr = x.multiply(x).multiply(5).subtract(x).subtract(1); 
		Func f = new Func("f", expr);
		BytecodeFunc F = f.toBytecodeFunc();
		

		//End points:
		double a = -1.0;
		double b = 0;
		//Tolerance: (The accuracy of the root)
		double TOL = 1E-4;
		int MAX = 100;
		

		//End point values must satisfy f(a) > 0 and f(b) < 0.
		//This sign change represents the existance of a root by the Mean Value Theorem
		//Perform error checking
		double f_a = F.apply(a);
		double f_b = F.apply(b);

		//Check for sign by multiplying the two values
		//Kill the program a lack of sign change in the interval (a,b)
		if (f_a > 0 && f_b > 0 || f_a < 0 && f_b < 0) {
			System.out.println("f(a) = "+f_a);
			System.out.println("f(b) = "+f_b);
			System.out.println("By the Mean Value Theorem, the lack of sign change indicates no roots in this interval!");
			System.out.print("Enter values 'a' and 'b' that have a sign change!\n\n");
			System.exit(1);
		}
			double root = bisection(F, a, b, TOL, MAX);
			System.out.println(root);
			System.out.println("f(root) = " + F.apply(root));
    }

	//Bisection method
	//Parameters: function, end points (a,b), Tolerance and Max iterations
	private static double bisection (BytecodeFunc F, double a, double b, double TOL, int MAX) {
		int n = 0;
		double c = 0;
		while (n <= MAX) {
			c = (a + b)/2;

			//exit if f(c) == 0 or (b-a)/2 < TOL
			if (F.apply(c) == 0 || (b-a)/2 < TOL) {
				return c;
			}
			System.out.println(c);
			n +=1;
			//Check the sign of f(c) to assign a new boundary 
			if (F.apply(c) > 0 && F.apply(a) > 0) {
				a = c;
			}
			else {
				b = c;
			}
		}

		return c;
	} 
}
