/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-12-11 02:54:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class salaryDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>薪酬登记明细页</title>\r\n");
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
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.8.3.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<table id=\"detailTb\" border=\"1\" style=\"text-align: center;\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>档案编号</td>\r\n");
      out.write("\t\t\t<td>名字</td>\r\n");
      out.write("\t\t\t<td>薪酬id</td>\r\n");
      out.write("\t\t\t<td colspan=\"16\" style=\"text-align: center;\">具体薪酬项</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<a class=\"easyui-linkbutton\" href=\"javascript:void(0)\"  onclick=\"postDetails()\">提交</a>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  var json;\r\n");
      out.write("\t window.onload = function() {\r\n");
      out.write("\t\tvar s=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${staffDetails}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";//json对象\r\n");
      out.write("\t\tconsole.log(s);\r\n");
      out.write("\t\tjson=s;\r\n");
      out.write("\t\tfor(x in s){\r\n");
      out.write("\t\t\tvar a='<tr><td>'+ s[x].num +'</td>'\r\n");
      out.write("\t\t\t+'<td>'+s[x].name+'</td>'\r\n");
      out.write("\t\t\t+'<td>'+s[x].standardId+'</td>';\r\n");
      out.write("\t\t\tconsole.log(s[x].details);\r\n");
      out.write("\t\t\tvar t='';\t\t \r\n");
      out.write("\t\t\t for(var i=0;i<s[x].details.length;i++){\r\n");
      out.write("\t\t\t\t t='<td>'+s[x].details[i].item+'</td>'\r\n");
      out.write("\t\t\t\t\t+'<td>'+s[x].details[i].salary+'</td>'+t\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t t=t+'<td><input class=\"easyui-validatebox\"  placeholder=\"请输入奖励金额\" id=\"bonus'+s[x].num+'\" type=\"text\"></td>'\r\n");
      out.write("\t\t\t +'<td><input class=\"easyui-validatebox\"   placeholder=\"请输入应扣金额\" id=\"reduction'+s[x].num+'\" type=\"text\"></td>'\r\n");
      out.write("\t\t\t$(\"#detailTb\").append(a+t+'</tr>');\t\t\t\t\t\t\r\n");
      out.write("\t\t}\t\r\n");
      out.write("\t} \r\n");
      out.write("\t function postDetails(){\r\n");
      out.write("\t\t console.log(json+'=====');\r\n");
      out.write("\t\t var requestJson=[];\r\n");
      out.write("\t\t for(x in json){\r\n");
      out.write("\t\t\t var bounusId='bonus'+json[x].num;\r\n");
      out.write("\t\t\t var bonus=$(\"#\"+bounusId+\"\").val(); \r\n");
      out.write("\t\t\t var reductionId='reduction'+json[x].num;\r\n");
      out.write("\t\t\t var reduction=$(\"#\"+reductionId+\"\").val();\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t var num=json[x].num;\r\n");
      out.write("\t\t\t var name=json[x].name;\r\n");
      out.write("\t\t\t var standardId=json[x].standardId;\r\n");
      out.write("\t\t\t var staffId=json[x].staffId;\r\n");
      out.write("\t\t\t //alert(bonus);\r\n");
      out.write("\t\t\t //alert(reduction);\r\n");
      out.write("\t\t\t /* alert(num);\r\n");
      out.write("\t\t\t alert(name);\r\n");
      out.write("\t\t\t alert(standardId); */\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t var p={};\r\n");
      out.write("\t\t\t p.num=num;\r\n");
      out.write("\t\t\t p.staffId=staffId;\r\n");
      out.write("\t\t\t p.standardId=standardId;\r\n");
      out.write("\t\t\t p.bonus=bonus;\r\n");
      out.write("\t\t\t p.reduction=reduction;\r\n");
      out.write("\t\t\t requestJson.push(p);\r\n");
      out.write("\t\t }\t\t \r\n");
      out.write("\t\t console.log(requestJson);\r\n");
      out.write("\t\t var param=JSON.stringify(requestJson);\r\n");
      out.write("\t\t var url='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/record/add';\r\n");
      out.write("\t\t $.ajax({\r\n");
      out.write("\t\t\t url:url,\r\n");
      out.write("\t\t\t type:'POST',\r\n");
      out.write("\t\t\t contentType:'application/json;charset=utf-8',\r\n");
      out.write("\t\t\tdata:param,\r\n");
      out.write("\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\t//alert(result);\r\n");
      out.write("\t\t\t\tif(result.msg==\"success\"){\r\n");
      out.write("\t\t\t\t\t$.messager.alert(\"提示信息\",\"提交成功\",\"info\");\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$.messager.alert(\"提示信息\",\"提交失败\",\"error\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\t \r\n");
      out.write("\t\t })\r\n");
      out.write("\t }\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
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
