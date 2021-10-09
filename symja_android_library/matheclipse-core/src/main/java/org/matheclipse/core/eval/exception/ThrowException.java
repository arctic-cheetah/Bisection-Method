package org.matheclipse.core.eval.exception;

import org.matheclipse.core.expression.S;
import org.matheclipse.core.interfaces.IExpr;

/** Exception for the <code>Throw[]</code> function. */
public class ThrowException extends FlowControlException {

  public static final ThrowException THROW_FALSE = new ThrowException(S.False);

  public static final ThrowException THROW_TRUE = new ThrowException(S.True);
  /** */
  private static final long serialVersionUID = -8468658696375569705L;

  private final IExpr value;
  private final IExpr tag;

  public ThrowException() {
    this(null);
  }

  public ThrowException(final IExpr val) {
    this(val, S.None);
  }

  public ThrowException(final IExpr val, final IExpr tag) {
    super();
    this.value = val;
    this.tag = tag;
  }

  public IExpr getValue() {
    return value;
  }

  public IExpr getTag() {
    return tag;
  }
}
