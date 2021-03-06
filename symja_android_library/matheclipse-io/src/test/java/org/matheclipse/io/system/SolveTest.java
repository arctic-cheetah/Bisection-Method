package org.matheclipse.io.system;

import org.matheclipse.core.basic.Config;
import org.matheclipse.core.eval.EvalEngine;

/** Tests forSolve and Roots functions */
public class SolveTest extends AbstractTestCase {

  public SolveTest(String name) {
    super(name);
  }

  public void testEliminate() {
    check(
        "Eliminate({(a*x + b)/(c*x + d)==y},x)", //
        "True");
    //    check(
    //        "Eliminate(E^(-x)==0,x)", //
    //        "False");
    checkNumeric(
        "Eliminate(Abs(x-1)==(-1),x)", //
        "True");
  }

  public void testSolveHomogenization() {
    // TODO improve result by avoiding GCD 1/2
    check(
        "Solve(E^(3*x)-4*E^x+3*E^(-x)==0,x)", //
        "{{x->ConditionalExpression(I*2*Pi*C(1),C(1)∈Integers)},{x->ConditionalExpression(I*Pi+\n"
            + "I*2*Pi*C(1),C(1)∈Integers)},{x->ConditionalExpression(1/2*(I*2*Pi*C(1)+Log(3)),C(\n"
            + "1)∈Integers)}}");
  }

  public void testRootsX6001() {
    check(
        "Roots(x^6-1==0, x)", //
        "x==1||x==-1||x==(-1)^(1/3)||x==-(-1)^(1/3)||x==(-1)^(2/3)||x==-(-1)^(2/3)");
  }

  public void testRootsX16001() {
    check(
        "Roots(x^16-1==0,x)", //
        "x==1||x==-1||x==I||x==-I||x==(-1)^(1/8)||x==-(-1)^(1/8)||x==(-1)^(1/4)||x==-(-1)^(\n"
            + "1/4)||x==(-1)^(3/8)||x==-(-1)^(3/8)||x==(-1)^(5/8)||x==-(-1)^(5/8)||x==(-1)^(3/4)||x==-(-\n"
            + "1)^(3/4)||x==(-1)^(7/8)||x==-(-1)^(7/8)");
  }

  public void testSolveX16001() {
    check(
        "Solve(x^16-1==0,x)", //
        "{{x->-1},{x->-I},{x->I},{x->1},{x->-(-1)^(1/8)},{x->(-1)^(1/8)},{x->-(-1)^(1/4)},{x->(-\n"
            + "1)^(1/4)},{x->-(-1)^(3/8)},{x->(-1)^(3/8)},{x->-(-1)^(5/8)},{x->(-1)^(5/8)},{x->-(-\n"
            + "1)^(3/4)},{x->(-1)^(3/4)},{x->-(-1)^(7/8)},{x->(-1)^(7/8)}}");
  }

  public void testSolveX16002() {
    check(
        "Solve(x^16+1==0,x)", //
        "{{x->-(-1)^(1/16)},{x->(-1)^(1/16)},{x->-(-1)^(3/16)},{x->(-1)^(3/16)},{x->-(-1)^(\n"
            + "5/16)},{x->(-1)^(5/16)},{x->-(-1)^(7/16)},{x->(-1)^(7/16)},{x->-(-1)^(9/16)},{x->(-\n"
            + "1)^(9/16)},{x->-(-1)^(11/16)},{x->(-1)^(11/16)},{x->-(-1)^(13/16)},{x->(-1)^(13/\n"
            + "16)},{x->-(-1)^(15/16)},{x->(-1)^(15/16)}}");
  }

  public void testSolveAX3B001() {
    check(
        "Solve(a*x^3+b==0,x)",
        "{{x->-b^(1/3)/a^(1/3)},{x->((-1)^(1/3)*b^(1/3))/a^(1/3)},{x->(-(-1)^(2/3)*b^(1/3))/a^(\n"
            + "1/3)}}");
  }

  public void testSolveX4B001() {
    // check("Trace(Solve(x^6-b==0,x))",
    // "???");
    check(
        "Solve(x^4+b==0,x)", //
        "{{x->(-1)^(1/4)*b^(1/4)},{x->-(-1)^(1/4)*b^(1/4)},{x->(-1)^(3/4)*b^(1/4)},{x->-(-\n"
            + "1)^(3/4)*b^(1/4)}}");
  }

