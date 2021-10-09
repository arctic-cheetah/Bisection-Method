package org.matheclipse.core.combinatoric;

import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;

/** Abstract step visitor for <code>IAST</code>s. */
public abstract class AbstractListStepVisitor<T> implements IStepVisitor {
  protected final IAST list;
  protected IExpr[] array;

  public AbstractListStepVisitor(IAST ast) {
    this.list = ast;
    toIntArray(ast);
  }

  /**
   * Convert the <code>sortedList</code> to an <code>int[]</code> array. Equal elements get the same
   * index in the resulting <code>int[]</code> array.
   *
   * @param sortedList
   * @return
   */
  private final void toIntArray(IAST sortedList) {
    array = new IExpr[sortedList.argSize()];
    int index = 0;
    for (int i = 1; i < sortedList.size(); i++) {
      array[index++] = sortedList.get(i);
    }
  }

  /** {@inheritDoc} */
  @Override
  public boolean visit(int[][] result) {
    return true;
  }

  /** {@inheritDoc} */
  @Override
  public boolean visit(int[] result) {
    return true;
  }

  /** {@inheritDoc} */
  @Override
  public int[] getMultisetArray() {
    int[] result = new int[array.length];
    int counter = 0;
    for (int i = 0; i < result.length; i++) {
      result[i] = counter++;
    }
    return result;
  }
}
