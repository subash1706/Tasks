/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.14
 * Generated at: 2019-10-21 12:29:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LicenseDownload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/MainSourceandrelatedfiles/coreFiles/web/app_v16_web/WEB-INF/lib/struts-taglib-1.3.10.jar!/META-INF/tld/struts-html.tld", Long.valueOf(1227898810000L));
    _jspx_dependants.put("jar:file:/D:/MainSourceandrelatedfiles/coreFiles/web/app_v16_web/WEB-INF/lib/struts-taglib-1.3.10.jar!/META-INF/tld/struts-bean.tld", Long.valueOf(1227898810000L));
    _jspx_dependants.put("/WEB-INF/lib/struts-taglib-1.3.10.jar", Long.valueOf(1571220553491L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>License Registration</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/cs-ui.css\" />\r\n");
      out.write("<link rel=\"icon\" href=\"../images/csbase/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("<!-- <link href=\"../css/jquery/messi.css\" rel=\"stylesheet\" type=\"text/css\" /> -->\r\n");
      out.write("<!-- CSS to style the file input field as button and adjust the Bootstrap progress bars -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/jquery/jquery-fileupload.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/jquery/jquery-fileupload-ui.css\">\r\n");
      out.write("<!-- CSS adjustments for browsers with JavaScript disabled -->\r\n");
      out.write("<noscript>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/jquery.fileupload-noscript.css\">\r\n");
      out.write("</noscript>\r\n");
      out.write("<noscript>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/jquery.fileupload-ui-noscript.css\">\r\n");
      out.write("</noscript>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<!--header-->\r\n");
      out.write("<header class=\"clearfix\">\r\n");
      out.write("<div class=\"cs-logo cs-pull-left\">\r\n");
      out.write("\t<a href=\"#\" class=\"cs-show\"> <img src=\"../images/csbase/logo.png\"\r\n");
      out.write("\t\talt=\"appLOAD\" />\r\n");
      out.write("\t</a>\r\n");
      out.write("</div>\r\n");
      out.write("</header>\r\n");
      out.write("<!--header-->\r\n");
      out.write("\r\n");
      out.write("<footer class=\"cs-pf cs-tc cs-tline\" style=\"text-indent: 0px;\">\r\n");
      out.write("<p lang=\"en\">Copyrights 2016 All rights reserved by Chain-sys\r\n");
      out.write("\tCorporation</p>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<div class=\"bar\" style=\"width: 0%;\"></div>\r\n");
      out.write("\t\t<div class=\"bar\" style=\"width: 0%;\"></div>\r\n");
      out.write("\t\t<div class=\"bar\" style=\"width: 0%;\"></div>\r\n");
      out.write("\r\n");
      out.write("\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/appplatform/LicenseRegistrationForm.echn?action=download\"\r\n");
      out.write("\t\t\tname=\"licenseRegistrationForm\" id=\"licenseRegistrationForm\"\r\n");
      out.write("\t\t\tmethod=\"post\">\r\n");
      out.write("\t\t\t<legend>License Download</legend>\r\n");
      out.write("\t\t\tLicense is Invalid. Please download the license file by clicking\r\n");
      out.write("\t\t\tDownload button and Send it to the Vendor.\r\n");
      out.write("\t\t\t<div class=\"bar\" style=\"width: 0%;\"></div>\r\n");
      out.write("\t\t\t<input type=\"submit\" title=\"Download\"\r\n");
      out.write("\t\t\t\tclass=\"cs-btn cs-btn-primary cs-tooltip-bottom\" value=\"Download\" />\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
