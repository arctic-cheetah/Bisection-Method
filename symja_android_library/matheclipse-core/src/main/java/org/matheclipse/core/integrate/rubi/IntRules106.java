package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="https://rulebasedintegration.org/">Rubi -
 * rule-based integrator</a>.
 *  
 */
class IntRules106 { 
  public static IAST RULES = List( 
IIntegrate(2121,Integrate(Times(Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_),Times(i_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(C2,Power(Times(i,Power(c,CN1)),m),Power(Power(f,Times(C2,m)),CN1)),Subst(Integrate(Times(Power(x,n),Power(Plus(Times(Sqr(d),e),Times(CN1,Subtract(Times(b,d),Times(a,e)),Sqr(f)),Times(CN1,Subtract(Times(C2,d,e),Times(b,Sqr(f))),x),Times(e,Sqr(x))),Plus(Times(C2,m),C1)),Power(Power(Plus(Times(CN2,d,e),Times(b,Sqr(f)),Times(C2,e,x)),Times(C2,Plus(m,C1))),CN1)),x),x,Plus(d,Times(e,x),Times(f,Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))))),x),And(FreeQ(List(a,b,c,d,e,f,g,h,i,n),x),EqQ(Subtract(Sqr(e),Times(c,Sqr(f))),C0),EqQ(Subtract(Times(c,g),Times(a,i)),C0),EqQ(Subtract(Times(c,h),Times(b,i)),C0),IntegerQ(Times(C2,m)),Or(IntegerQ(m),GtQ(Times(i,Power(c,CN1)),C0))))),
IIntegrate(2122,Integrate(Times(Power(Plus(g_,Times(i_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqrt(Plus(a_,Times(c_DEFAULT,Sqr(x_)))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(C1,Power(Times(i,Power(c,CN1)),m),Power(Times(Power(C2,Plus(Times(C2,m),C1)),e,Power(f,Times(C2,m))),CN1)),Subst(Integrate(Times(Power(x,n),Power(Plus(Sqr(d),Times(a,Sqr(f)),Times(CN1,C2,d,x),Sqr(x)),Plus(Times(C2,m),C1)),Power(Power(Plus(Negate(d),x),Times(C2,Plus(m,C1))),CN1)),x),x,Plus(d,Times(e,x),Times(f,Sqrt(Plus(a,Times(c,Sqr(x))))))),x),And(FreeQ(List(a,c,d,e,f,g,i,n),x),EqQ(Subtract(Sqr(e),Times(c,Sqr(f))),C0),EqQ(Subtract(Times(c,g),Times(a,i)),C0),IntegerQ(Times(C2,m)),Or(IntegerQ(m),GtQ(Times(i,Power(c,CN1)),C0))))),
IIntegrate(2123,Integrate(Times(Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_),Times(i_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(i,Power(c,CN1)),Subtract(m,C1D2)),Sqrt(Plus(g,Times(h,x),Times(i,Sqr(x)))),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),CN1D2)),Integrate(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),m),Power(Plus(d,Times(e,x),Times(f,Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)))))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,h,i,n),x),EqQ(Subtract(Sqr(e),Times(c,Sqr(f))),C0),EqQ(Subtract(Times(c,g),Times(a,i)),C0),EqQ(Subtract(Times(c,h),Times(b,i)),C0),IGtQ(Plus(m,C1D2),C0),Not(GtQ(Times(i,Power(c,CN1)),C0))))),
IIntegrate(2124,Integrate(Times(Power(Plus(g_,Times(i_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqrt(Plus(a_,Times(c_DEFAULT,Sqr(x_)))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(i,Power(c,CN1)),Subtract(m,C1D2)),Sqrt(Plus(g,Times(i,Sqr(x)))),Power(Plus(a,Times(c,Sqr(x))),CN1D2)),Integrate(Times(Power(Plus(a,Times(c,Sqr(x))),m),Power(Plus(d,Times(e,x),Times(f,Sqrt(Plus(a,Times(c,Sqr(x)))))),n)),x),x),And(FreeQ(List(a,c,d,e,f,g,i,n),x),EqQ(Subtract(Sqr(e),Times(c,Sqr(f))),C0),EqQ(Subtract(Times(c,g),Times(a,i)),C0),IGtQ(Plus(m,C1D2),C0),Not(GtQ(Times(i,Power(c,CN1)),C0))))),
IIntegrate(2125,Integrate(Times(Power(Plus(g_DEFAULT,Times(h_DEFAULT,x_),Times(i_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqrt(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(i,Power(c,CN1)),Plus(m,C1D2)),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)))),Power(Plus(g,Times(h,x),Times(i,Sqr(x))),CN1D2)),Integrate(Times(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),m),Power(Plus(d,Times(e,x),Times(f,Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)))))),n)),x),x),And(FreeQ(List(a,b,c,d,e,f,g,h,i,n),x),EqQ(Subtract(Sqr(e),Times(c,Sqr(f))),C0),EqQ(Subtract(Times(c,g),Times(a,i)),C0),EqQ(Subtract(Times(c,h),Times(b,i)),C0),ILtQ(Subtract(m,C1D2),C0),Not(GtQ(Times(i,Power(c,CN1)),C0))))),
IIntegrate(2126,Integrate(Times(Power(Plus(g_,Times(i_DEFAULT,Sqr(x_))),m_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_),Times(f_DEFAULT,Sqrt(Plus(a_,Times(c_DEFAULT,Sqr(x_)))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(i,Power(c,CN1)),Plus(m,C1D2)),Sqrt(Plus(a,Times(c,Sqr(x)))),Power(Plus(g,Times(i,Sqr(x))),CN1D2)),Integrate(Times(Power(Plus(a,Times(c,Sqr(x))),m),Power(Plus(d,Times(e,x),Times(f,Sqrt(Plus(a,Times(c,Sqr(x)))))),n)),x),x),And(FreeQ(List(a,c,d,e,f,g,i,n),x),EqQ(Subtract(Sqr(e),Times(c,Sqr(f))),C0),EqQ(Subtract(Times(c,g),Times(a,i)),C0),ILtQ(Subtract(m,C1D2),C0),Not(GtQ(Times(i,Power(c,CN1)),C0))))),
IIntegrate(2127,Integrate(Times(Power(Plus(u_,Times(f_DEFAULT,Plus(j_DEFAULT,Times(k_DEFAULT,Sqrt(v_))))),n_DEFAULT),Power(w_,m_DEFAULT)),x_Symbol),
    Condition(Integrate(Times(Power(ExpandToSum(w,x),m),Power(Plus(ExpandToSum(Plus(u,Times(f,j)),x),Times(f,k,Sqrt(ExpandToSum(v,x)))),n)),x),And(FreeQ(List(f,j,k,m,n),x),LinearQ(u,x),QuadraticQ(List(v,w),x),Not(And(LinearMatchQ(u,x),QuadraticMatchQ(List(v,w),x),Or(EqQ(j,C0),EqQ(f,C1)))),EqQ(Subtract(Sqr(Coefficient(u,x,C1)),Times(Coefficient(v,x,C2),Sqr(f),Sqr(k))),C0)))),
