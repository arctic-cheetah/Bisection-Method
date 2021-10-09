package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="https://rulebasedintegration.org/">Rubi -
 * rule-based integrator</a>.
 *  
 */
class IntRules89 { 
  public static IAST RULES = List( 
IIntegrate(1781,Integrate(Times(Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT),Plus(d_,Times(g_DEFAULT,Power(x_,$p("n3",true))),Times(e_DEFAULT,Power(x_,n_)))),x_Symbol),
    Condition(Simp(Times(x,Plus(Times(a,d,Plus(n,C1)),Times(Subtract(Times(a,e),Times(b,d,Plus(Times(n,Plus(p,C1)),C1))),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(Sqr(a),Plus(n,C1)),CN1)),x),And(FreeQ(List(a,b,c,d,e,g,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ($s("n3"),Times(C3,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),EqQ(Subtract(Times(Sqr(a),g,Plus(n,C1)),Times(c,Plus(Times(n,Plus(Times(C2,p),C3)),C1),Subtract(Times(a,e),Times(b,d,Plus(Times(n,Plus(p,C1)),C1))))),C0),EqQ(Plus(Times(a,c,d,Plus(n,C1),Plus(Times(C2,n,Plus(p,C1)),C1)),Times(b,Plus(Times(n,Plus(p,C2)),C1),Subtract(Times(a,e),Times(b,d,Plus(Times(n,Plus(p,C1)),C1))))),C0)))),
IIntegrate(1782,Integrate(Times(Plus(d_,Times(g_DEFAULT,Power(x_,$p("n3",true)))),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Simp(Times(d,x,Subtract(Times(a,Plus(n,C1)),Times(b,Plus(Times(n,Plus(p,C1)),C1),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(Sqr(a),Plus(n,C1)),CN1)),x),And(FreeQ(List(a,b,c,d,g,n,p),x),EqQ($s("n2"),Times(C2,n)),EqQ($s("n3"),Times(C3,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),EqQ(Plus(Times(Sqr(a),g,Plus(n,C1)),Times(c,b,d,Plus(Times(n,Plus(Times(C2,p),C3)),C1),Plus(Times(n,Plus(p,C1)),C1))),C0),EqQ(Subtract(Times(a,c,d,Plus(n,C1),Plus(Times(C2,n,Plus(p,C1)),C1)),Times(Sqr(b),d,Plus(Times(n,Plus(p,C2)),C1),Plus(Times(n,Plus(p,C1)),C1))),C0)))),
IIntegrate(1783,Integrate(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Module(List(Set(q,Expon($s("§pq"),x)),i),Condition(Plus(Negate(Simp(Times(x,Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Sum(Plus(Times(Subtract(Times(Subtract(Sqr(b),Times(C2,a,c)),Coeff($s("§pq"),x,i)),Times(a,b,Coeff($s("§pq"),x,Plus(n,i)))),Power(x,i)),Times(c,Subtract(Times(b,Coeff($s("§pq"),x,i)),Times(C2,a,Coeff($s("§pq"),x,Plus(n,i)))),Power(x,Plus(n,i)))),List(i,C0,Subtract(n,C1))),Power(Times(a,n,Plus(p,C1),Subtract(Sqr(b),Times(C4,a,c))),CN1)),x)),Dist(Power(Times(a,n,Plus(p,C1),Subtract(Sqr(b),Times(C4,a,c))),CN1),Integrate(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Sum(Plus(Times(Subtract(Times(Subtract(Times(Sqr(b),Plus(Times(n,Plus(p,C1)),i,C1)),Times(C2,a,c,Plus(Times(C2,n,Plus(p,C1)),i,C1))),Coeff($s("§pq"),x,i)),Times(a,b,Plus(i,C1),Coeff($s("§pq"),x,Plus(n,i)))),Power(x,i)),Times(c,Plus(Times(n,Plus(Times(C2,p),C3)),i,C1),Subtract(Times(b,Coeff($s("§pq"),x,i)),Times(C2,a,Coeff($s("§pq"),x,Plus(n,i)))),Power(x,Plus(n,i)))),List(i,C0,Subtract(n,C1)))),x),x)),LtQ(q,Times(C2,n)))),And(FreeQ(List(a,b,c),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IGtQ(n,C0),LtQ(p,CN1)))),
IIntegrate(1784,Integrate(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Condition(Module(List(Set(QSymbol,PolynomialQuotient(Times(Power(Times(b,c),Plus(Floor(Times(Subtract(q,C1),Power(n,CN1))),C1)),$s("§pq")),Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),x)),Set($s("R"),PolynomialRemainder(Times(Power(Times(b,c),Plus(Floor(Times(Subtract(q,C1),Power(n,CN1))),C1)),$s("§pq")),Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),x)),i),Subtract(Dist(Power(Times(a,n,Plus(p,C1),Subtract(Sqr(b),Times(C4,a,c)),Power(Times(b,c),Plus(Floor(Times(Subtract(q,C1),Power(n,CN1))),C1))),CN1),Integrate(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),ExpandToSum(Plus(Times(a,n,Plus(p,C1),Subtract(Sqr(b),Times(C4,a,c)),QSymbol),Sum(Plus(Times(Subtract(Times(Subtract(Times(Sqr(b),Plus(Times(n,Plus(p,C1)),i,C1)),Times(C2,a,c,Plus(Times(C2,n,Plus(p,C1)),i,C1))),Coeff($s("R"),x,i)),Times(a,b,Plus(i,C1),Coeff($s("R"),x,Plus(n,i)))),Power(x,i)),Times(c,Plus(Times(n,Plus(Times(C2,p),C3)),i,C1),Subtract(Times(b,Coeff($s("R"),x,i)),Times(C2,a,Coeff($s("R"),x,Plus(n,i)))),Power(x,Plus(n,i)))),List(i,C0,Subtract(n,C1)))),x)),x),x),Simp(Times(x,Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Sum(Plus(Times(Subtract(Times(Subtract(Sqr(b),Times(C2,a,c)),Coeff($s("R"),x,i)),Times(a,b,Coeff($s("R"),x,Plus(n,i)))),Power(x,i)),Times(c,Subtract(Times(b,Coeff($s("R"),x,i)),Times(C2,a,Coeff($s("R"),x,Plus(n,i)))),Power(x,Plus(n,i)))),List(i,C0,Subtract(n,C1))),Power(Times(a,n,Plus(p,C1),Subtract(Sqr(b),Times(C4,a,c)),Power(Times(b,c),Plus(Floor(Times(Subtract(q,C1),Power(n,CN1))),C1))),CN1)),x))),GeQ(q,Times(C2,n)))),And(FreeQ(List(a,b,c),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IGtQ(n,C0),LtQ(p,CN1)))),
IIntegrate(1785,Integrate(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2")))),CN1)),x_Symbol),
    Condition(Integrate(ExpandIntegrand(Times($s("§pq"),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),CN1)),x),x),And(FreeQ(List(a,b,c),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),Power(x,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IGtQ(n,C0),Or(NiceSqrtQ(Subtract(Sqr(b),Times(C4,a,c))),LtQ(Expon($s("§pq"),x),n))))),
IIntegrate(1786,Integrate(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Condition(With(List(Set($s("§pqq"),Coeff($s("§pq"),x,q))),Plus(Dist(C1D2,Integrate(Times(ExpandToSum(Subtract(Times(C2,$s("§pq")),Times(Power(c,p),$s("§pqq"),Plus(b,Times(C2,c,x)),Power(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1)),CN1))),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),x),Simp(Times(C1D2,Power(c,p),$s("§pqq"),Log(Plus(a,Times(b,x),Times(c,Sqr(x))))),x))),EqQ(Plus(q,Times(C2,p),C1),C0))),And(FreeQ(List(a,b,c),x),PolyQ($s("§pq"),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),ILtQ(p,C0)))),
IIntegrate(1787,Integrate(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Condition(With(List(Set($s("§pqq"),Coeff($s("§pq"),x,q))),Plus(Integrate(Times(ExpandToSum(Subtract($s("§pq"),Times(Power(c,Plus(p,C1D2)),$s("§pqq"),Power(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1D2)),CN1))),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),Simp(Times(Power(c,p),$s("§pqq"),ArcTanh(Times(Plus(b,Times(C2,c,x)),Power(Times(C2,Rt(c,C2),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),CN1)))),x))),EqQ(Plus(q,Times(C2,p),C1),C0))),And(FreeQ(List(a,b,c),x),PolyQ($s("§pq"),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),ILtQ(Plus(p,C1D2),C0),PosQ(c)))),
IIntegrate(1788,Integrate(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Condition(With(List(Set($s("§pqq"),Coeff($s("§pq"),x,q))),Subtract(Integrate(Times(ExpandToSum(Subtract($s("§pq"),Times(Power(Negate(c),Plus(p,C1D2)),$s("§pqq"),Power(Power(Plus(a,Times(b,x),Times(c,Sqr(x))),Plus(p,C1D2)),CN1))),x),Power(Plus(a,Times(b,x),Times(c,Sqr(x))),p)),x),Simp(Times(Power(Negate(c),p),$s("§pqq"),ArcTan(Times(Plus(b,Times(C2,c,x)),Power(Times(C2,Rt(Negate(c),C2),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x))))),CN1)))),x))),EqQ(Plus(q,Times(C2,p),C1),C0))),And(FreeQ(List(a,b,c),x),PolyQ($s("§pq"),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),ILtQ(Plus(p,C1D2),C0),NegQ(c)))),
IIntegrate(1789,Integrate(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(With(List(Set(q,Expon($s("§pq"),x))),Condition(With(List(Set($s("§pqq"),Coeff($s("§pq"),x,q))),Plus(Integrate(Times(ExpandToSum(Subtract(Subtract($s("§pq"),Times($s("§pqq"),Power(x,q))),Times($s("§pqq"),Plus(Times(a,Plus(q,Times(CN1,C2,n),C1),Power(x,Subtract(q,Times(C2,n)))),Times(b,Plus(q,Times(n,Subtract(p,C1)),C1),Power(x,Subtract(q,n)))),Power(Times(c,Plus(q,Times(C2,n,p),C1)),CN1))),x),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),Simp(Times($s("§pqq"),Power(x,Plus(q,Times(CN1,C2,n),C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(c,Plus(q,Times(C2,n,p),C1)),CN1)),x))),And(GeQ(q,Times(C2,n)),NeQ(Plus(q,Times(C2,n,p),C1),C0),Or(IntegerQ(Times(C2,p)),And(EqQ(n,C1),IntegerQ(Times(C4,p))),IntegerQ(Plus(p,Times(Plus(q,C1),Power(Times(C2,n),CN1)))))))),And(FreeQ(List(a,b,c,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),Power(x,n)),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IGtQ(n,C0)))),
IIntegrate(1790,Integrate(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(Module(List(Set(q,Expon($s("§pq"),x)),j,k),Integrate(Sum(Times(Power(x,j),Sum(Times(Coeff($s("§pq"),x,Plus(j,Times(k,n))),Power(x,Times(k,n))),List(k,C0,Plus(Times(Subtract(q,j),Power(n,CN1)),C1))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),List(j,C0,Subtract(n,C1))),x)),And(FreeQ(List(a,b,c,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IGtQ(n,C0),Not(PolyQ($s("§pq"),Power(x,n)))))),
IIntegrate(1791,Integrate(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),CN1)),x_Symbol),
    Condition(Integrate(RationalFunctionExpand(Times($s("§pq"),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),CN1)),x),x),And(FreeQ(List(a,b,c),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),IGtQ(n,C0)))),
IIntegrate(1792,Integrate(Times($p("§pq"),Power(Plus(a_,Times(c_DEFAULT,Power(x_,$p("n2",true))),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(With(List(Set(g,Denominator(n))),Dist(g,Subst(Integrate(Times(Power(x,Subtract(g,C1)),ReplaceAll($s("§pq"),Rule(x,Power(x,g))),Power(Plus(a,Times(b,Power(x,Times(g,n))),Times(c,Power(x,Times(C2,g,n)))),p)),x),x,Power(x,Power(g,CN1))),x)),And(FreeQ(List(a,b,c,p),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),FractionQ(n)))),
IIntegrate(1793,Integrate(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),CN1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Subtract(Sqr(b),Times(C4,a,c)),C2))),Subtract(Dist(Times(C2,c,Power(q,CN1)),Integrate(Times($s("§pq"),Power(Plus(b,Negate(q),Times(C2,c,Power(x,n))),CN1)),x),x),Dist(Times(C2,c,Power(q,CN1)),Integrate(Times($s("§pq"),Power(Plus(b,q,Times(C2,c,Power(x,n))),CN1)),x),x))),And(FreeQ(List(a,b,c,n),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0)))),
IIntegrate(1794,Integrate(Times($p("§p3"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(With(List(Set(d,Coeff($s("§p3"),Power(x,n),C0)),Set(e,Coeff($s("§p3"),Power(x,n),C1)),Set(f,Coeff($s("§p3"),Power(x,n),C2)),Set(g,Coeff($s("§p3"),Power(x,n),C3))),Subtract(Negate(Simp(Times(x,Plus(Times(Sqr(b),c,d),Times(CN1,C2,a,c,Subtract(Times(c,d),Times(a,f))),Times(CN1,a,b,Plus(Times(c,e),Times(a,g))),Times(Subtract(Subtract(Times(b,c,Plus(Times(c,d),Times(a,f))),Times(a,Sqr(b),g)),Times(C2,a,c,Subtract(Times(c,e),Times(a,g)))),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(a,c,n,Plus(p,C1),Subtract(Sqr(b),Times(C4,a,c))),CN1)),x)),Dist(Power(Times(a,c,n,Plus(p,C1),Subtract(Sqr(b),Times(C4,a,c))),CN1),Integrate(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Simp(Plus(Times(a,b,Plus(Times(c,e),Times(a,g))),Times(CN1,Sqr(b),c,d,Plus(n,Times(n,p),C1)),Times(CN1,C2,a,c,Subtract(Times(a,f),Times(c,d,Plus(Times(C2,n,Plus(p,C1)),C1)))),Times(Subtract(Subtract(Times(a,Sqr(b),g,Plus(Times(n,Plus(p,C2)),C1)),Times(b,c,Plus(Times(c,d),Times(a,f)),Plus(Times(n,Plus(Times(C2,p),C3)),C1))),Times(C2,a,c,Subtract(Times(a,g,Plus(n,C1)),Times(c,e,Plus(Times(n,Plus(Times(C2,p),C3)),C1))))),Power(x,n))),x)),x),x))),And(FreeQ(List(a,b,c,n),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§p3"),Power(x,n),C3),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),ILtQ(p,CN1)))),
IIntegrate(1795,Integrate(Times($p("§p2"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_)),Times(c_DEFAULT,Power(x_,$p("n2")))),p_)),x_Symbol),
    Condition(With(List(Set(d,Coeff($s("§p2"),Power(x,n),C0)),Set(e,Coeff($s("§p2"),Power(x,n),C1)),Set(f,Coeff($s("§p2"),Power(x,n),C2))),Subtract(Negate(Simp(Times(x,Plus(Times(Sqr(b),d),Times(CN1,C2,a,Subtract(Times(c,d),Times(a,f))),Times(CN1,a,b,e),Times(Subtract(Times(b,Plus(Times(c,d),Times(a,f))),Times(C2,a,c,e)),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(a,n,Plus(p,C1),Subtract(Sqr(b),Times(C4,a,c))),CN1)),x)),Dist(Power(Times(a,n,Plus(p,C1),Subtract(Sqr(b),Times(C4,a,c))),CN1),Integrate(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Simp(Subtract(Subtract(Subtract(Times(a,b,e),Times(Sqr(b),d,Plus(n,Times(n,p),C1))),Times(C2,a,Subtract(Times(a,f),Times(c,d,Plus(Times(C2,n,Plus(p,C1)),C1))))),Times(Subtract(Times(b,Plus(Times(c,d),Times(a,f)),Plus(Times(n,Plus(Times(C2,p),C3)),C1)),Times(C2,a,c,e,Plus(Times(n,Plus(Times(C2,p),C3)),C1))),Power(x,n))),x)),x),x))),And(FreeQ(List(a,b,c,n),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§p2"),Power(x,n),C2),NeQ(Subtract(Sqr(b),Times(C4,a,c)),C0),ILtQ(p,CN1)))),
IIntegrate(1796,Integrate(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_)),x_Symbol),
    Condition(Integrate(ExpandIntegrand(Times($s("§pq"),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(FreeQ(List(a,b,c,n),x),EqQ($s("n2"),Times(C2,n)),PolyQ($s("§pq"),x),ILtQ(p,CN1)))),
IIntegrate(1797,Integrate(Times($p("§pq"),Power(Plus(a_,Times(b_DEFAULT,Power(x_,n_DEFAULT)),Times(c_DEFAULT,Power(x_,$p("n2",true)))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times($s("§pq"),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),And(FreeQ(List(a,b,c,n,p),x),EqQ($s("n2"),Times(C2,n)),Or(PolyQ($s("§pq"),x),PolyQ($s("§pq"),Power(x,n)))))),
IIntegrate(1798,Integrate(Times($p("§pq"),Power(Plus(a_,Times(c_DEFAULT,Power(v_,$p("n2",true))),Times(b_DEFAULT,Power(v_,n_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Coefficient(v,x,C1),CN1),Subst(Integrate(Times(SubstFor(v,$s("§pq"),x),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x,v),x),And(FreeQ(List(a,b,c,n,p),x),EqQ($s("n2"),Times(C2,n)),LinearQ(v,x),PolyQ($s("§pq"),Power(v,n))))),
IIntegrate(1799,Integrate(Times($p("§pq"),Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(C1D2,Subst(Integrate(Times(Power(x,Times(C1D2,Subtract(m,C1))),SubstFor(Sqr(x),$s("§pq"),x),Power(Plus(a,Times(b,x)),p)),x),x,Sqr(x)),x),And(FreeQ(List(a,b,p),x),PolyQ($s("§pq"),Sqr(x)),IntegerQ(Times(C1D2,Subtract(m,C1)))))),
IIntegrate(1800,Integrate(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(c,CN1),Integrate(Times(Power(Times(c,x),Plus(m,C1)),PolynomialQuotient($s("§pq"),x,x),Power(Plus(a,Times(b,Sqr(x))),p)),x),x),And(FreeQ(List(a,b,c,m,p),x),PolyQ($s("§pq"),x),EqQ(Coeff($s("§pq"),x,C0),C0))))
  );
}