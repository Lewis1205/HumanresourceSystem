/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-11-24 08:33:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>人力资源管理系统</title>\r\n");
      out.write("</head>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/ztree/zTreeStyle.css\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.8.3.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/ztree/jquery.ztree.all-3.5.js\"></script>\r\n");
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("\t<!-- 使用div指定区域 -->\r\n");
      out.write("\t<div data-options=\"region:'north'\" style=\"text-align: center; padding: 2px;\">\r\n");
      out.write("\t\t<span><font size=\"5px\">人力资源管理系统</font></span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div title=\"系统菜单\" data-options=\"region:'west'\" style=\"width: 200px\">\r\n");
      out.write("\t\t<ul id=\"leftmenu\" class=\"ztree\"></ul>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(function(){\r\n");
      out.write("\t\t//当页面加载完成后，动态创建ztree菜单\r\n");
      out.write("\t\tvar setting2 = {\r\n");
      out.write("\t\t\tdata: {\r\n");
      out.write("\t\t\t\tsimpleData: {\r\n");
      out.write("\t\t\t\t\t\t\t\tenable: true//启用简单json数据描述节点数据 \r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\tcallback: {//绑定事件 \r\n");
      out.write("\t\t\t\tonClick: function(a,b,treeNode){\r\n");
      out.write("\t\t\t\t\t//alert(\"点击tab\");\r\n");
      out.write("\t\t\t\t\tvar page = treeNode.page;\r\n");
      out.write("\t\t\t\t\tvar name=treeNode.name;\r\n");
      out.write("\t\t\t\t\talert(name);\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tif(treeNode.pId!=null){//需要打开选项卡\r\n");
      out.write("\t\t\t\t\t\t\t//判断当前选项卡是否已经打开\r\n");
      out.write("\t\t\t\t\t\t\tvar e = $(\"#tt\").tabs(\"exists\",treeNode.name);\r\n");
      out.write("\t\t\t\t\t\t\tif(e){\r\n");
      out.write("\t\t\t\t\t\t\t\t//已经打开\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#tt\").tabs(\"select\",treeNode.name);\r\n");
      out.write("\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#tt\")\r\n");
      out.write("\t\t\t\t\t\t\t\t.tabs(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\"add\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttitle : treeNode.name,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tcontent : '<iframe frameborder=\"0\" width=\"100%\" height=\"100%\" src=\"'+page+'\"></iframe>',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclosable : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ticonCls : 'icon-edit'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t};//设置ztree相关的属性\r\n");
      out.write("\t\t//构造json数据\r\n");
      out.write("\t\tvar zNodes2 = [\r\n");
      out.write("\t\t              {id:'1',pId:'0',name:'系统设置'},//每个json对象对应一个节点数据\r\n");
      out.write("\t\t              {id:'11',pId:'1',name:'机构设置',page:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/WEB-INF/jsp/test.html'},\r\n");
      out.write("\t\t              {id:'12',pId:'1',name:'职位设置'},\r\n");
      out.write("\t\t              {id:'2',pId:'0',name:'人力资源管理'},\r\n");
      out.write("\t\t              {id:'21',pId:'2',name:'员工登记'},\r\n");
      out.write("\t\t              {id:'22',pId:'2',name:'员工复核'},\r\n");
      out.write("\t\t              {id:'23',pId:'2',name:'员工查询'},\r\n");
      out.write("\t\t              {id:'24',pId:'2',name:'档案删除'},\r\n");
      out.write("\t\t              {id:'3',pId:'0',name:'薪酬管理'},\r\n");
      out.write("\t\t              {id:'31',pId:'3',name:'薪酬标准管理'},\r\n");
      out.write("\t\t              {id:'32',pId:'3',name:'薪酬发放管理'}\r\n");
      out.write("\t\t              ];\r\n");
      out.write("\t\t//创建ztree\r\n");
      out.write("\t\t$.fn.zTree.init($(\"#leftmenu\"),setting2,zNodes2);\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</div>           \r\n");
      out.write("<div data-options=\"region:'center'\">\r\n");
      out.write("\t<div id=\"tt\" class=\"easyui-tabs\" data-options=\"fit:true\">\r\n");
      out.write("\t\t<div title=\"面板二\">test2</div>\r\n");
      out.write("\t\t<div title=\"面板三\">test3</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