IIntegrate(2128,Integrate(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),CN1),Power(Plus(Times(c_DEFAULT,Sqr(x_)),Times(d_DEFAULT,Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT))),p_DEFAULT))),CN1D2)),x_Symbol),
    Condition(Dist(Power(a,CN1),Subst(Integrate(Power(Subtract(C1,Times(c,Sqr(x))),CN1),x),x,Times(x,Power(Plus(Times(c,Sqr(x)),Times(d,Power(Plus(a,Times(b,Power(x,n))),Times(C2,Power(n,CN1))))),CN1D2))),x),And(FreeQ(List(a,b,c,d,n),x),EqQ(p,Times(C2,Power(n,CN1)))))),
IIntegrate(2129,Integrate(Sqrt(Plus(a_,Times(b_DEFAULT,Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(C2,Sqr(b),d,Power(x,C3),Power(Times(C3,Power(Plus(a,Times(b,Sqrt(Plus(c,Times(d,Sqr(x)))))),QQ(3L,2L))),CN1)),x),Simp(Times(C2,a,x,Power(Plus(a,Times(b,Sqrt(Plus(c,Times(d,Sqr(x)))))),CN1D2)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Subtract(Sqr(a),Times(Sqr(b),c)),C0)))),
IIntegrate(2130,Integrate(Times(Power(x_,CN1),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),CN1D2),Sqrt(Plus(Times(a_DEFAULT,Sqr(x_)),Times(b_DEFAULT,x_,Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_)))))))),x_Symbol),
    Condition(Dist(Times(CSqrt2,b,Power(a,CN1)),Subst(Integrate(Power(Plus(C1,Times(Sqr(x),Power(a,CN1))),CN1D2),x),x,Plus(Times(a,x),Times(b,Sqrt(Plus(c,Times(d,Sqr(x))))))),x),And(FreeQ(List(a,b,c,d),x),EqQ(Subtract(Sqr(a),Times(Sqr(b),d)),C0),EqQ(Plus(Times(Sqr(b),c),a),C0)))),
