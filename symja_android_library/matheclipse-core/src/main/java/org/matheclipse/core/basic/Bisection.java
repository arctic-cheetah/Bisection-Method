package org.matheclipse.core.basic;


import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.interfaces.IExpr;
import java.util.*;

//The bisection method using the Java Library SymLab

public class Bisection {
   static double PRECISION = 1E-10;

   public static void main(String[] args) {
      ExprEvaluator util = new ExprEvaluator(false, (short) 100);
      Scanner scanf = new Scanner(System.in);
      
      //Fetch a function in terms of x from the user

      System.out.print("Enter a continuous function f(x): ");
      String f = scanf.nextLine();
      System.out.println("f(x) = "+f);
      
      System.out.print("Enter the lower bound a: ");
      String a = scanf.nextLine();

      System.out.print("Enter the upper bound b: ");
      String b = scanf.nextLine();


      //Find f(a)
      util.eval("x="+a);
      IExpr f_a = util.eval(f);

      //Find f(b)
      util.eval("x="+b);
      IExpr f_b = util.eval(f);

      //f(a) and f(b) must be of opposite signs!
      //For the bisection theorem to work
      if ( (f_b.toDoubleDefault() > 0 && f_a.toDoubleDefault() > 0) || (f_b.toDoubleDefault() < 0 && f_a.toDoubleDefault() < 0) ) {
        System.out.println("f(a) = "+f_a);
        System.out.println("f(b) = "+f_b);
        System.out.println("By the Mean Value Theorem, the lack of sign change indicates no roots in this interval!");
        System.out.print("Enter values 'a' and 'b' that have a sign change!\n\n");
        System.exit(1);
      }

      //Tolerance(level of accuracy)
      double TOL = 1E-5;
      //Number of iterations
      int MAX = 100;

      //Find the root between [a,b]
      double root = B_method(f, a, b, TOL, MAX, util);
      util.eval("x="+root);

      System.out.println("Root exists at c = "+root);
      System.out.println("f(c) = "+util.eval(f));

      scanf.close();

  }

    public static double B_method(String f, String a, String b, double TOL, int MAX, ExprEvaluator util) {
      
      int n = 0;
      Double c = 0.0;
      Double f_c = 0.0;
      Double f_a = 0.0;

      while (n <= MAX) {
        //Get the midpoint
        c = (Double.parseDouble(a) + Double.parseDouble(b)) / 2;
        //Evaluate f(c)
        util.eval("x="+c);
        f_c = util.eval(f).toDoubleDefault();
        
        //Check if accuracy is met or answer is within tolerance
        if ( (-PRECISION < f_c && f_c < PRECISION) || ( ((Double.parseDouble(b) - Double.parseDouble(a)) / 2) < TOL) )
        {
          return c;
        }
        n +=1;
        System.out.println(n+": "+c);

        //Evaluate f(a)
        util.eval("x="+a);
        f_a = util.eval(f).toDoubleDefault();
        //Check if the sign of f(c) is the same as f(a).
        if ( (f_a > 0 && f_c > 0) || (f_a < 0 && f_c < 0) ) {
          a = c.toString();
        }
        else {
          b = c.toString();
        }


      }
      return c;
    }
}
