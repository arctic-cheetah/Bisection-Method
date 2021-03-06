package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;

import org.matheclipse.core.interfaces.IAST;
/** 
 * UtilityFunctions rules from the <a href="https://rulebasedintegration.org/">Rubi -
 * rule-based integrator</a>.
 *  
 */
class UtilityFunctions37 { 
  public static IAST RULES = List( 
ISetDelayed(671,NthRoot(u_,n_),
    Power(u,Power(n,CN1))),
ISetDelayed(672,TrigSquare(u_),
    If(SumQ(u),With(List(Set($s("lst"),SplitSum(Function(SplitProduct($rubi("TrigSquareQ"),Slot1)),u))),If(And(Not(AtomQ($s("lst"))),EqQ(Plus(Part($s("lst"),C1,C2),Part($s("lst"),C2)),C0)),If(SameQ(Head(Part(Part($s("lst"),C1,C1),C1)),Sin),Times(Part($s("lst"),C2),Sqr(Cos(Part(Part($s("lst"),C1,C1),C1,C1)))),Times(Part($s("lst"),C2),Sqr(Sin(Part(Part($s("lst"),C1,C1),C1,C1))))),False)),False)),
ISetDelayed(673,RtAux(u_,n_),
    If(PowerQ(u),Power(Part(u,C1),Times(Part(u,C2),Power(n,CN1))),If(ProductQ(u),Module(List($s("lst")),CompoundExpression(Set($s("lst"),SplitProduct(Function(GtQ(Slot1,C0)),u)),If(ListQ($s("lst")),Times(RtAux(Part($s("lst"),C1),n),RtAux(Part($s("lst"),C2),n)),CompoundExpression(Set($s("lst"),SplitProduct(Function(LtQ(Slot1,C0)),u)),If(ListQ($s("lst")),If(EqQ(Part($s("lst"),C1),CN1),With(List(Set(v,Part($s("lst"),C2))),If(And(PowerQ(v),LtQ(Part(v,C2),C0)),Power(RtAux(Negate(Power(Part(v,C1),Negate(Part(v,C2)))),n),CN1),If(ProductQ(v),If(ListQ(SplitProduct($rubi("SumBaseQ"),v)),CompoundExpression(Set($s("lst"),SplitProduct($rubi("AllNegTermQ"),v)),If(ListQ($s("lst")),Times(RtAux(Negate(Part($s("lst"),C1)),n),RtAux(Part($s("lst"),C2),n)),CompoundExpression(Set($s("lst"),SplitProduct($rubi("NegSumBaseQ"),v)),If(ListQ($s("lst")),Times(RtAux(Negate(Part($s("lst"),C1)),n),RtAux(Part($s("lst"),C2),n)),CompoundExpression(Set($s("lst"),SplitProduct($rubi("SomeNegTermQ"),v)),If(ListQ($s("lst")),Times(RtAux(Negate(Part($s("lst"),C1)),n),RtAux(Part($s("lst"),C2),n)),CompoundExpression(Set($s("lst"),SplitProduct($rubi("SumBaseQ"),v)),Times(RtAux(Negate(Part($s("lst"),C1)),n),RtAux(Part($s("lst"),C2),n))))))))),CompoundExpression(Set($s("lst"),SplitProduct($rubi("AtomBaseQ"),v)),If(ListQ($s("lst")),Times(RtAux(Negate(Part($s("lst"),C1)),n),RtAux(Part($s("lst"),C2),n)),Times(RtAux(Negate(First(v)),n),RtAux(Rest(v),n))))),If(OddQ(n),Negate(RtAux(v,n)),NthRoot(u,n))))),Times(RtAux(Negate(Part($s("lst"),C1)),n),RtAux(Negate(Part($s("lst"),C2)),n))),CompoundExpression(Set($s("lst"),SplitProduct($rubi("AllNegTermQ"),u)),If(And(ListQ($s("lst")),ListQ(SplitProduct($rubi("SumBaseQ"),Part($s("lst"),C2)))),Times(RtAux(Negate(Part($s("lst"),C1)),n),RtAux(Negate(Part($s("lst"),C2)),n)),CompoundExpression(Set($s("lst"),SplitProduct($rubi("NegSumBaseQ"),u)),If(And(ListQ($s("lst")),ListQ(SplitProduct($rubi("NegSumBaseQ"),Part($s("lst"),C2)))),Times(RtAux(Negate(Part($s("lst"),C1)),n),RtAux(Negate(Part($s("lst"),C2)),n)),Map(Function(RtAux(Slot1,n)),u)))))))))),With(List(Set(v,TrigSquare(u))),If(Not(AtomQ(v)),RtAux(v,n),If(And(OddQ(n),LtQ(u,C0)),Negate(RtAux(Negate(u),n)),If(ComplexNumberQ(u),With(List(Set(a,Re(u)),Set(b,Im(u))),If(And(Not(And(IntegerQ(a),IntegerQ(b))),IntegerQ(Times(a,Power(Plus(Sqr(a),Sqr(b)),CN1))),IntegerQ(Times(b,Power(Plus(Sqr(a),Sqr(b)),CN1)))),Power(RtAux(Subtract(Times(a,Power(Plus(Sqr(a),Sqr(b)),CN1)),Times(b,Power(Plus(Sqr(a),Sqr(b)),CN1),CI)),n),CN1),NthRoot(u,n))),If(And(OddQ(n),NegQ(u),PosQ(Negate(u))),Negate(RtAux(Negate(u),n)),NthRoot(u,n))))))))),
ISetDelayed(674,AtomBaseQ(u_),
    Or(AtomQ(u),And(PowerQ(u),OddQ(Part(u,C2)),AtomBaseQ(Part(u,C1))))),
ISetDelayed(675,SumBaseQ(u_),
    Or(SumQ(u),And(PowerQ(u),OddQ(Part(u,C2)),SumBaseQ(Part(u,C1))))),
ISetDelayed(676,NegSumBaseQ(u_),
    Or(And(SumQ(u),NegQ(First(u))),And(PowerQ(u),OddQ(Part(u,C2)),NegSumBaseQ(Part(u,C1))))),
ISetDelayed(677,AllNegTermQ(u_),
    If(And(PowerQ(u),OddQ(Part(u,C2))),AllNegTermQ(Part(u,C1)),If(SumQ(u),And(NegQ(First(u)),AllNegTermQ(Rest(u))),NegQ(u)))),
ISetDelayed(678,SomeNegTermQ(u_),
    If(And(PowerQ(u),OddQ(Part(u,C2))),SomeNegTermQ(Part(u,C1)),If(SumQ(u),Or(NegQ(First(u)),SomeNegTermQ(Rest(u))),NegQ(u)))),
ISetDelayed(679,TrigSquareQ(u_),
    And(PowerQ(u),EqQ(Part(u,C2),C2),MemberQ(List(Sin,Cos),Head(Part(u,C1))))),
ISetDelayed(680,SplitProduct($p("func"),u_),
    If(ProductQ(u),If($($s("func"),First(u)),List(First(u),Rest(u)),With(List(Set($s("lst"),SplitProduct($s("func"),Rest(u)))),If(AtomQ($s("lst")),False,List(Part($s("lst"),C1),Times(First(u),Part($s("lst"),C2)))))),If($($s("func"),u),List(u,C1),False))),
ISetDelayed(681,SplitSum($p("func"),u_),
    If(SumQ(u),If(Not(AtomQ($($s("func"),First(u)))),List($($s("func"),First(u)),Rest(u)),With(List(Set($s("lst"),SplitSum($s("func"),Rest(u)))),If(AtomQ($s("lst")),False,List(Part($s("lst"),C1),Plus(First(u),Part($s("lst"),C2)))))),If(Not(AtomQ($($s("func"),u))),List($($s("func"),u),C0),False))),
ISetDelayed(682,IntSum(u_,x_Symbol),
    Plus(Simp(Times(FreeTerms(u,x),x),x),IntTerm(NonfreeTerms(u,x),x))),
ISetDelayed(683,IntTerm(u_,x_Symbol),
    Condition(Map(Function(IntTerm(Slot1,x)),u),SumQ(u))),
ISetDelayed(684,IntTerm(Times(c_DEFAULT,Power(v_,m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,Cancel(v))),If(EqQ(m,CN1),Simp(Times(c,Log(RemoveContent(u,x)),Power(Coeff(u,x,C1),CN1)),x),If(And(EqQ(m,C1),EqQ(c,C1),SumQ(u)),IntSum(u,x),Simp(Times(c,Power(u,Plus(m,C1)),Power(Times(Coeff(u,x,C1),Plus(m,C1)),CN1)),x)))),And(FreeQ(List(c,m),x),LinearQ(v,x)))),
ISetDelayed(685,IntTerm(u_,x_Symbol),
    Dist(FreeFactors(u,x),Integrate(NonfreeFactors(u,x),x),x)),
ISetDelayed(686,RuleName($p("name")),
    CompoundExpression(AppendTo($s("??$rulenamelist"),$s("name")),Null)),
//ISetDelayed(687,FixIntRules(),
//    CompoundExpression(Set(DownValues(Integrate),FixIntRules(DownValues(Integrate))),Null)),
ISetDelayed(688,FixIntRules($p("rulelist")),
    Block(List(Integrate,$rubi("Subst"),$rubi("Simp"),$rubi("Dist")),CompoundExpression(SetAttributes(List($rubi("Simp"),$rubi("Dist"),Integrate,$rubi("Subst")),HoldAll),Map(Function(FixIntRule(Slot1,Part(Slot1,C1,C1,C2,C1))),$s("rulelist")))))
  );
}