IIntegrate(2131,Integrate(Times(Power(x_,CN1),Power(Plus(c_,Times(d_DEFAULT,Sqr(x_))),CN1D2),Sqrt(Times(e_DEFAULT,x_,Plus(Times(a_DEFAULT,x_),Times(b_DEFAULT,Sqrt(Plus(c_,Times(d_DEFAULT,Sqr(x_))))))))),x_Symbol),
    Condition(Integrate(Times(Sqrt(Plus(Times(a,e,Sqr(x)),Times(b,e,x,Sqrt(Plus(c,Times(d,Sqr(x))))))),Power(Times(x,Sqrt(Plus(c,Times(d,Sqr(x))))),CN1)),x),And(FreeQ(List(a,b,c,d,e),x),EqQ(Subtract(Sqr(a),Times(Sqr(b),d)),C0),EqQ(Plus(Times(Sqr(b),c,e),a),C0)))),
IIntegrate(2132,Integrate(Times(Power(Plus(a_,Times(b_DEFAULT,Power(x_,C4))),CN1D2),Sqrt(Plus(Times(c_DEFAULT,Sqr(x_)),Times(d_DEFAULT,Sqrt(Plus(a_,Times(b_DEFAULT,Power(x_,C4)))))))),x_Symbol),
    Condition(Dist(d,Subst(Integrate(Power(Subtract(C1,Times(C2,c,Sqr(x))),CN1),x),x,Times(x,Power(Plus(Times(c,Sqr(x)),Times(d,Sqrt(Plus(a,Times(b,Power(x,C4)))))),CN1D2))),x),And(FreeQ(List(a,b,c,d),x),EqQ(Subtract(Sqr(c),Times(b,Sqr(d))),C0)))),
IIntegrate(2133,Integrate(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(e_DEFAULT,Power(x_,C4))),CN1D2),Sqrt(Plus(Times(b_DEFAULT,Sqr(x_)),Sqrt(Plus(a_,Times(e_DEFAULT,Power(x_,C4))))))),x_Symbol),
    Condition(Plus(Dist(Times(C1D2,Subtract(C1,CI)),Integrate(Times(Power(Plus(c,Times(d,x)),m),Power(Subtract(Sqrt(a),Times(CI,b,Sqr(x))),CN1D2)),x),x),Dist(Times(C1D2,Plus(C1,CI)),Integrate(Times(Power(Plus(c,Times(d,x)),m),Power(Plus(Sqrt(a),Times(CI,b,Sqr(x))),CN1D2)),x),x)),And(FreeQ(List(a,b,c,d,m),x),EqQ(e,Sqr(b)),GtQ(a,C0)))),
