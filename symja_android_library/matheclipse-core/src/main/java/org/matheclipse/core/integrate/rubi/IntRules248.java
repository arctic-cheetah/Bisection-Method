package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="https://rulebasedintegration.org/">Rubi -
 * rule-based integrator</a>.
 *  
 */
class IntRules248 { 
  public static IAST RULES = List( 
IIntegrate(4961,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,CN2),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Subtract(Negate(Simp(Times(Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Times(d,x),CN1)),x)),Dist(Times(b,c,p),Integrate(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Subtract(p,C1)),Power(Times(x,Sqrt(Plus(d,Times(e,Sqr(x))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C0)))),
IIntegrate(4962,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Times(d,f,Plus(m,C1)),CN1)),x),Negate(Dist(Times(b,c,p,Power(Times(f,Plus(m,C1)),CN1)),Integrate(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Subtract(p,C1)),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x)),Negate(Dist(Times(Sqr(c),Plus(m,C2),Power(Times(Sqr(f),Plus(m,C1)),CN1)),Integrate(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C0),LtQ(m,CN1),NeQ(m,CN2)))),
IIntegrate(4963,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Times(f,x),Plus(m,C1)),Sqrt(Plus(d,Times(e,Sqr(x)))),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Times(d,f,Plus(m,C1)),CN1)),x),Dist(Times(b,c,p,Power(Times(f,Plus(m,C1)),CN1)),Integrate(Times(Power(Times(f,x),Plus(m,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Subtract(p,C1)),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x),Negate(Dist(Times(Sqr(c),Plus(m,C2),Power(Times(Sqr(f),Plus(m,C1)),CN1)),Integrate(Times(Power(Times(f,x),Plus(m,C2)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),x),x))),And(FreeQ(List(a,b,c,d,e,f),x),EqQ(e,Times(Sqr(c),d)),GtQ(p,C0),LtQ(m,CN1),NeQ(m,CN2)))),
IIntegrate(4964,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Subtract(Dist(Power(e,CN1),Integrate(Times(Power(x,Subtract(m,C2)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p)),x),x),Dist(Times(d,Power(e,CN1)),Integrate(Times(Power(x,Subtract(m,C2)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),IntegersQ(p,Times(C2,q)),LtQ(q,CN1),IGtQ(m,C1),NeQ(p,CN1)))),
IIntegrate(4965,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Subtract(Dist(Power(e,CN1),Integrate(Times(Power(x,Subtract(m,C2)),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p)),x),x),Dist(Times(d,Power(e,CN1)),Integrate(Times(Power(x,Subtract(m,C2)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),IntegersQ(p,Times(C2,q)),LtQ(q,CN1),IGtQ(m,C1),NeQ(p,CN1)))),
IIntegrate(4966,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Subtract(Dist(Power(d,CN1),Integrate(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p)),x),x),Dist(Times(e,Power(d,CN1)),Integrate(Times(Power(x,Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),IntegersQ(p,Times(C2,q)),LtQ(q,CN1),ILtQ(m,C0),NeQ(p,CN1)))),
IIntegrate(4967,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Subtract(Dist(Power(d,CN1),Integrate(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p)),x),x),Dist(Times(e,Power(d,CN1)),Integrate(Times(Power(x,Plus(m,C2)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p)),x),x)),And(FreeQ(List(a,b,c,d,e),x),EqQ(e,Times(Sqr(c),d)),IntegersQ(p,Times(C2,q)),LtQ(q,CN1),ILtQ(m,C0),NeQ(p,CN1)))),
IIntegrate(4968,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Simp(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),CN1)),x),Negate(Dist(Times(c,Plus(m,Times(C2,q),C2),Power(Times(b,Plus(p,C1)),CN1)),Integrate(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1))),x),x)),Negate(Dist(Times(m,Power(Times(b,c,Plus(p,C1)),CN1)),Integrate(Times(Power(x,Subtract(m,C1)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),Plus(p,C1))),x),x))),And(FreeQ(List(a,b,c,d,e,m),x),EqQ(e,Times(Sqr(c),d)),IntegerQ(m),LtQ(q,CN1),LtQ(p,CN1),NeQ(Plus(m,Times(C2,q),C2),C0)))),
IIntegrate(4969,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(x,m),Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1)),Power(Times(b,c,d,Plus(p,C1)),CN1)),x)),Dist(Times(c,Plus(m,Times(C2,q),C2),Power(Times(b,Plus(p,C1)),CN1)),Integrate(Times(Power(x,Plus(m,C1)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1))),x),x),Dist(Times(m,Power(Times(b,c,Plus(p,C1)),CN1)),Integrate(Times(Power(x,Subtract(m,C1)),Power(Plus(d,Times(e,Sqr(x))),q),Power(Plus(a,Times(b,ArcCot(Times(c,x)))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,m),x),EqQ(e,Times(Sqr(c),d)),IntegerQ(m),LtQ(q,CN1),LtQ(p,CN1),NeQ(Plus(m,Times(C2,q),C2),C0)))),
IIntegrate(4970,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Dist(Times(Power(d,q),Power(Power(c,Plus(m,C1)),CN1)),Subst(Integrate(Times(Power(Plus(a,Times(b,x)),p),Power(Sin(x),m),Power(Power(Cos(x),Plus(m,Times(C2,Plus(q,C1)))),CN1)),x),x,ArcTan(Times(c,x))),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(e,Times(Sqr(c),d)),IGtQ(m,C0),ILtQ(Plus(m,Times(C2,q),C1),C0),Or(IntegerQ(q),GtQ(d,C0))))),
IIntegrate(4971,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Dist(Times(Power(d,Plus(q,C1D2)),Sqrt(Plus(C1,Times(Sqr(c),Sqr(x)))),Power(Plus(d,Times(e,Sqr(x))),CN1D2)),Integrate(Times(Power(x,m),Power(Plus(C1,Times(Sqr(c),Sqr(x))),q),Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p)),x),x),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(e,Times(Sqr(c),d)),IGtQ(m,C0),ILtQ(Plus(m,Times(C2,q),C1),C0),Not(Or(IntegerQ(q),GtQ(d,C0)))))),
IIntegrate(4972,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(d,q),Power(Power(c,Plus(m,C1)),CN1)),Subst(Integrate(Times(Power(Plus(a,Times(b,x)),p),Power(Cos(x),m),Power(Power(Sin(x),Plus(m,Times(C2,Plus(q,C1)))),CN1)),x),x,ArcCot(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(e,Times(Sqr(c),d)),IGtQ(m,C0),ILtQ(Plus(m,Times(C2,q),C1),C0),IntegerQ(q)))),
IIntegrate(4973,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(d,Plus(q,C1D2)),x,Sqrt(Times(Plus(C1,Times(Sqr(c),Sqr(x))),Power(Times(Sqr(c),Sqr(x)),CN1))),Power(Times(Power(c,m),Sqrt(Plus(d,Times(e,Sqr(x))))),CN1)),Subst(Integrate(Times(Power(Plus(a,Times(b,x)),p),Power(Cos(x),m),Power(Power(Sin(x),Plus(m,Times(C2,Plus(q,C1)))),CN1)),x),x,ArcCot(Times(c,x))),x)),And(FreeQ(List(a,b,c,d,e,p),x),EqQ(e,Times(Sqr(c),d)),IGtQ(m,C0),ILtQ(Plus(m,Times(C2,q),C1),C0),Not(IntegerQ(q))))),
IIntegrate(4974,Integrate(Times(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),x_,Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Subtract(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcTan(Times(c,x)))),Power(Times(C2,e,Plus(q,C1)),CN1)),x),Dist(Times(b,c,Power(Times(C2,e,Plus(q,C1)),CN1)),Integrate(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,q),x),NeQ(q,CN1)))),
IIntegrate(4975,Integrate(Times(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),x_,Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Plus(a,Times(b,ArcCot(Times(c,x)))),Power(Times(C2,e,Plus(q,C1)),CN1)),x),Dist(Times(b,c,Power(Times(C2,e,Plus(q,C1)),CN1)),Integrate(Times(Power(Plus(d,Times(e,Sqr(x))),Plus(q,C1)),Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,q),x),NeQ(q,CN1)))),
IIntegrate(4976,Integrate(Times(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),x))),Subtract(Dist(Plus(a,Times(b,ArcTan(Times(c,x)))),u,x),Dist(Times(b,c),Integrate(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,m,q),x),Or(And(IGtQ(q,C0),Not(And(ILtQ(Times(C1D2,Subtract(m,C1)),C0),GtQ(Plus(m,Times(C2,q),C3),C0)))),And(IGtQ(Times(C1D2,Plus(m,C1)),C0),Not(And(ILtQ(q,C0),GtQ(Plus(m,Times(C2,q),C3),C0)))),And(ILtQ(Times(C1D2,Plus(m,Times(C2,q),C1)),C0),Not(ILtQ(Times(C1D2,Subtract(m,C1)),C0))))))),
IIntegrate(4977,Integrate(Times(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,IntHide(Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),x))),Plus(Dist(Plus(a,Times(b,ArcCot(Times(c,x)))),u,x),Dist(Times(b,c),Integrate(SimplifyIntegrand(Times(u,Power(Plus(C1,Times(Sqr(c),Sqr(x))),CN1)),x),x),x))),And(FreeQ(List(a,b,c,d,e,f,m,q),x),Or(And(IGtQ(q,C0),Not(And(ILtQ(Times(C1D2,Subtract(m,C1)),C0),GtQ(Plus(m,Times(C2,q),C3),C0)))),And(IGtQ(Times(C1D2,Plus(m,C1)),C0),Not(And(ILtQ(q,C0),GtQ(Plus(m,Times(C2,q),C3),C0)))),And(ILtQ(Times(C1D2,Plus(m,Times(C2,q),C1)),C0),Not(ILtQ(Times(C1D2,Subtract(m,C1)),C0))))))),
IIntegrate(4978,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN2)),x_Symbol),
    Condition(Subtract(Dist(Power(Times(C4,Sqr(d),Rt(Times(CN1,e,Power(d,CN1)),C2)),CN1),Integrate(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Subtract(C1,Times(Rt(Times(CN1,e,Power(d,CN1)),C2),x)),CN2)),x),x),Dist(Power(Times(C4,Sqr(d),Rt(Times(CN1,e,Power(d,CN1)),C2)),CN1),Integrate(Times(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Power(Plus(C1,Times(Rt(Times(CN1,e,Power(d,CN1)),C2),x)),CN2)),x),x)),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C0)))),
