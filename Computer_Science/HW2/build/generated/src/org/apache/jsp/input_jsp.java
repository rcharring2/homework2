package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class input_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/includes/header.html");
    _jspx_dependants.add("/includes/footer.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Copyright Ryan Harrington, Zack Layne 10/20/015-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Styles/hw2.css\">\n");
      out.write("        <title>CSC330 Homework 2</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <main>\n");
      out.write("            <h1>Future Value Calculator</h1>\n");
      out.write("            <p><i>Please use positive numbers only</i></p>\n");
      out.write("                <form action=\"calculate\" method=\"post\">\n");
      out.write("                    <input type=\"hidden\" name=\"action\" value=\"calculate\">\n");
      out.write("                    <div class=\"letterDiv\"><label>Investment Amount: </label></div>\n");
      out.write("                    <div class=\"numDiv\"><input type=\"text\" pattern=\"^[+]?([.]\\d+|\\d+([.]\\d+)?)$\" name=\"investment\" autofocus required></div>\n");
      out.write("                    <div class=\"letterDiv\"><label>Yearly Interest Rate: </label></div>\n");
      out.write("                    <div class=\"numDiv\"><input type=\"text\" pattern=\"^[+]?([.]\\d+|\\d+([.]\\d+)?)$\" name=\"interestRate\"  placeholder=\"ex: '5' is 5%\" required></div>\n");
      out.write("                    <div class=\"letterDiv\"><label>Number of Years: </label></div>\n");
      out.write("                    <div class=\"numDiv\"><input type=\"number\" min=\"0\" name=\"numberYears\"  placeholder=\"integer number of years\" required></div>\n");
      out.write("                    <div class=\"letterDiv\"><label>&nbsp;</label></div>\n");
      out.write("                    <div class=\"numDiv\"><input  type=\"submit\" name=\"calculate\"></div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </main>\n");
      out.write("        ");
      out.write("\n");
      out.write("<!-- Copyright Ryan Harrington, Zack Layne 10/20/2015-->\n");
      out.write("        <footer>&copy; 2015, Ryan Harrington and Zack Layne</footer>\n");
      out.write("  ");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
