package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface BesselKRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 0, 3 };

  final public static IAST RULES = List(
    IInit(BesselK, SIZES),
    // BesselK(Undefined,y_):=Undefined
    ISetDelayed(BesselK(Undefined,y_),
      Undefined),
    // BesselK(x_,Undefined):=Undefined
    ISetDelayed(BesselK(x_,Undefined),
      Undefined),
    // BesselK(-1/2,z_):=Sqrt(2/Pi)/(E^z*Sqrt(z))
    ISetDelayed(BesselK(CN1D2,z_),
      Times(Sqrt(Times(C2,Power(Pi,CN1))),Power(Times(Exp(z),Sqrt(z)),CN1))),
    // BesselK(1/2,z_):=Sqrt(2/Pi)/(E^z*Sqrt(z))
    ISetDelayed(BesselK(C1D2,z_),
      Times(Sqrt(Times(C2,Power(Pi,CN1))),Power(Times(Exp(z),Sqrt(z)),CN1)))
  );
}