IIntegrate(2134,Integrate(Times(Power(Plus(c_,Times(d_DEFAULT,x_)),CN1),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1D2)),x_Symbol),
    Condition(Plus(Dist(Times(C2,Power(Times(C3,c),CN1)),Integrate(Power(Plus(a,Times(b,Power(x,C3))),CN1D2),x),x),Dist(Power(Times(C3,c),CN1),Integrate(Times(Subtract(c,Times(C2,d,x)),Power(Times(Plus(c,Times(d,x)),Sqrt(Plus(a,Times(b,Power(x,C3))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Subtract(Times(b,Power(c,C3)),Times(C4,a,Power(d,C3))),C0)))),
IIntegrate(2135,Integrate(Times(Power(Plus(c_,Times(d_DEFAULT,x_)),CN1),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1D2)),x_Symbol),
    Condition(Plus(Dist(Times(CN6,a,Power(d,C3),Power(Times(c,Subtract(Times(b,Power(c,C3)),Times(ZZ(28L),a,Power(d,C3)))),CN1)),Integrate(Power(Plus(a,Times(b,Power(x,C3))),CN1D2),x),x),Dist(Power(Times(c,Subtract(Times(b,Power(c,C3)),Times(ZZ(28L),a,Power(d,C3)))),CN1),Integrate(Times(Simp(Plus(Times(c,Subtract(Times(b,Power(c,C3)),Times(ZZ(22L),a,Power(d,C3)))),Times(C6,a,Power(d,C4),x)),x),Power(Times(Plus(c,Times(d,x)),Sqrt(Plus(a,Times(b,Power(x,C3))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Subtract(Subtract(Times(Sqr(b),Power(c,C6)),Times(ZZ(20L),a,b,Power(c,C3),Power(d,C3))),Times(C8,Sqr(a),Power(d,C6))),C0)))),
IIntegrate(2136,Integrate(Times(Power(Plus(c_,Times(d_DEFAULT,x_)),CN1),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1D2)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(b,Power(a,CN1)),C3))),Plus(Negate(Dist(Times(q,Power(Subtract(Times(Plus(C1,CSqrt3),d),Times(c,q)),CN1)),Integrate(Power(Plus(a,Times(b,Power(x,C3))),CN1D2),x),x)),Dist(Times(d,Power(Subtract(Times(Plus(C1,CSqrt3),d),Times(c,q)),CN1)),Integrate(Times(Plus(C1,CSqrt3,Times(q,x)),Power(Times(Plus(c,Times(d,x)),Sqrt(Plus(a,Times(b,Power(x,C3))))),CN1)),x),x))),And(FreeQ(List(a,b,c,d),x),NeQ(Subtract(Subtract(Times(Sqr(b),Power(c,C6)),Times(ZZ(20L),a,b,Power(c,C3),Power(d,C3))),Times(C8,Sqr(a),Power(d,C6))),C0)))),
IIntegrate(2137,Integrate(Times(Power(Plus(c_,Times(d_DEFAULT,x_)),CN1),Plus(e_,Times(f_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1D2)),x_Symbol),
    Condition(Dist(Times(C2,e,Power(d,CN1)),Subst(Integrate(Power(Plus(C1,Times(C3,a,Sqr(x))),CN1),x),x,Times(Plus(C1,Times(C2,d,x,Power(c,CN1))),Power(Plus(a,Times(b,Power(x,C3))),CN1D2))),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(d,e),Times(c,f)),C0),EqQ(Subtract(Times(b,Power(c,C3)),Times(C4,a,Power(d,C3))),C0),EqQ(Plus(Times(C2,d,e),Times(c,f)),C0)))),
IIntegrate(2138,Integrate(Times(Power(Plus(c_,Times(d_DEFAULT,x_)),CN1),Plus(e_,Times(f_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1D2)),x_Symbol),
    Condition(Dist(Times(CN2,e,Power(d,CN1)),Subst(Integrate(Power(Subtract(C9,Times(a,Sqr(x))),CN1),x),x,Times(Sqr(Plus(C1,Times(f,x,Power(e,CN1)))),Power(Plus(a,Times(b,Power(x,C3))),CN1D2))),x),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(d,e),Times(c,f)),C0),EqQ(Plus(Times(b,Power(c,C3)),Times(C8,a,Power(d,C3))),C0),EqQ(Plus(Times(C2,d,e),Times(c,f)),C0)))),
IIntegrate(2139,Integrate(Times(Power(Plus(c_,Times(d_DEFAULT,x_)),CN1),Plus(e_DEFAULT,Times(f_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1D2)),x_Symbol),
    Condition(Plus(Dist(Times(Plus(Times(C2,d,e),Times(c,f)),Power(Times(C3,c,d),CN1)),Integrate(Power(Plus(a,Times(b,Power(x,C3))),CN1D2),x),x),Dist(Times(Subtract(Times(d,e),Times(c,f)),Power(Times(C3,c,d),CN1)),Integrate(Times(Subtract(c,Times(C2,d,x)),Power(Times(Plus(c,Times(d,x)),Sqrt(Plus(a,Times(b,Power(x,C3))))),CN1)),x),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(d,e),Times(c,f)),C0),Or(EqQ(Subtract(Times(b,Power(c,C3)),Times(C4,a,Power(d,C3))),C0),EqQ(Plus(Times(b,Power(c,C3)),Times(C8,a,Power(d,C3))),C0)),NeQ(Plus(Times(C2,d,e),Times(c,f)),C0)))),
IIntegrate(2140,Integrate(Times(Power(Plus(c_,Times(d_DEFAULT,x_)),CN1),Plus(e_,Times(f_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,Power(x_,C3))),CN1D2)),x_Symbol),
    Condition(With(List(Set(k,Simplify(Times(Plus(Times(d,e),Times(C2,c,f)),Power(Times(c,f),CN1))))),Dist(Times(Plus(C1,k),e,Power(d,CN1)),Subst(Integrate(Power(Plus(C1,Times(Plus(C3,Times(C2,k)),a,Sqr(x))),CN1),x),x,Times(Plus(C1,Times(Plus(C1,k),d,x,Power(c,CN1))),Power(Plus(a,Times(b,Power(x,C3))),CN1D2))),x)),And(FreeQ(List(a,b,c,d,e,f),x),NeQ(Subtract(Times(d,e),Times(c,f)),C0),EqQ(Subtract(Subtract(Times(Sqr(b),Power(c,C6)),Times(ZZ(20L),a,b,Power(c,C3),Power(d,C3))),Times(C8,Sqr(a),Power(d,C6))),C0),EqQ(Subtract(Times(C6,a,Power(d,C4),e),Times(c,f,Subtract(Times(b,Power(c,C3)),Times(ZZ(22L),a,Power(d,C3))))),C0))))
  );
}