  public void testSolveX4B002() {
    check(
        "Solve(x^4-b==0,x)", //
        "{{x->-b^(1/4)},{x->-I*b^(1/4)},{x->I*b^(1/4)},{x->b^(1/4)}}");
  }

  public void testSolveAX5B001() {
    check(
        "Solve(a*x^5+b==0,x)",
        "{{x->-b^(1/5)/a^(1/5)},{x->((-1)^(1/5)*b^(1/5))/a^(1/5)},{x->(-(-1)^(2/5)*b^(1/5))/a^(\n"
            + "1/5)},{x->((-1)^(3/5)*b^(1/5))/a^(1/5)},{x->(-(-1)^(4/5)*b^(1/5))/a^(1/5)}}");
  }

  public void testSolveAX5B002() {
    check(
        "Solve(a*x^5-b==0,x)",
        "{{x->b^(1/5)/a^(1/5)},{x->(-(-1)^(1/5)*b^(1/5))/a^(1/5)},{x->((-1)^(2/5)*b^(1/5))/a^(\n"
            + "1/5)},{x->(-(-1)^(3/5)*b^(1/5))/a^(1/5)},{x->((-1)^(4/5)*b^(1/5))/a^(1/5)}}");
  }

  public void testSolve7X519002() {
    check(
        "Solve(7*x^5-19==0,x) ",
        "{{x->(19/7)^(1/5)},{x->(-1)^(2/5)*(19/7)^(1/5)},{x->-(-1)^(3/5)*(19/7)^(1/5)},{x->(-\n"
            + "1)^(4/5)*(19/7)^(1/5)},{x->-(-19)^(1/5)/7^(1/5)}}");
    check(
        "Solve(7*x^5-19==0,x) // N",
        "{{x->1.22104},{x->0.377323+I*1.16128},{x->0.377323+I*(-1.16128)},{x->-0.987845+I*0.717711},{x->-0.987845+I*(-0.717711)}}");
  }

  public void testSolveX6B001() {
    check(
        "Solve(x^6+b==0,x)", //
        "{{x->-I*b^(1/6)},{x->I*b^(1/6)},{x->(-1)^(1/6)*b^(1/6)},{x->-(-1)^(1/6)*b^(1/6)},{x->(-\n"
            + "1)^(5/6)*b^(1/6)},{x->-(-1)^(5/6)*b^(1/6)}}");
  }

  public void testSolveX6B002() {
    check(
        "Solve(x^6-b==0,x)",
        "{{x->-b^(1/6)},{x->b^(1/6)},{x->(-1)^(1/3)*b^(1/6)},{x->-(-1)^(1/3)*b^(1/6)},{x->(-\n"
            + "1)^(2/3)*b^(1/6)},{x->-(-1)^(2/3)*b^(1/6)}}");
  }

  public void testSolveX8B001() {
    check(
        "Solve(x^8+b==0,x)", //
        "{{x->(-1)^(1/8)*b^(1/8)},{x->-(-1)^(1/8)*b^(1/8)},{x->(-1)^(3/8)*b^(1/8)},{x->-(-\n"
            + "1)^(3/8)*b^(1/8)},{x->(-1)^(5/8)*b^(1/8)},{x->-(-1)^(5/8)*b^(1/8)},{x->(-1)^(7/8)*b^(\n"
            + "1/8)},{x->-(-1)^(7/8)*b^(1/8)}}");
  }

  public void testSolveX8B002() {
    check(
        "Solve(x^8-b==0,x)", //
        "{{x->-b^(1/8)},{x->-I*b^(1/8)},{x->I*b^(1/8)},{x->b^(1/8)},{x->(-1)^(1/4)*b^(1/8)},{x->-(-\n"
            + "1)^(1/4)*b^(1/8)},{x->(-1)^(3/4)*b^(1/8)},{x->-(-1)^(3/4)*b^(1/8)}}");
  }

  public void testSolveX10001() {
    check(
        "Solve(x^10-1==0,x)", //
        "{{x->-1},{x->1},{x->-(-1)^(1/5)},{x->(-1)^(1/5)},{x->-(-1)^(2/5)},{x->(-1)^(2/5)},{x->-(-\n"
            + "1)^(3/5)},{x->(-1)^(3/5)},{x->-(-1)^(4/5)},{x->(-1)^(4/5)}}");
  }

