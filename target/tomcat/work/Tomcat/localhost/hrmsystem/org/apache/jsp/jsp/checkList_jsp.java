/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-12-04 10:59:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>员工复核</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/ztree/zTreeStyle.css\"\r\n");
      out.write("\ttype=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/demo.css\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.8.3.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/ztree/jquery.ztree.all-3.5.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<p>当前有×例档案待复核</p>\r\n");
      out.write("\t<table id=\"tt\" class=\"easyui-datagrid\" style=\"width: 1000px\"\r\n");
      out.write("\t\turl=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/staff/unchecked\"\r\n");
      out.write("\t\tsingleSelect=\"true\" roownumbers=\"true\" title=\"待复核名单\" pagination=\"true\">\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(\"#tt\")\r\n");
      out.write("\t\t\t\t.datagrid(\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\tcolumns : [ [\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfield : 'num',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth : '120',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talign : 'center',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : '档案编号'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfield : 'name',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth : '120',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talign : 'center',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : '姓名'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfield : 'gender',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth : '120',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talign : 'center',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : '性别'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfield : 'principleDept',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth : '120',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talign : 'center',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : '一级机构'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfield : 'seniorDept',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth : '120',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talign : 'center',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : '二级机构'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfield : 'juniorDept',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth : '120',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talign : 'center',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : '三级机构'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfield : 'staffId',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\twidth : '120',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talign : 'center',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : '复核',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tformatter : function(value, row, index) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t//alert(value);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t//alert(row)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t//addTab('复核明细' ,'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/staffInfo.jsp'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tif(value!=undefined){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar s =`<a id=\"check\" href=\"javascript:void(0)\" onclick=\"getSelected()\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t class=\"easyui-linkbutton\">复核</a>`;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\treturn s;\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t} ] ]\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tfunction getSelected(){\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\tvar row = $('#tt').datagrid('getSelected');\r\n");
      out.write("\t\t\t\t\t\t\tif (row){\r\n");
      out.write("\t\t\t\t\t\t\t\tvar staffId=row.staffId;\r\n");
      out.write("\t\t\t\t\t\t\t\taddTab('复核明细' ,'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("',staffId);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\tfunction addTab(title,url,staffId) {\r\n");
      out.write("\t\t\t var parent$ = self.parent.$;\r\n");
      out.write("\t\t\t//alert(staffId);\r\n");
      out.write("\t\t\tif (parent$('#tt').tabs('exists', title)) {\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tparent$('#tt').tabs('select', title);\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tvar url=url+\"/staff/\"+staffId+\"/staffInfo\";\r\n");
      out.write("\t\t\t\t//alert(url);\r\n");
      out.write("\t\t\t\tvar content = '<iframe frameborder=\"0\" width=\"100%\" height=\"100%\" src=\"'\r\n");
      out.write("\t\t\t\t\t+ url\r\n");
      out.write("\t\t\t\t\t+ '\"></iframe>';\r\n");
      out.write("\t\t\t\t\t\tparent$('#tt').tabs('add', {\r\n");
      out.write("\t\t\t\t\ttitle : title,\r\n");
      out.write("\t\t\t\t\tcontent : content,\t\r\n");
      out.write("\t\t\t\t\tclosable : true\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
