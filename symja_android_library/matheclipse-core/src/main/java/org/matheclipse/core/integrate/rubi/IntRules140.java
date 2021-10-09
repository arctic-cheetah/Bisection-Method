package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="https://rulebasedintegration.org/">Rubi -
 * rule-based integrator</a>.
 *  
 */
class IntRules140 { 
  public static IAST RULES = List( 
IIntegrate(2801,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),QQ(-3L,2L)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Subtract(Dist(Power(Subtract(a,b),CN1),Integrate(Power(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))))),CN1),x),x),Dist(Times(b,Power(Subtract(a,b),CN1)),Integrate(Times(Plus(C1,Sin(Plus(e,Times(f,x)))),Power(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),QQ(3L,2L)),Sqrt(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0)))),
IIntegrate(2802,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(b),Cos(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(f,Plus(m,C1),Subtract(Times(b,c),Times(a,d)),Subtract(Sqr(a),Sqr(b))),CN1)),x)),Dist(Power(Times(Plus(m,C1),Subtract(Times(b,c),Times(a,d)),Subtract(Sqr(a),Sqr(b))),CN1),Integrate(Times(Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),n),Simp(Subtract(Subtract(Plus(Times(a,Subtract(Times(b,c),Times(a,d)),Plus(m,C1)),Times(Sqr(b),d,Plus(m,n,C2))),Times(Plus(Times(Sqr(b),c),Times(b,Subtract(Times(b,c),Times(a,d)),Plus(m,C1))),Sin(Plus(e,Times(f,x))))),Times(Sqr(b),d,Plus(m,n,C3),Sqr(Sin(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0),LtQ(m,CN1),IntegersQ(Times(C2,m),Times(C2,n)),Or(And(EqQ(a,C0),IntegerQ(m),Not(IntegerQ(n))),Not(And(IntegerQ(Times(C2,n)),LtQ(n,CN1),Or(And(IntegerQ(n),Not(IntegerQ(m))),EqQ(a,C0)))))))),
IIntegrate(2803,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1),Sqrt(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Dist(Times(d,Power(b,CN1)),Integrate(Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),CN1D2),x),x),Dist(Times(Subtract(Times(b,c),Times(a,d)),Power(b,CN1)),Integrate(Power(Times(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Sqrt(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))))),CN1),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0)))),
IIntegrate(2804,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),QQ(3L,2L)),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1)),x_Symbol),
    Condition(Subtract(Dist(Times(b,Power(d,CN1)),Integrate(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),x),x),Dist(Times(Subtract(Times(b,c),Times(a,d)),Power(d,CN1)),Integrate(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0)))),