  public void testSolveX10002() {
    check(
        "Solve(x^10-15==0,x)", //
        "{{x->-15^(1/10)},{x->15^(1/10)},{x->(-1)^(1/5)*15^(1/10)},{x->-(-1)^(1/5)*15^(1/\n"
            + "10)},{x->(-1)^(2/5)*15^(1/10)},{x->-(-1)^(2/5)*15^(1/10)},{x->(-1)^(3/5)*15^(1/\n"
            + "10)},{x->-(-1)^(3/5)*15^(1/10)},{x->(-1)^(4/5)*15^(1/10)},{x->-(-1)^(4/5)*15^(1/\n"
            + "10)}}");
  }

  public void testSolveX10B001() {
    check(
        "Solve(x^10+b==0,x)",
        "{{x->-I*b^(1/10)},{x->I*b^(1/10)},{x->(-1)^(1/10)*b^(1/10)},{x->-(-1)^(1/10)*b^(\n"
            + "1/10)},{x->(-1)^(3/10)*b^(1/10)},{x->-(-1)^(3/10)*b^(1/10)},{x->(-1)^(7/10)*b^(1/\n"
            + "10)},{x->-(-1)^(7/10)*b^(1/10)},{x->(-1)^(9/10)*b^(1/10)},{x->-(-1)^(9/10)*b^(1/\n"
            + "10)}}");
  }

  public void testSolveX10B002() {
    check(
        "Solve(x^10-b==0,x)", //
        "{{x->-b^(1/10)},{x->b^(1/10)},{x->(-1)^(1/5)*b^(1/10)},{x->-(-1)^(1/5)*b^(1/10)},{x->(-\n"
            + "1)^(2/5)*b^(1/10)},{x->-(-1)^(2/5)*b^(1/10)},{x->(-1)^(3/5)*b^(1/10)},{x->-(-1)^(\n"
            + "3/5)*b^(1/10)},{x->(-1)^(4/5)*b^(1/10)},{x->-(-1)^(4/5)*b^(1/10)}}");
  }

  public void testSolveAX10B001() {
    check(
        "Solve(a*x^10+b==0,x)",
        "{{x->(-I*b^(1/10))/a^(1/10)},{x->(I*b^(1/10))/a^(1/10)},{x->((-1)^(1/10)*b^(1/10))/a^(\n"
            + "1/10)},{x->(-(-1)^(1/10)*b^(1/10))/a^(1/10)},{x->((-1)^(3/10)*b^(1/10))/a^(1/10)},{x->(-(-\n"
            + "1)^(3/10)*b^(1/10))/a^(1/10)},{x->((-1)^(7/10)*b^(1/10))/a^(1/10)},{x->(-(-1)^(7/\n"
            + "10)*b^(1/10))/a^(1/10)},{x->((-1)^(9/10)*b^(1/10))/a^(1/10)},{x->(-(-1)^(9/10)*b^(\n"
            + "1/10))/a^(1/10)}}");
  }

  public void testSolveAX8B001() {
    check(
        "Solve(a*x^8+b==0,x)", //
        "{{x->((-1)^(1/8)*b^(1/8))/a^(1/8)},{x->(-(-1)^(1/8)*b^(1/8))/a^(1/8)},{x->((-1)^(\n"
            + "3/8)*b^(1/8))/a^(1/8)},{x->(-(-1)^(3/8)*b^(1/8))/a^(1/8)},{x->((-1)^(5/8)*b^(1/8))/a^(\n"
            + "1/8)},{x->(-(-1)^(5/8)*b^(1/8))/a^(1/8)},{x->((-1)^(7/8)*b^(1/8))/a^(1/8)},{x->(-(-\n"
            + "1)^(7/8)*b^(1/8))/a^(1/8)}}");
  }

