package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="https://rulebasedintegration.org/">Rubi -
 * rule-based integrator</a>.
 *  
 */
class IntRules181 { 
  public static IAST RULES = List( 
IIntegrate(3621,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Subtract(Plus(Times(a,ASymbol),Times(b,BSymbol)),Times(a,CSymbol)),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Times(C2,a,f,m),CN1)),x)),Dist(Power(Times(C2,Sqr(a),m),CN1),Integrate(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Subtract(Plus(Times(b,BSymbol),Times(CN1,a,CSymbol),Times(a,ASymbol,Plus(Times(C2,m),C1))),Times(Plus(Times(b,CSymbol,Subtract(m,C1)),Times(Subtract(Times(ASymbol,b),Times(a,BSymbol)),Plus(m,C1))),Tan(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,CSymbol),x),NeQ(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)),C0),LeQ(m,CN1),EqQ(Plus(Sqr(a),Sqr(b)),C0)))),
IIntegrate(3622,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Subtract(Times(a,ASymbol),Times(a,CSymbol)),Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Times(C2,a,f,m),CN1)),x)),Dist(Power(Times(C2,Sqr(a),m),CN1),Integrate(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Subtract(Plus(Times(CN1,a,CSymbol),Times(a,ASymbol,Plus(Times(C2,m),C1))),Times(Plus(Times(b,CSymbol,Subtract(m,C1)),Times(ASymbol,b,Plus(m,C1))),Tan(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,e,f,ASymbol,CSymbol),x),NeQ(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)),C0),LeQ(m,CN1),EqQ(Plus(Sqr(a),Sqr(b)),C0)))),
IIntegrate(3623,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1),Plus(A_,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Subtract(Plus(Times(a,ASymbol),Times(b,BSymbol)),Times(a,CSymbol)),x,Power(Plus(Sqr(a),Sqr(b)),CN1)),x),Dist(Times(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)),Power(Plus(Sqr(a),Sqr(b)),CN1)),Integrate(Times(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1)),x),x)),And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,CSymbol),x),NeQ(Plus(Sqr(a),Sqr(b)),C0),EqQ(Subtract(Subtract(Times(ASymbol,b),Times(a,BSymbol)),Times(b,CSymbol)),C0)))),
IIntegrate(3624,Integrate(Times(Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),CN1),Plus(A_,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(BSymbol,x),x),Dist(ASymbol,Integrate(Power(Tan(Plus(e,Times(f,x))),CN1),x),x),Dist(CSymbol,Integrate(Tan(Plus(e,Times(f,x))),x),x)),And(FreeQ(List(e,f,ASymbol,BSymbol,CSymbol),x),NeQ(ASymbol,CSymbol)))),
IIntegrate(3625,Integrate(Times(Power($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),CN1),Plus(A_,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Dist(ASymbol,Integrate(Power(Tan(Plus(e,Times(f,x))),CN1),x),x),Dist(CSymbol,Integrate(Tan(Plus(e,Times(f,x))),x),x)),And(FreeQ(List(e,f,ASymbol,CSymbol),x),NeQ(ASymbol,CSymbol)))),
IIntegrate(3626,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1),Plus(A_,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Subtract(Plus(Times(a,ASymbol),Times(b,BSymbol)),Times(a,CSymbol)),x,Power(Plus(Sqr(a),Sqr(b)),CN1)),x),Dist(Times(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)),Power(Plus(Sqr(a),Sqr(b)),CN1)),Integrate(Times(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1)),x),x),Negate(Dist(Times(Subtract(Subtract(Times(ASymbol,b),Times(a,BSymbol)),Times(b,CSymbol)),Power(Plus(Sqr(a),Sqr(b)),CN1)),Integrate(Tan(Plus(e,Times(f,x))),x),x))),And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,CSymbol),x),NeQ(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(Subtract(Subtract(Times(ASymbol,b),Times(a,BSymbol)),Times(b,CSymbol)),C0)))),
IIntegrate(3627,Integrate(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),CN1),Plus(A_,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(a,Subtract(ASymbol,CSymbol),x,Power(Plus(Sqr(a),Sqr(b)),CN1)),x),Dist(Times(Plus(Times(Sqr(a),CSymbol),Times(ASymbol,Sqr(b))),Power(Plus(Sqr(a),Sqr(b)),CN1)),Integrate(Times(Plus(C1,Sqr(Tan(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),CN1)),x),x),Negate(Dist(Times(b,Subtract(ASymbol,CSymbol),Power(Plus(Sqr(a),Sqr(b)),CN1)),Integrate(Tan(Plus(e,Times(f,x))),x),x))),And(FreeQ(List(a,b,e,f,ASymbol,CSymbol),x),NeQ(Plus(Times(Sqr(a),CSymbol),Times(ASymbol,Sqr(b))),C0),NeQ(Plus(Sqr(a),Sqr(b)),C0),NeQ(ASymbol,CSymbol)))),
IIntegrate(3628,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1),Plus(Sqr(a),Sqr(b))),CN1)),x),Dist(Power(Plus(Sqr(a),Sqr(b)),CN1),Integrate(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Subtract(Plus(Times(b,BSymbol),Times(a,Subtract(ASymbol,CSymbol))),Times(Subtract(Subtract(Times(ASymbol,b),Times(a,BSymbol)),Times(b,CSymbol)),Tan(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,CSymbol),x),NeQ(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)),C0),LtQ(m,CN1),NeQ(Plus(Sqr(a),Sqr(b)),C0)))),
IIntegrate(3629,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1),Plus(Sqr(a),Sqr(b))),CN1)),x),Dist(Power(Plus(Sqr(a),Sqr(b)),CN1),Integrate(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Simp(Subtract(Times(a,Subtract(ASymbol,CSymbol)),Times(Subtract(Times(ASymbol,b),Times(b,CSymbol)),Tan(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,e,f,ASymbol,CSymbol),x),NeQ(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)),C0),LtQ(m,CN1),NeQ(Plus(Sqr(a),Sqr(b)),C0)))),
IIntegrate(3630,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(CSymbol,Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),CN1)),x),Integrate(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Simp(Plus(ASymbol,Negate(CSymbol),Times(BSymbol,Tan(Plus(e,Times(f,x))))),x)),x)),And(FreeQ(List(a,b,e,f,ASymbol,BSymbol,CSymbol,m),x),NeQ(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)),C0),Not(LeQ(m,CN1))))),
IIntegrate(3631,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(CSymbol,Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(b,f,Plus(m,C1)),CN1)),x),Dist(Subtract(ASymbol,CSymbol),Integrate(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),x),x)),And(FreeQ(List(a,b,e,f,ASymbol,CSymbol,m),x),NeQ(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)),C0),Not(LeQ(m,CN1))))),
IIntegrate(3632,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Dist(Power(b,CN2),Integrate(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Plus(Times(b,BSymbol),Times(CN1,a,CSymbol),Times(b,CSymbol,Tan(Plus(e,Times(f,x)))))),x),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,CSymbol,m,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Times(ASymbol,Sqr(b)),Times(CN1,a,b,BSymbol),Times(Sqr(a),CSymbol)),C0)))),
IIntegrate(3633,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Negate(Dist(Times(CSymbol,Power(b,CN2)),Integrate(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Subtract(a,Times(b,Tan(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,CSymbol,m,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Times(ASymbol,Sqr(b)),Times(Sqr(a),CSymbol)),C0)))),
IIntegrate(3634,Integrate(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT),Plus(A_,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Dist(Times(ASymbol,Power(f,CN1)),Subst(Integrate(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(d,x)),n)),x),x,Tan(Plus(e,Times(f,x)))),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,CSymbol,m,n),x),EqQ(ASymbol,CSymbol)))),
IIntegrate(3635,Integrate(Times(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Subtract(Times(b,c),Times(a,d)),Plus(Times(Sqr(c),CSymbol),Times(CN1,BSymbol,c,d),Times(ASymbol,Sqr(d))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(Sqr(d),f,Plus(n,C1),Plus(Sqr(c),Sqr(d))),CN1)),x)),Dist(Power(Times(d,Plus(Sqr(c),Sqr(d))),CN1),Integrate(Times(Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Simp(Plus(Times(a,d,Plus(Times(ASymbol,c),Times(CN1,c,CSymbol),Times(BSymbol,d))),Times(b,Plus(Times(Sqr(c),CSymbol),Times(CN1,BSymbol,c,d),Times(ASymbol,Sqr(d)))),Times(d,Plus(Times(ASymbol,b,c),Times(a,BSymbol,c),Times(CN1,b,c,CSymbol),Times(CN1,a,ASymbol,d),Times(b,BSymbol,d),Times(a,CSymbol,d)),Tan(Plus(e,Times(f,x)))),Times(b,CSymbol,Plus(Sqr(c),Sqr(d)),Sqr(Tan(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,CSymbol),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),LtQ(n,CN1)))),
IIntegrate(3636,Integrate(Times(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Subtract(Times(b,c),Times(a,d)),Plus(Times(Sqr(c),CSymbol),Times(ASymbol,Sqr(d))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(Sqr(d),f,Plus(n,C1),Plus(Sqr(c),Sqr(d))),CN1)),x)),Dist(Power(Times(d,Plus(Sqr(c),Sqr(d))),CN1),Integrate(Times(Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Simp(Plus(Times(a,d,Subtract(Times(ASymbol,c),Times(c,CSymbol))),Times(b,Plus(Times(Sqr(c),CSymbol),Times(ASymbol,Sqr(d)))),Times(d,Plus(Times(ASymbol,b,c),Times(CN1,b,c,CSymbol),Times(CN1,a,ASymbol,d),Times(a,CSymbol,d)),Tan(Plus(e,Times(f,x)))),Times(b,CSymbol,Plus(Sqr(c),Sqr(d)),Sqr(Tan(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,CSymbol),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),LtQ(n,CN1)))),
IIntegrate(3637,Integrate(Times(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Subtract(Simp(Times(b,CSymbol,Tan(Plus(e,Times(f,x))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(d,f,Plus(n,C2)),CN1)),x),Dist(Power(Times(d,Plus(n,C2)),CN1),Integrate(Times(Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Simp(Subtract(Subtract(Subtract(Times(b,c,CSymbol),Times(a,ASymbol,d,Plus(n,C2))),Times(Subtract(Plus(Times(ASymbol,b),Times(a,BSymbol)),Times(b,CSymbol)),d,Plus(n,C2),Tan(Plus(e,Times(f,x))))),Times(Subtract(Times(a,CSymbol,d,Plus(n,C2)),Times(b,Subtract(Times(c,CSymbol),Times(BSymbol,d,Plus(n,C2))))),Sqr(Tan(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,CSymbol,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),Not(LtQ(n,CN1))))),
IIntegrate(3638,Integrate(Times(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Subtract(Simp(Times(b,CSymbol,Tan(Plus(e,Times(f,x))),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(d,f,Plus(n,C2)),CN1)),x),Dist(Power(Times(d,Plus(n,C2)),CN1),Integrate(Times(Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Simp(Subtract(Subtract(Subtract(Times(b,c,CSymbol),Times(a,ASymbol,d,Plus(n,C2))),Times(Subtract(Times(ASymbol,b),Times(b,CSymbol)),d,Plus(n,C2),Tan(Plus(e,Times(f,x))))),Times(Subtract(Times(a,CSymbol,d,Plus(n,C2)),Times(b,c,CSymbol)),Sqr(Tan(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,CSymbol,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),NeQ(Plus(Sqr(c),Sqr(d)),C0),Not(LtQ(n,CN1))))),
IIntegrate(3639,Integrate(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT),Plus(A_DEFAULT,Times(B_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(Subtract(Plus(Times(a,ASymbol),Times(b,BSymbol)),Times(a,CSymbol)),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(C2,f,m,Subtract(Times(b,c),Times(a,d))),CN1)),x),Dist(Power(Times(C2,a,m,Subtract(Times(b,c),Times(a,d))),CN1),Integrate(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Simp(Plus(Times(b,Subtract(Times(c,Plus(ASymbol,CSymbol),m),Times(BSymbol,d,Plus(n,C1)))),Times(a,Subtract(Plus(Times(BSymbol,c,m),Times(CSymbol,d,Plus(n,C1))),Times(ASymbol,d,Plus(Times(C2,m),n,C1)))),Times(Plus(Times(b,CSymbol,d,Subtract(Subtract(m,n),C1)),Times(ASymbol,b,d,Plus(m,n,C1)),Times(a,Subtract(Times(C2,c,CSymbol,m),Times(BSymbol,d,Plus(m,n,C1))))),Tan(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,CSymbol,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0),Or(LtQ(m,C0),EqQ(Plus(m,n,C1),C0))))),
IIntegrate(3640,Integrate(Times(Power(Plus(a_,Times(b_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),m_),Power(Plus(c_DEFAULT,Times(d_DEFAULT,$($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),n_DEFAULT),Plus(A_DEFAULT,Times(C_DEFAULT,Sqr($($s("§tan"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))))),x_Symbol),
    Condition(Plus(Simp(Times(a,Subtract(ASymbol,CSymbol),Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),m),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),Plus(n,C1)),Power(Times(C2,f,m,Subtract(Times(b,c),Times(a,d))),CN1)),x),Dist(Power(Times(C2,a,m,Subtract(Times(b,c),Times(a,d))),CN1),Integrate(Times(Power(Plus(a,Times(b,Tan(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Plus(c,Times(d,Tan(Plus(e,Times(f,x))))),n),Simp(Plus(Times(b,c,Plus(ASymbol,CSymbol),m),Times(a,Subtract(Times(CSymbol,d,Plus(n,C1)),Times(ASymbol,d,Plus(Times(C2,m),n,C1)))),Times(Plus(Times(b,CSymbol,d,Subtract(Subtract(m,n),C1)),Times(ASymbol,b,d,Plus(m,n,C1)),Times(C2,a,c,CSymbol,m)),Tan(Plus(e,Times(f,x))))),x)),x),x)),And(FreeQ(List(a,b,c,d,e,f,ASymbol,CSymbol,n),x),NeQ(Subtract(Times(b,c),Times(a,d)),C0),EqQ(Plus(Sqr(a),Sqr(b)),C0),Or(LtQ(m,C0),EqQ(Plus(m,n,C1),C0)))))
  );
}