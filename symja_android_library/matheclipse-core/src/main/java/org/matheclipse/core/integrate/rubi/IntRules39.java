package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="https://rulebasedintegration.org/">Rubi -
 * rule-based integrator</a>.
 *  
 */
class IntRules39 { 
  public static IAST RULES = List( 
IIntegrate(781,Integrate(Times(Power(Times(e_DEFAULT,x_),m_DEFAULT),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Power(e,p),CN1),Integrate(Times(Power(Times(e,x),Plus(m,p)),Plus(f,Times(g,x)),Power(Plus(b,Times(c,x)),p)),x),x),And(FreeQ(List(b,c,e,f,g,m),x),IntegerQ(p)))),
IIntegrate(782,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Integrate(Times(Power(Plus(d,Times(e,x)),Plus(m,p)),Plus(f,Times(g,x)),Power(Plus(Times(a,Power(d,CN1)),Times(c,x,Power(e,CN1))),p)),x),And(FreeQ(List(a,b,c,d,e,f,g,m),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IntegerQ(p)))),
IIntegrate(783,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Integrate(Times(Power(Plus(d,Times(e,x)),Plus(m,p)),Plus(f,Times(g,x)),Power(Plus(Times(a,Power(d,CN1)),Times(c,x,Power(e,CN1))),p)),x),And(FreeQ(List(a,c,d,e,f,g,m),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Or(IntegerQ(p),And(GtQ(a,C0),GtQ(d,C0),EqQ(Plus(m,p),C0)))))),
IIntegrate(784,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,m),Power(e,m)),Integrate(Times(Plus(f,Times(g,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(m,p)),Power(Power(Plus(Times(a,e),Times(c,d,x)),m),CN1)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,p),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Not(IntegerQ(Times(C2,p))),ILtQ(m,C0)))),
IIntegrate(785,Integrate(Times(x_,Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(d,m),Power(e,m)),Integrate(Times(x,Power(Plus(a,Times(c,Sqr(x))),Plus(m,p)),Power(Power(Plus(Times(a,e),Times(c,d,x)),m),CN1)),x),x),And(FreeQ(List(a,c,d,e,p),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Not(IntegerQ(p)),ILtQ(m,C0),EqQ(m,CN1),Not(ILtQ(Subtract(p,C1D2),C0))))),
IIntegrate(786,Integrate(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Simp(Times(g,Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(m,Times(C2,p),C2)),CN1)),x),And(FreeQ(List(a,b,c,d,e,f,g,m,p),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),EqQ(Plus(Times(m,Plus(Times(g,Subtract(Times(c,d),Times(b,e))),Times(c,e,f))),Times(e,Plus(p,C1),Subtract(Times(C2,c,f),Times(b,g)))),C0)))),
IIntegrate(787,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Simp(Times(g,Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(m,Times(C2,p),C2)),CN1)),x),And(FreeQ(List(a,c,d,e,f,g,m,p),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),EqQ(Plus(Times(m,Plus(Times(d,g),Times(e,f))),Times(C2,e,f,Plus(p,C1))),C0)))),
IIntegrate(788,Integrate(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Subtract(Simp(Times(Plus(Times(g,Subtract(Times(c,d),Times(b,e))),Times(c,e,f)),Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(p,C1),Subtract(Times(C2,c,d),Times(b,e))),CN1)),x),Dist(Times(e,Plus(Times(m,Plus(Times(g,Subtract(Times(c,d),Times(b,e))),Times(c,e,f))),Times(e,Plus(p,C1),Subtract(Times(C2,c,f),Times(b,g)))),Power(Times(c,Plus(p,C1),Subtract(Times(C2,c,d),Times(b,e))),CN1)),Integrate(Times(Power(Plus(d,Times(e,x)),Subtract(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1))),x),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),LtQ(p,CN1),GtQ(m,C0)))),
IIntegrate(789,Integrate(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Subtract(Simp(Times(Plus(Times(d,g),Times(e,f)),Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C2,c,d,Plus(p,C1)),CN1)),x),Dist(Times(e,Plus(Times(m,Plus(Times(d,g),Times(e,f))),Times(C2,e,f,Plus(p,C1))),Power(Times(C2,c,d,Plus(p,C1)),CN1)),Integrate(Times(Power(Plus(d,Times(e,x)),Subtract(m,C1)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1))),x),x)),And(FreeQ(List(a,c,d,e,f,g),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),LtQ(p,CN1),GtQ(m,C0)))),
IIntegrate(790,Integrate(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Subtract(Simp(Times(Plus(Times(g,Subtract(Times(c,d),Times(b,e))),Times(c,e,f)),Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(p,C1),Subtract(Times(C2,c,d),Times(b,e))),CN1)),x),Dist(Times(e,Plus(Times(m,Plus(Times(g,Subtract(Times(c,d),Times(b,e))),Times(c,e,f))),Times(e,Plus(p,C1),Subtract(Times(C2,c,f),Times(b,g)))),Power(Times(c,Plus(p,C1),Subtract(Times(C2,c,d),Times(b,e))),CN1)),Integrate(Times(Power(Plus(d,Times(e,x)),Simplify(Subtract(m,C1))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Simplify(Plus(p,C1)))),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,m,p),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),SumSimplerQ(p,C1),SumSimplerQ(m,CN1),NeQ(p,CN1)))),
IIntegrate(791,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Subtract(Simp(Times(Plus(Times(d,g),Times(e,f)),Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C2,c,d,Plus(p,C1)),CN1)),x),Dist(Times(e,Plus(Times(m,Plus(Times(d,g),Times(e,f))),Times(C2,e,f,Plus(p,C1))),Power(Times(C2,c,d,Plus(p,C1)),CN1)),Integrate(Times(Power(Plus(d,Times(e,x)),Simplify(Subtract(m,C1))),Power(Plus(a,Times(c,Sqr(x))),Simplify(Plus(p,C1)))),x),x)),And(FreeQ(List(a,c,d,e,f,g,m,p),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),SumSimplerQ(p,C1),SumSimplerQ(m,CN1),NeQ(p,CN1),Not(IGtQ(m,C0))))),
IIntegrate(792,Integrate(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Subtract(Times(d,g),Times(e,f)),Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(Subtract(Times(C2,c,d),Times(b,e)),Plus(m,p,C1)),CN1)),x),Dist(Times(Plus(Times(m,Plus(Times(g,Subtract(Times(c,d),Times(b,e))),Times(c,e,f))),Times(e,Plus(p,C1),Subtract(Times(C2,c,f),Times(b,g)))),Power(Times(e,Subtract(Times(C2,c,d),Times(b,e)),Plus(m,p,C1)),CN1)),Integrate(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,m,p),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),Or(And(LtQ(m,CN1),Not(IGtQ(Plus(m,p,C1),C0))),And(LtQ(m,C0),LtQ(p,CN1)),EqQ(Plus(m,Times(C2,p),C2),C0)),NeQ(Plus(m,p,C1),C0)))),
IIntegrate(793,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(Subtract(Times(d,g),Times(e,f)),Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C2,c,d,Plus(m,p,C1)),CN1)),x),Dist(Times(Plus(Times(m,Plus(Times(g,c,d),Times(c,e,f))),Times(C2,e,c,f,Plus(p,C1))),Power(Times(e,C2,c,d,Plus(m,p,C1)),CN1)),Integrate(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,c,d,e,f,g,m,p),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),Or(And(LtQ(m,CN1),Not(IGtQ(Plus(m,p,C1),C0))),And(LtQ(m,C0),LtQ(p,CN1)),EqQ(Plus(m,Times(C2,p),C2),C0)),NeQ(Plus(m,p,C1),C0)))),
IIntegrate(794,Integrate(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(g,Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(m,Times(C2,p),C2)),CN1)),x),Dist(Times(Plus(Times(m,Plus(Times(g,Subtract(Times(c,d),Times(b,e))),Times(c,e,f))),Times(e,Plus(p,C1),Subtract(Times(C2,c,f),Times(b,g)))),Power(Times(c,e,Plus(m,Times(C2,p),C2)),CN1)),Integrate(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,b,c,d,e,f,g,m,p),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),NeQ(Plus(m,Times(C2,p),C2),C0),Or(NeQ(m,C2),EqQ(d,C0))))),
IIntegrate(795,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Plus(Simp(Times(g,Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(c,Plus(m,Times(C2,p),C2)),CN1)),x),Dist(Times(Plus(Times(m,Plus(Times(d,g),Times(e,f))),Times(C2,e,f,Plus(p,C1))),Power(Times(e,Plus(m,Times(C2,p),C2)),CN1)),Integrate(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(a,Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,c,d,e,f,g,m,p),x),EqQ(Plus(Times(c,Sqr(d)),Times(a,Sqr(e))),C0),NeQ(Plus(m,Times(C2,p),C2),C0),NeQ(m,C2)))),
IIntegrate(796,Integrate(Times(Sqr(x_),Plus(f_,Times(g_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Subtract(Simp(Times(Sqr(x),Subtract(Times(a,g),Times(c,f,x)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1)),Power(Times(C2,a,c,Plus(p,C1)),CN1)),x),Dist(Power(Times(C2,a,c,Plus(p,C1)),CN1),Integrate(Times(x,Simp(Subtract(Times(C2,a,g),Times(c,f,Plus(Times(C2,p),C5),x)),x),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1))),x),x)),And(FreeQ(List(a,c,f,g),x),EqQ(Plus(Times(a,Sqr(g)),Times(Sqr(f),c)),C0),LtQ(p,CN2)))),
IIntegrate(797,Integrate(Times(Sqr(x_),Plus(f_,Times(g_DEFAULT,x_)),Power(Plus(a_,Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Subtract(Dist(Power(c,CN1),Integrate(Times(Plus(f,Times(g,x)),Power(Plus(a,Times(c,Sqr(x))),Plus(p,C1))),x),x),Dist(Times(a,Power(c,CN1)),Integrate(Times(Plus(f,Times(g,x)),Power(Plus(a,Times(c,Sqr(x))),p)),x),x)),And(FreeQ(List(a,c,f,g,p),x),EqQ(Plus(Times(a,Sqr(g)),Times(Sqr(f),c)),C0)))),
IIntegrate(798,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Integrate(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(f,Times(g,x)),Plus(p,C1)),Power(Plus(Times(a,Power(f,CN1)),Times(c,x,Power(g,CN1))),p)),x),And(FreeQ(List(a,b,c,d,e,f,g,m),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),EqQ(Plus(Times(c,Sqr(f)),Times(CN1,b,f,g),Times(a,Sqr(g))),C0),IntegerQ(p)))),
IIntegrate(799,Integrate(Times(Power(Plus(d_,Times(e_DEFAULT,x_)),m_),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(c_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Integrate(Times(Power(Plus(d,Times(e,x)),m),Power(Plus(f,Times(g,x)),Plus(p,C1)),Power(Plus(Times(a,Power(f,CN1)),Times(c,x,Power(g,CN1))),p)),x),And(FreeQ(List(a,c,d,e,f,g,m),x),EqQ(Plus(Times(c,Sqr(f)),Times(a,Sqr(g))),C0),Or(IntegerQ(p),And(GtQ(a,C0),GtQ(f,C0),EqQ(p,CN1)))))),
IIntegrate(800,Integrate(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_),Plus(f_DEFAULT,Times(g_DEFAULT,x_)),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),CN1)),x_Symbol),
    Condition(Integrate(ExpandIntegrand(Times(Power(Plus(d,Times(e,x)),m),Plus(f,Times(g,x)),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1)),x),x),And(FreeQ(List(a,b,c,d,e,f,g),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),NeQ(Plus(Times(c,Sqr(d)),Times(CN1,b,d,e),Times(a,Sqr(e))),C0),IntegerQ(m))))
  );
}