  public void testSolveAX11B001() {
    check(
        "Solve(a*x^11-b==0,x)",
        "{{x->b^(1/11)/a^(1/11)},{x->(-(-1)^(1/11)*b^(1/11))/a^(1/11)},{x->((-1)^(2/11)*b^(\n"
            + "1/11))/a^(1/11)},{x->(-(-1)^(3/11)*b^(1/11))/a^(1/11)},{x->((-1)^(4/11)*b^(1/11))/a^(\n"
            + "1/11)},{x->(-(-1)^(5/11)*b^(1/11))/a^(1/11)},{x->((-1)^(6/11)*b^(1/11))/a^(1/11)},{x->(-(-\n"
            + "1)^(7/11)*b^(1/11))/a^(1/11)},{x->((-1)^(8/11)*b^(1/11))/a^(1/11)},{x->(-(-1)^(9/\n"
            + "11)*b^(1/11))/a^(1/11)},{x->((-1)^(10/11)*b^(1/11))/a^(1/11)}}");
  }

  public void testSolveX24B001() {
    check(
        "Solve(x^24==1,x)", //
        "{{x->-1},{x->-I},{x->I},{x->1},{x->-(-1)^(1/12)},{x->(-1)^(1/12)},{x->-(-1)^(1/6)},{x->(-\n"
            + "1)^(1/6)},{x->-(-1)^(1/4)},{x->(-1)^(1/4)},{x->-(-1)^(1/3)},{x->(-1)^(1/3)},{x->-(-\n"
            + "1)^(5/12)},{x->(-1)^(5/12)},{x->-(-1)^(7/12)},{x->(-1)^(7/12)},{x->-(-1)^(2/3)},{x->(-\n"
            + "1)^(2/3)},{x->-(-1)^(3/4)},{x->(-1)^(3/4)},{x->-(-1)^(5/6)},{x->(-1)^(5/6)},{x->-(-\n"
            + "1)^(11/12)},{x->(-1)^(11/12)}}");
  }

  public void testSolveX4_15001() {
    // github #204
    check(
        "Solve(x^4 - 15 == 0, x)", //
        "{{x->-15^(1/4)},{x->-I*15^(1/4)},{x->I*15^(1/4)},{x->15^(1/4)}}");
  }

  public void testSolveX4_15002() {
    check(
        "Solve(x^4 + 15 == 0, x) ", //
        "{{x->-(-15)^(1/4)},{x->-I*(-15)^(1/4)},{x->I*(-15)^(1/4)},{x->(-15)^(1/4)}}");
  }

  public void testSolveX3_15001() {
    check(
        "Solve(x^3 + 15 == 0, x)", //
        "{{x->(-15)^(1/3)},{x->-15^(1/3)},{x->-(-1)^(2/3)*15^(1/3)}}");
  }

  public void testSolveX3_15002() {
    check(
        "Solve(x^3 - 15 == 0, x)", //
        "{{x->-(-15)^(1/3)},{x->15^(1/3)},{x->(-1)^(2/3)*15^(1/3)}}");
  }

  public void testSolveX7_15001() {
    check(
        "Solve(x^7 + 15 == 0, x)", //
        "{{x->(-15)^(1/7)},{x->-15^(1/7)},{x->-(-1)^(2/7)*15^(1/7)},{x->(-1)^(3/7)*15^(1/\n"
            + "7)},{x->-(-1)^(4/7)*15^(1/7)},{x->(-1)^(5/7)*15^(1/7)},{x->-(-1)^(6/7)*15^(1/7)}}");
  }

  public void testSolveX7_15002() {
    check(
        "Solve(x^7 - 15 == 0, x)", //
        "{{x->-(-15)^(1/7)},{x->15^(1/7)},{x->(-1)^(2/7)*15^(1/7)},{x->-(-1)^(3/7)*15^(1/\n"
            + "7)},{x->(-1)^(4/7)*15^(1/7)},{x->-(-1)^(5/7)*15^(1/7)},{x->(-1)^(6/7)*15^(1/7)}}");
  }

  public void testSolve001() {

    check(
        "Solve((5*x^4-2)/(x+1)/(x^2-1)==0,x)", //
        "{{x->-(2/5)^(1/4)},{x->-I*(2/5)^(1/4)},{x->I*(2/5)^(1/4)},{x->(2/5)^(1/4)}}");
  }

  public void testSolve002() {
    check(
        "Solve((x^2 + 2)*(x^2 - 2) == 0, x, Reals)", //
        "{{x->-Sqrt(2)},{x->Sqrt(2)}}");
  }

  public void testSolveX3_89001() {
    check(
        "Solve(x^3-89==0, x)", //
        "{{x->-(-89)^(1/3)},{x->89^(1/3)},{x->(-1)^(2/3)*89^(1/3)}}");
  }

