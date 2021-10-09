package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface ArcTanRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 23, 1 };

  final public static IAST RULES = List(
    IInit(ArcTan, SIZES),
    // ArcTan(Undefined)=Undefined
    ISet(ArcTan(Undefined),
      Undefined),
    // ArcTan(0)=0
    ISet(ArcTan(C0),
      C0),
    // ArcTan(0,0)=Indeterminate
    ISet(ArcTan(C0,C0),
      Indeterminate),
    // ArcTan(2-Sqrt(3))=Pi/12
    ISet(ArcTan(Subtract(C2,CSqrt3)),
      Times(QQ(1L,12L),Pi)),
    // ArcTan(-2+Sqrt(3))=-Pi/12
    ISet(ArcTan(Plus(CN2,CSqrt3)),
      Times(QQ(-1L,12L),Pi)),
    // ArcTan(-1+Sqrt(2))=Pi/8
    ISet(ArcTan(Plus(CN1,CSqrt2)),
      Times(QQ(1L,8L),Pi)),
    // ArcTan(1-Sqrt(2))=-Pi/8
    ISet(ArcTan(Subtract(C1,CSqrt2)),
      Times(QQ(-1L,8L),Pi)),
    // ArcTan(1/Sqrt(3))=Pi/6
    ISet(ArcTan(C1DSqrt3),
      Times(QQ(1L,6L),Pi)),
    // ArcTan(Sqrt(5-2*Sqrt(5)))=Pi/5
    ISet(ArcTan(Sqrt(Plus(C5,Times(CN2,CSqrt5)))),
      Times(QQ(1L,5L),Pi)),
    // ArcTan(1)=Pi/4
    ISet(ArcTan(C1),
      Times(C1D4,Pi)),
    // ArcTan(1,1)=Pi/4
    ISet(ArcTan(C1,C1),
      Times(C1D4,Pi)),
    // ArcTan(-1,-1)=-3/4*Pi
    ISet(ArcTan(CN1,CN1),
      Times(QQ(-3L,4L),Pi)),
    // ArcTan(Sqrt(3))=Pi/3
    ISet(ArcTan(CSqrt3),
      Times(C1D3,Pi)),
    // ArcTan(1+Sqrt(2))=3/8*Pi
    ISet(ArcTan(Plus(C1,CSqrt2)),
      Times(QQ(3L,8L),Pi)),
    // ArcTan(2+Sqrt(3))=5/12*Pi
    ISet(ArcTan(Plus(C2,CSqrt3)),
      Times(QQ(5L,12L),Pi)),
    // ArcTan(Sqrt(5-2*Sqrt(5)))=Pi/5
    ISet(ArcTan(Sqrt(Plus(C5,Times(CN2,CSqrt5)))),
      Times(QQ(1L,5L),Pi)),
    // ArcTan(Sqrt(5+2*Sqrt(5)))=2/5*Pi
    ISet(ArcTan(Sqrt(Plus(C5,Times(C2,CSqrt5)))),
      Times(QQ(2L,5L),Pi)),
    // ArcTan(I)=I*Infinity
    ISet(ArcTan(CI),
      DirectedInfinity(CI)),
    // ArcTan(Undefined,y_):=Undefined
    ISetDelayed(ArcTan(Undefined,y_),
      Undefined),
    // ArcTan(x_,Undefined):=Undefined
    ISetDelayed(ArcTan(x_,Undefined),
      Undefined),
    // ArcTan(Infinity,y_)=0
    ISet(ArcTan(oo,y_),
      C0),
    // ArcTan(Infinity)=Pi/2
    ISet(ArcTan(oo),
      CPiHalf),
    // ArcTan(-Infinity)=(-1)*1/2*Pi
    ISet(ArcTan(Noo),
      CNPiHalf),
    // ArcTan(I*Infinity)=Pi/2
    ISet(ArcTan(DirectedInfinity(CI)),
      CPiHalf),
    // ArcTan(-I*Infinity)=(-1)*1/2*Pi
    ISet(ArcTan(DirectedInfinity(CNI)),
      CNPiHalf),
    // ArcTan(x_?RealNumberQ,y_?RealNumberQ):=If(x==0,If(y==0,Indeterminate,If(y>0,Pi/2,(-1)*1/2*Pi)),If(x>0,ArcTan(y/x),If(y>=0,ArcTan(y/x)+Pi,-Pi+ArcTan(y/x))))
    ISetDelayed(ArcTan(PatternTest(x_,RealNumberQ),PatternTest(y_,RealNumberQ)),
      If(Equal(x,C0),If(Equal(y,C0),Indeterminate,If(Greater(y,C0),CPiHalf,Times(CN1,C1D2,Pi))),If(Greater(x,C0),ArcTan(Times(Power(x,CN1),y)),If(GreaterEqual(y,C0),Plus(ArcTan(Times(Power(x,CN1),y)),Pi),Plus(CNPi,ArcTan(Times(Power(x,CN1),y))))))),
    // ArcTan(x_?NumberQ,y_?NumberQ):=(Pi*(-x+2*Sqrt(x^2)))/(4*y)/;x^2==y^2
    ISetDelayed(ArcTan(PatternTest(x_,NumberQ),PatternTest(y_,NumberQ)),
      Condition(Times(Pi,Plus(Negate(x),Times(C2,Sqrt(Sqr(x)))),Power(Times(C4,y),CN1)),Equal(Sqr(x),Sqr(y))))
  );
}