IIntegrate(2805,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Simp(Times(C2,EllipticPi(Times(C2,b,Power(Plus(a,b),CN1)),Times(C1D2,C1,Plus(e,Times(CN1,C1D2,Pi),Times(f,x))),Times(C2,d,Power(Plus(c,d),CN1))),Power(Times(f,Plus(a,b),Sqrt(Plus(c,d))),CN1)),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0),GtQ(Plus(c,d),C0)))),
IIntegrate(2806,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Simp(Times(C2,EllipticPi(Times(CN2,b,Power(Subtract(a,b),CN1)),Times(C1D2,C1,Plus(e,CPiHalf,Times(f,x))),Times(CN2,d,Power(Subtract(c,d),CN1))),Power(Times(f,Subtract(a,b),Sqrt(Subtract(c,d))),CN1)),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0),GtQ(Subtract(c,d),C0)))),
IIntegrate(2807,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),Power(Plus(c,d),CN1))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),CN1D2)),Integrate(Power(Times(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Sqrt(Plus(Times(c,Power(Plus(c,d),CN1)),Times(d,Sin(Plus(e,Times(f,x))),Power(Plus(c,d),CN1))))),CN1),x),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0),Not(GtQ(Plus(c,d),C0))))),
IIntegrate(2808,Integrate(Times(Sqrt(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Simp(Times(C2,c,Rt(Times(b,Plus(c,d)),C2),Tan(Plus(e,Times(f,x))),Sqrt(Plus(C1,Csc(Plus(e,Times(f,x))))),Sqrt(Subtract(C1,Csc(Plus(e,Times(f,x))))),EllipticPi(Times(Plus(c,d),Power(d,CN1)),ArcSin(Times(Sqrt(Plus(c,Times(d,Sin(Plus(e,Times(f,x)))))),Power(Times(Sqrt(Times(b,Sin(Plus(e,Times(f,x))))),Rt(Times(Plus(c,d),Power(b,CN1)),C2)),CN1))),Times(CN1,Plus(c,d),Power(Subtract(c,d),CN1))),Power(Times(d,f,Sqrt(Subtract(Sqr(c),Sqr(d)))),CN1)),x),And(FreeQ(List(b,c,d,e,f),x),GtQ(Subtract(Sqr(c),Sqr(d)),C0),PosQ(Times(Plus(c,d),Power(b,CN1))),GtQ(Sqr(c),C0)))),
IIntegrate(2809,Integrate(Times(Sqrt(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Simp(Times(C2,b,Tan(Plus(e,Times(f,x))),Rt(Times(Plus(c,d),Power(b,CN1)),C2),Sqrt(Times(c,Plus(C1,Csc(Plus(e,Times(f,x)))),Power(Subtract(c,d),CN1))),Sqrt(Times(c,Subtract(C1,Csc(Plus(e,Times(f,x)))),Power(Plus(c,d),CN1))),EllipticPi(Times(Plus(c,d),Power(d,CN1)),ArcSin(Times(Sqrt(Plus(c,Times(d,Sin(Plus(e,Times(f,x)))))),Power(Times(Sqrt(Times(b,Sin(Plus(e,Times(f,x))))),Rt(Times(Plus(c,d),Power(b,CN1)),C2)),CN1))),Times(CN1,Plus(c,d),Power(Subtract(c,d),CN1))),Power(Times(d,f),CN1)),x),And(FreeQ(List(b,c,d,e,f),x),NeQ(Subtract(Sqr(c),Sqr(d)),C0),PosQ(Times(Plus(c,d),Power(b,CN1)))))),
IIntegrate(2810,Integrate(Times(Sqrt(Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(b,Sin(Plus(e,Times(f,x))))),Power(Times(CN1,b,Sin(Plus(e,Times(f,x)))),CN1D2)),Integrate(Times(Sqrt(Times(CN1,b,Sin(Plus(e,Times(f,x))))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),CN1D2)),x),x),And(FreeQ(List(b,c,d,e,f),x),NeQ(Subtract(Sqr(c),Sqr(d)),C0),NegQ(Times(Plus(c,d),Power(b,CN1)))))),
IIntegrate(2811,Integrate(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Simp(Times(C2,Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),Sqrt(Times(Subtract(Times(b,c),Times(a,d)),Plus(C1,Sin(Plus(e,Times(f,x)))),Power(Times(Subtract(c,d),Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),CN1))),Sqrt(Times(CN1,Subtract(Times(b,c),Times(a,d)),Subtract(C1,Sin(Plus(e,Times(f,x)))),Power(Times(Plus(c,d),Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),CN1))),EllipticPi(Times(b,Plus(c,d),Power(Times(d,Plus(a,b)),CN1)),ArcSin(Times(Rt(Times(Plus(a,b),Power(Plus(c,d),CN1)),C2),Sqrt(Plus(c,Times(d,Sin(Plus(e,Times(f,x)))))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),CN1D2))),Times(Subtract(a,b),Plus(c,d),Power(Times(Plus(a,b),Subtract(c,d)),CN1))),Power(Times(d,f,Rt(Times(Plus(a,b),Power(Plus(c,d),CN1)),C2),Cos(Plus(e,Times(f,x)))),CN1)),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0),PosQ(Times(Plus(a,b),Power(Plus(c,d),CN1)))))),
IIntegrate(2812,Integrate(Times(Sqrt(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Subtract(Negate(c),Times(d,Sin(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),CN1D2)),Integrate(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Power(Subtract(Negate(c),Times(d,Sin(Plus(e,Times(f,x))))),CN1D2)),x),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0),NegQ(Times(Plus(a,b),Power(Plus(c,d),CN1)))))),
IIntegrate(2813,Integrate(Times(Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),CN1D2),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Simp(Times(CN2,d,EllipticF(ArcSin(Times(Cos(Plus(e,Times(f,x))),Power(Plus(C1,Times(d,Sin(Plus(e,Times(f,x))))),CN1))),Times(CN1,Subtract(a,Times(b,d)),Power(Plus(a,Times(b,d)),CN1))),Power(Times(f,Sqrt(Plus(a,Times(b,d)))),CN1)),x),And(FreeQ(List(a,b,d,e,f),x),LtQ(Subtract(Sqr(a),Sqr(b)),C0),EqQ(Sqr(d),C1),GtQ(Times(b,d),C0)))),
IIntegrate(2814,Integrate(Times(Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),CN1D2),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(Sign(b),Sin(Plus(e,Times(f,x))))),Power(Times(d,Sin(Plus(e,Times(f,x)))),CN1D2)),Integrate(Power(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Sqrt(Times(Sign(b),Sin(Plus(e,Times(f,x)))))),CN1),x),x),And(FreeQ(List(a,b,d,e,f),x),LtQ(Subtract(Sqr(a),Sqr(b)),C0),GtQ(Sqr(b),C0),Not(And(EqQ(Sqr(d),C1),GtQ(Times(b,d),C0)))))),
IIntegrate(2815,Integrate(Times(Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),CN1D2),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Simp(Times(CN2,Sqrt(Sqr(a)),Sqrt(Negate(Sqr(Cot(Plus(e,Times(f,x)))))),Rt(Times(Plus(a,b),Power(d,CN1)),C2),EllipticF(ArcSin(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Power(Times(Sqrt(Times(d,Sin(Plus(e,Times(f,x))))),Rt(Times(Plus(a,b),Power(d,CN1)),C2)),CN1))),Times(CN1,Plus(a,b),Power(Subtract(a,b),CN1))),Power(Times(a,f,Sqrt(Subtract(Sqr(a),Sqr(b))),Cot(Plus(e,Times(f,x)))),CN1)),x),And(FreeQ(List(a,b,d,e,f),x),GtQ(Subtract(Sqr(a),Sqr(b)),C0),PosQ(Times(Plus(a,b),Power(d,CN1))),GtQ(Sqr(a),C0)))),
IIntegrate(2816,Integrate(Times(Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),CN1D2),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Simp(Times(CN2,Tan(Plus(e,Times(f,x))),Rt(Times(Plus(a,b),Power(d,CN1)),C2),Sqrt(Times(a,Subtract(C1,Csc(Plus(e,Times(f,x)))),Power(Plus(a,b),CN1))),Sqrt(Times(a,Plus(C1,Csc(Plus(e,Times(f,x)))),Power(Subtract(a,b),CN1))),EllipticF(ArcSin(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Power(Times(Sqrt(Times(d,Sin(Plus(e,Times(f,x))))),Rt(Times(Plus(a,b),Power(d,CN1)),C2)),CN1))),Times(CN1,Plus(a,b),Power(Subtract(a,b),CN1))),Power(Times(a,f),CN1)),x),And(FreeQ(List(a,b,d,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),PosQ(Times(Plus(a,b),Power(d,CN1)))))),
IIntegrate(2817,Integrate(Times(Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),CN1D2),Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(CN1,d,Sin(Plus(e,Times(f,x))))),Power(Times(d,Sin(Plus(e,Times(f,x)))),CN1D2)),Integrate(Power(Times(Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Sqrt(Times(CN1,d,Sin(Plus(e,Times(f,x)))))),CN1),x),x),And(FreeQ(List(a,b,d,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0),NegQ(Times(Plus(a,b),Power(d,CN1)))))),
IIntegrate(2818,Integrate(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Simp(Times(C2,Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),Sqrt(Times(Subtract(Times(b,c),Times(a,d)),Subtract(C1,Sin(Plus(e,Times(f,x)))),Power(Times(Plus(a,b),Plus(c,Times(d,Sin(Plus(e,Times(f,x)))))),CN1))),Sqrt(Times(CN1,Subtract(Times(b,c),Times(a,d)),Plus(C1,Sin(Plus(e,Times(f,x)))),Power(Times(Subtract(a,b),Plus(c,Times(d,Sin(Plus(e,Times(f,x)))))),CN1))),EllipticF(ArcSin(Times(Rt(Times(Plus(c,d),Power(Plus(a,b),CN1)),C2),Sqrt(Plus(a,Times(b,Sin(Plus(e,Times(f,x)))))),Power(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))),CN1D2))),Times(Plus(a,b),Subtract(c,d),Power(Times(Subtract(a,b),Plus(c,d)),CN1))),Power(Times(f,Subtract(Times(b,c),Times(a,d)),Rt(Times(Plus(c,d),Power(Plus(a,b),CN1)),C2),Cos(Plus(e,Times(f,x)))),CN1)),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0),PosQ(Times(Plus(c,d),Power(Plus(a,b),CN1)))))),
IIntegrate(2819,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2),Power(Plus(c_,Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Subtract(Negate(a),Times(b,Sin(Plus(e,Times(f,x)))))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),CN1D2)),Integrate(Power(Times(Sqrt(Subtract(Negate(a),Times(b,Sin(Plus(e,Times(f,x)))))),Sqrt(Plus(c,Times(d,Sin(Plus(e,Times(f,x))))))),CN1),x),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Subtract(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Sqr(c),Sqr(d)),C0),NegQ(Times(Plus(c,d),Power(Plus(a,b),CN1)))))),
IIntegrate(2820,Integrate(Times(Power(Times(d_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),QQ(3L,2L)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sin"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(a,d,Power(Times(C2,b),CN1)),Integrate(Times(Sqrt(Times(d,Sin(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),CN1D2)),x),x)),Dist(Times(d,Power(Times(C2,b),CN1)),Integrate(Times(Sqrt(Times(d,Sin(Plus(e,Times(f,x))))),Plus(a,Times(C2,b,Sin(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Sin(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Subtract(Sqr(a),Sqr(b)),C0))))
  );
}