  public void testSolve7X4_2ab001() {
    check(
        "Solve(7*x^4+2*a*b==0, x)", //
        "{{x->((-2)^(1/4)*a^(1/4)*b^(1/4))/7^(1/4)},{x->(-(-2)^(1/4)*a^(1/4)*b^(1/4))/7^(\n"
            + "1/4)},{x->(-I*(-2)^(1/4)*a^(1/4)*b^(1/4))/7^(1/4)},{x->(I*(-2)^(1/4)*a^(1/4)*b^(\n"
            + "1/4))/7^(1/4)}}");
    check(
        "Solve(7*x^4+2*a*b==0, x)// N", //
        "{{x->(0.516973+I*0.516973)*a^0.25*b^0.25},{x->(-0.516973+I*(-0.516973))*a^0.25*b^0.25},{x->(0.516973+I*(-0.516973))*a^0.25*b^0.25},"
            + "{x->(-0.516973+I*0.516973)*a^0.25*b^0.25}}");
  }

  public void testSolve7X4_2ab002() {
    check(
        "Solve(7*x^4-2*a*b==0, x)", //
        "{{x->(2/7)^(1/4)*a^(1/4)*b^(1/4)},{x->-(2/7)^(1/4)*a^(1/4)*b^(1/4)},{x->-I*(2/7)^(\n"
            + "1/4)*a^(1/4)*b^(1/4)},{x->I*(2/7)^(1/4)*a^(1/4)*b^(1/4)}}");
    check(
        "Solve(7*x^4-2*a*b==0, x)// N", //
        "{{x->0.73111*a^0.25*b^0.25},{x->-0.73111*a^0.25*b^0.25},{x->(I*(-0.73111))*a^0.25*b^0.25},{x->(I*0.73111)*a^0.25*b^0.25}}");
  }

  public void testSolve7X4_2ab003() {
    check(
        "Solve(-7*x^4-2*a*b==0, x)", //
        "{{x->(-2/7)^(1/4)*a^(1/4)*b^(1/4)},{x->-(-2/7)^(1/4)*a^(1/4)*b^(1/4)},{x->(-1)^(\n"
            + "3/4)*(2/7)^(1/4)*a^(1/4)*b^(1/4)},{x->-(-1)^(3/4)*(2/7)^(1/4)*a^(1/4)*b^(1/4)}}");
    check(
        "Solve(-7*x^4-2*a*b==0, x)// N", //
        "{{x->(0.516973+I*0.516973)*a^0.25*b^0.25},{x->(-0.516973+I*(-0.516973))*a^0.25*b^0.25},{x->(-0.516973+I*0.516973)*a^0.25*b^0.25},{x->(0.516973+I*(-0.516973))*a^0.25*b^0.25}}");
  }

  public void testSolve7cX4_2ab004() {
    // TODO
    //    check(
    //        "Solve(-7*c*x^4-2*a*b==0, x)", //
    //
    // "{{x->((2/7)^(1/4)*a^(1/4)*b^(1/4))/(-c)^(1/4)},{x->(-(2/7)^(1/4)*a^(1/4)*b^(1/4))/(-c)^(\r\n"
    //            +
    // "1/4)},{x->(-I*(2/7)^(1/4)*a^(1/4)*b^(1/4))/(-c)^(1/4)},{x->(I*(2/7)^(1/4)*a^(1/4)*b^(\r\n"
    //            + "1/4))/(-c)^(1/4)}}");
    //    check(
    //        "Solve(-7*c*x^4-2*a*b==0, x)// N", //
    //
    // "{{x->(0.516973+I*0.516973)*a^0.25*b^0.25},{x->(-0.516973+I*(-0.516973))*a^0.25*b^0.25},{x->(-0.516973+I*0.516973)*a^0.25*b^0.25},{x->(0.516973+I*(-0.516973))*a^0.25*b^0.25}}");
  }

  /** The JUnit setup method */
  @Override
  protected void setUp() {
    super.setUp();
    Config.SHORTEN_STRING_LENGTH = 1024;
    Config.MAX_AST_SIZE = 1000000;
    EvalEngine.get().setIterationLimit(50000);
  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();
    Config.SHORTEN_STRING_LENGTH = 80;
  }
}