IIntegrate(4979,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcCot(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),x_,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),CN2)),x_Symbol),
    Condition(Subtract(Dist(Power(Times(C4,Sqr(d),Rt(Times(CN1,e,Power(d,CN1)),C2)),CN1),Integrate(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Subtract(C1,Times(Rt(Times(CN1,e,Power(d,CN1)),C2),x)),CN2)),x),x),Dist(Power(Times(C4,Sqr(d),Rt(Times(CN1,e,Power(d,CN1)),C2)),CN1),Integrate(Times(Power(Plus(a,Times(b,ArcCot(Times(c,x)))),p),Power(Plus(C1,Times(Rt(Times(CN1,e,Power(d,CN1)),C2),x)),CN2)),x),x)),And(FreeQ(List(a,b,c,d,e),x),IGtQ(p,C0)))),
IIntegrate(4980,Integrate(Times(Power(Plus(a_DEFAULT,Times(ArcTan(Times(c_DEFAULT,x_)),b_DEFAULT)),p_DEFAULT),Power(Times(f_DEFAULT,x_),m_DEFAULT),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),q_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Power(Plus(a,Times(b,ArcTan(Times(c,x)))),p),Times(Power(Times(f,x),m),Power(Plus(d,Times(e,Sqr(x))),q)),x))),Condition(Integrate(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,f,m),x),IntegerQ(q),IGtQ(p,C0),Or(And(EqQ(p,C1),GtQ(q,C0)),IntegerQ(m)))))
  );
}