/*
 * $Id$
 */

package edu.jas.application;
package org.matheclipse.core.examples;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;



import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.parser.client.SyntaxError;
import org.matheclipse.parser.client.math.MathException;


import edu.jas.kern.ComputerThreads;


/**
 * Examples for application usage.
 * @author Christoph Zengler
 * @author Heinz Kredel
 */

public class Bisection {


    /**
     * main.
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            example1();
        }
        ComputerThreads.terminate();
    }


    /**
     * example1. cyclic n-th roots polynomial systems.
     */
    public static void example1() {
        
    }


}
