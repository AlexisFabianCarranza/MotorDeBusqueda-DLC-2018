package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Motor de Busqueda</title>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"http://www.orientacionandujar.es/wp-content/uploads/2013/10/gato-negro-silueta.png\">\n");
      out.write("        <link type=\"text/css\" href=\"StyleSheet.css\" rel=\"stylesheet\"/> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("\t  <ul>\n");
      out.write("\t\t<li><a href=\"#\">Agregar Documentos</a></li>\n");
      out.write("\t\t<li><a href=\"#\">Agregar Carpeta con Documentos</a></li>\n");
      out.write("\t\t<li><a href=\"#\">Informacion</a></li>\n");
      out.write("\t  </ul>\n");
      out.write("\t</nav>\n");
      out.write("        <h1 class=\"title\">Motor de Busqueda</h1>\n");
      out.write("        <form action=\"buscar\" method=\"post\">\n");
      out.write("            <input type=\"text\" id=\"buscar\" name=\"busqueda\" placeholder=\"Ingrese su busqueda\">\n");
      out.write("            <input type=\"submit\" id=\"entrar\" name=\"entrar\" value=\"Buscar\">\n");
      out.write("        </form>\n");
      out.write("        <form method=\"POST\" action=\"upload\" enctype=\"multipart/form-data\" >\n");
      out.write("            File:\n");
      out.write("            <input type=\"file\" name=\"file\" id=\"file\" /> <br/>\n");
      out.write("            Destination:\n");
      out.write("            <input type=\"text\" value=\"/tmp\" name=\"destination\"/>\n");
      out.write("            </br>\n");
      out.write("            <input type=\"submit\" value=\"Upload\" name=\"upload\" id=\"upload\" />\n");
      out.write("        </form>\n");
      out.write("        <footer>\n");
      out.write("            <link type=\"text/css\" href=\"StyleSheet.css\" rel=\"stylesheet\"/>\n");
      out.write("            Copyright &copy; DLC - UTN 2018\n");
      out.write("        </footer>\n");
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
