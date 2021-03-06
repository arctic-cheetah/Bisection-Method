package org.matheclipse.core.mathcell;

import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.matheclipse.core.basic.Config;
import org.matheclipse.core.basic.ToggleFeature;
import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IStringX;
import org.matheclipse.io.IOInit;
import org.matheclipse.parser.client.FEConfig;
import org.matheclipse.parser.client.SyntaxError;
import org.matheclipse.parser.client.math.MathException;

public abstract class BasePlotExample {
  static {
    Locale.setDefault(Locale.US);
    FEConfig.PARSER_USE_LOWERCASE_SYMBOLS = true;
    ToggleFeature.COMPILE = true;
    Config.JAVA_UNSAFE = true;
    Config.SHORTEN_STRING_LENGTH = 1024;
    Config.USE_VISJS = true;
    Config.FILESYSTEM_ENABLED = true;

    IOInit.init();
  }

  public String exampleFunction() {
    return "Manipulate(ListPlot(Table({Sin(t), Cos(t*a)}, {t, 100})), {a,1,4,1})";
  }

  public void generateHTML() {
    try {
      Config.FILESYSTEM_ENABLED = true;
      ExprEvaluator util = new ExprEvaluator();

      IExpr result = util.eval(exampleFunction());
      if (result.isAST(F.JSFormData, 3)) {
        String js;
        if (result.second().toString().equals("mathcell")) {
          String manipulateStr = ((IAST) result).arg1().toString();
          js = Config.MATHCELL_PAGE;
          js = StringUtils.replace(js, "`1`", manipulateStr);
        } else if (result.second().toString().equals("treeform")) {
          String manipulateStr = ((IAST) result).arg1().toString();
          js = Config.VISJS_PAGE;
          js = StringUtils.replace(js, "`1`", manipulateStr);
          js =
              StringUtils.replace(
                  js,
                  "`2`", //
                  "  var options = {\n"
                      + //
                      "		  edges: {\n"
                      + //
                      "              smooth: {\n"
                      + //
                      "                  type: 'cubicBezier',\n"
                      + //
                      "                  forceDirection:  'vertical',\n"
                      + //
                      "                  roundness: 0.4\n"
                      + //
                      "              }\n"
                      + //
                      "          },\n"
                      + //
                      "          layout: {\n"
                      + //
                      "              hierarchical: {\n"
                      + //
                      "                  direction: \"UD\"\n"
                      + //
                      "              }\n"
                      + //
                      "          },\n"
                      + //
                      "          nodes: {\n"
                      + "            shape: 'box'\n"
                      + "          },\n"
                      + //
                      "          physics:false\n"
                      + //
                      "      }; ");
        } else if (result.second().toString().equals("traceform")) {
          String jsStr = ((IAST) result).arg1().toString();
          js = Config.TRACEFORM_PAGE;
          js = StringUtils.replace(js, "`1`", jsStr);
        } else if (result.second().toString().equals("plotly")) {
          String manipulateStr = ((IAST) result).arg1().toString();
          js = Config.PLOTLY_PAGE;
          js = StringUtils.replace(js, "`1`", manipulateStr);
        } else {
          String manipulateStr = ((IAST) result).arg1().toString();
          js = Config.JSXGRAPH_PAGE;
          js = StringUtils.replace(js, "`1`", manipulateStr);
        }
        System.out.println(js);
        F.openHTMLOnDesktop(js);
      } else {
        if (result.isString()) {
          IStringX str = (IStringX) result;
          if (str.getMimeType() == IStringX.TEXT_HTML) {
            String htmlSnippet = str.toString();
            String htmlPage = Config.HTML_PAGE;
            htmlPage = StringUtils.replace(htmlPage, "`1`", htmlSnippet);
            System.out.println(htmlPage);
            F.openHTMLOnDesktop(htmlPage);
            return;
          }
        }
        System.out.println(result.toString());
      }
    } catch (SyntaxError e) {
      // catch Symja parser errors here
      System.out.println(e.getMessage());
    } catch (MathException me) {
      // catch Symja math errors here
      System.out.println(me.getMessage());
      me.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    } catch (final StackOverflowError soe) {
      System.out.println(soe.getMessage());
    } catch (final OutOfMemoryError oome) {
      System.out.println(oome.getMessage());
    }
  }
}
