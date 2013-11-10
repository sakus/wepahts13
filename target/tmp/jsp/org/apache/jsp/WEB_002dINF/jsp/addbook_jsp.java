package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addbook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_value_path_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_value_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_method_commandName_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_path_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_path_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_errors_path_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_form_input_value_path_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_value_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_method_commandName_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_path_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_path_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_errors_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_form_input_value_path_name_nobody.release();
    _jspx_tagPool_form_input_value_path_nobody.release();
    _jspx_tagPool_form_form_method_commandName_action.release();
    _jspx_tagPool_form_input_path_name_id_nobody.release();
    _jspx_tagPool_form_input_path_name_nobody.release();
    _jspx_tagPool_form_errors_path_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>WepaHT s13 Saku S&auml;is&auml;</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/app/books/\">back to book listing</a>\n");
      out.write("        <br />\n");
      out.write("        \n");
      out.write("        <h1>add a book</h1>\n");
      out.write("        \n");
      out.write("        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg != ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            <p>\n");
      out.write("                <pre style=\"color:white;background-color:#333\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</pre>\n");
      out.write("            </p>\n");
      out.write("        </c:if>\n");
      out.write("    \n");
      out.write("        <p>\n");
      out.write("            You can either fetch a book from open library by the books ISBN or type in all the required information manually.\n");
      out.write("        </p>\n");
      out.write("        <br />\n");
      out.write("        \n");
      out.write("        <h3>open library</h3>\n");
      out.write("        <p>\n");
      out.write("            ");
      if (_jspx_meth_form_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </p>\n");
      out.write("        <br />\n");
      out.write("        \n");
      out.write("        <h3>manual feeding</h3>\n");
      out.write("        <p>\n");
      out.write("            <strong>* = required</strong>\n");
      out.write("        </p>\n");
      out.write("        \n");
      out.write("        <table>\n");
      out.write("            ");
      //  form:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_1 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_method_commandName_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_form_form_1.setPageContext(_jspx_page_context);
      _jspx_th_form_form_1.setParent(null);
      _jspx_th_form_form_1.setCommandName("book");
      _jspx_th_form_form_1.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}/app/addbook", java.lang.String.class, (PageContext)_jspx_page_context, null));
      _jspx_th_form_form_1.setMethod("POST");
      int[] _jspx_push_body_count_form_form_1 = new int[] { 0 };
      try {
        int _jspx_eval_form_form_1 = _jspx_th_form_form_1.doStartTag();
        if (_jspx_eval_form_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                <th cellspanning=\"2\">the basics</th>\n");
            out.write("                <tr>\n");
            out.write("                    <td>title:</td><td>");
            if (_jspx_meth_form_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_1, _jspx_page_context, _jspx_push_body_count_form_form_1))
              return;
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_0.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
            _jspx_th_form_errors_0.setPath("bookTitle");
            int[] _jspx_push_body_count_form_errors_0 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_0 = _jspx_th_form_errors_0.doStartTag();
              if (_jspx_th_form_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_0.doFinally();
              _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_0);
            }
            out.write(" <strong>*</strong></td>\n");
            out.write("                </tr>\n");
            out.write("                <tr>\n");
            out.write("                    <td>isbn:</td><td>");
            if (_jspx_meth_form_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_1, _jspx_page_context, _jspx_push_body_count_form_form_1))
              return;
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_1.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
            _jspx_th_form_errors_1.setPath("bookISBN");
            int[] _jspx_push_body_count_form_errors_1 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_1 = _jspx_th_form_errors_1.doStartTag();
              if (_jspx_th_form_errors_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_1.doFinally();
              _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_1);
            }
            out.write(" <strong>*</strong></td>\n");
            out.write("                </tr>\n");
            out.write("                <tr>\n");
            out.write("                    <td>published:</td><td>");
            if (_jspx_meth_form_input_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_1, _jspx_page_context, _jspx_push_body_count_form_form_1))
              return;
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_2.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
            _jspx_th_form_errors_2.setPath("bookPublishingYear");
            int[] _jspx_push_body_count_form_errors_2 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_2 = _jspx_th_form_errors_2.doStartTag();
              if (_jspx_th_form_errors_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_2.doFinally();
              _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_2);
            }
            out.write(" <strong>*</strong></td>\n");
            out.write("                </tr>\n");
            out.write("                \n");
            out.write("                <tr>\n");
            out.write("                    <td>publisher 1:</td><td>");
            if (_jspx_meth_form_input_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_1, _jspx_page_context, _jspx_push_body_count_form_form_1))
              return;
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_3 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_3.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
            _jspx_th_form_errors_3.setPath("bookPublisher1");
            int[] _jspx_push_body_count_form_errors_3 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_3 = _jspx_th_form_errors_3.doStartTag();
              if (_jspx_th_form_errors_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_3[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_3.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_3.doFinally();
              _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_3);
            }
            out.write(" <strong>*</strong></td>\n");
            out.write("                </tr>\n");
            out.write("                <tr>\n");
            out.write("                    <td>publisher 2:</td><td>");
            if (_jspx_meth_form_input_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_1, _jspx_page_context, _jspx_push_body_count_form_form_1))
              return;
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_4 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_4.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
            _jspx_th_form_errors_4.setPath("bookPublisher2");
            int[] _jspx_push_body_count_form_errors_4 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_4 = _jspx_th_form_errors_4.doStartTag();
              if (_jspx_th_form_errors_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_4[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_4.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_4.doFinally();
              _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_4);
            }
            out.write(" </td>\n");
            out.write("                </tr>\n");
            out.write("                \n");
            out.write("                <th cellspanning=\"2\"><br />authors</th>\n");
            out.write("                <tr>\n");
            out.write("                    <td>name:</td><td>");
            if (_jspx_meth_form_input_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_1, _jspx_page_context, _jspx_push_body_count_form_form_1))
              return;
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_5 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_5.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
            _jspx_th_form_errors_5.setPath("bookAuthor1");
            int[] _jspx_push_body_count_form_errors_5 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_5 = _jspx_th_form_errors_5.doStartTag();
              if (_jspx_th_form_errors_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_5[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_5.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_5.doFinally();
              _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_5);
            }
            out.write(" <strong>*</strong></td>\n");
            out.write("                </tr>\n");
            out.write("                <tr>\n");
            out.write("                    <td>name:</td><td>");
            if (_jspx_meth_form_input_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_1, _jspx_page_context, _jspx_push_body_count_form_form_1))
              return;
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_6 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_6.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
            _jspx_th_form_errors_6.setPath("bookAuthor2");
            int[] _jspx_push_body_count_form_errors_6 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_6 = _jspx_th_form_errors_6.doStartTag();
              if (_jspx_th_form_errors_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_6[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_6.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_6.doFinally();
              _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_6);
            }
            out.write("</td>\n");
            out.write("                </tr>\n");
            out.write("                <tr>\n");
            out.write("                    <td>name:</td><td>");
            if (_jspx_meth_form_input_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_1, _jspx_page_context, _jspx_push_body_count_form_form_1))
              return;
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_7 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_7.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
            _jspx_th_form_errors_7.setPath("bookAuthor3");
            int[] _jspx_push_body_count_form_errors_7 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_7 = _jspx_th_form_errors_7.doStartTag();
              if (_jspx_th_form_errors_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_7[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_7.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_7.doFinally();
              _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_7);
            }
            out.write("</td>\n");
            out.write("                </tr>\n");
            out.write("                <tr>\n");
            out.write("                    <td>name:</td><td>");
            if (_jspx_meth_form_input_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_1, _jspx_page_context, _jspx_push_body_count_form_form_1))
              return;
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_8 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_8.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
            _jspx_th_form_errors_8.setPath("bookAuthor4");
            int[] _jspx_push_body_count_form_errors_8 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_8 = _jspx_th_form_errors_8.doStartTag();
              if (_jspx_th_form_errors_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_8[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_8.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_8.doFinally();
              _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_8);
            }
            out.write("</td>\n");
            out.write("                </tr>\n");
            out.write("                <tr>\n");
            out.write("                    <td>name:</td><td>");
            if (_jspx_meth_form_input_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_1, _jspx_page_context, _jspx_push_body_count_form_form_1))
              return;
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_9 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_9.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
            _jspx_th_form_errors_9.setPath("bookAuthor5");
            int[] _jspx_push_body_count_form_errors_9 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_9 = _jspx_th_form_errors_9.doStartTag();
              if (_jspx_th_form_errors_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_9[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_9.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_9.doFinally();
              _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_9);
            }
            out.write("</td>\n");
            out.write("                </tr>\n");
            out.write("                <th cellspanning=\"2\"><br />cover images (URL)</th>\n");
            out.write("                <tr>\n");
            out.write("                    <td>thumbnail:</td><td>");
            if (_jspx_meth_form_input_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_1, _jspx_page_context, _jspx_push_body_count_form_form_1))
              return;
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_10 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_10.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
            _jspx_th_form_errors_10.setPath("bookCoverThumbnailURL");
            int[] _jspx_push_body_count_form_errors_10 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_10 = _jspx_th_form_errors_10.doStartTag();
              if (_jspx_th_form_errors_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_10[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_10.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_10.doFinally();
              _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_10);
            }
            out.write("</td>\n");
            out.write("                </tr>\n");
            out.write("                <tr>\n");
            out.write("                    <td>large cover:</td><td>");
            if (_jspx_meth_form_input_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_1, _jspx_page_context, _jspx_push_body_count_form_form_1))
              return;
            //  form:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_11 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_form_errors_11.setPageContext(_jspx_page_context);
            _jspx_th_form_errors_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
            _jspx_th_form_errors_11.setPath("bookCoverFullURL");
            int[] _jspx_push_body_count_form_errors_11 = new int[] { 0 };
            try {
              int _jspx_eval_form_errors_11 = _jspx_th_form_errors_11.doStartTag();
              if (_jspx_th_form_errors_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_form_errors_11[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_form_errors_11.doCatch(_jspx_exception);
            } finally {
              _jspx_th_form_errors_11.doFinally();
              _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_11);
            }
            out.write("</td>\n");
            out.write("                </tr>\n");
            out.write("\n");
            out.write("                <tr>\n");
            out.write("                    <td><br /><input type=\"submit\" value=\"add book\" name=\"addBook\"></td>\n");
            out.write("                </tr>\n");
            out.write("            ");
            int evalDoAfterBody = _jspx_th_form_form_1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_form_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_form_form_1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_form_form_1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_form_form_1.doFinally();
        _jspx_tagPool_form_form_method_commandName_action.reuse(_jspx_th_form_form_1);
      }
      out.write("\n");
      out.write("        </table>\n");
      out.write("                \n");
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

  private boolean _jspx_meth_form_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_method_commandName_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_form_0.setPageContext(_jspx_page_context);
    _jspx_th_form_form_0.setParent(null);
    _jspx_th_form_form_0.setCommandName("book");
    _jspx_th_form_form_0.setAction((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}/app/populate", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_form_form_0.setMethod("POST");
    int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
      if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                ISBN: ");
          if (_jspx_meth_form_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write(" <input type=\"submit\" value=\"fetch from open library\">\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_form_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_form_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_form_0.doFinally();
      _jspx_tagPool_form_form_method_commandName_action.reuse(_jspx_th_form_form_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_name_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_0.setPageContext(_jspx_page_context);
    _jspx_th_form_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_0.setPath("bookISBN");
    _jspx_th_form_input_0.setDynamicAttribute(null, "name", new String("bookISBNauto"));
    int[] _jspx_push_body_count_form_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_0 = _jspx_th_form_input_0.doStartTag();
      if (_jspx_th_form_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_0.doFinally();
      _jspx_tagPool_form_input_path_name_nobody.reuse(_jspx_th_form_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_name_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_1.setPageContext(_jspx_page_context);
    _jspx_th_form_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
    _jspx_th_form_input_1.setPath("bookTitle");
    _jspx_th_form_input_1.setDynamicAttribute(null, "name", new String("bookTitle"));
    int[] _jspx_push_body_count_form_input_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_1 = _jspx_th_form_input_1.doStartTag();
      if (_jspx_th_form_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_1.doFinally();
      _jspx_tagPool_form_input_path_name_nobody.reuse(_jspx_th_form_input_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_name_id_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_2.setPageContext(_jspx_page_context);
    _jspx_th_form_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
    _jspx_th_form_input_2.setPath("bookISBN");
    _jspx_th_form_input_2.setDynamicAttribute(null, "name", new String("bookISBN2"));
    _jspx_th_form_input_2.setId("bookISBNmanual");
    int[] _jspx_push_body_count_form_input_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_2 = _jspx_th_form_input_2.doStartTag();
      if (_jspx_th_form_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_2.doFinally();
      _jspx_tagPool_form_input_path_name_id_nobody.reuse(_jspx_th_form_input_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_3 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_name_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_3.setPageContext(_jspx_page_context);
    _jspx_th_form_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
    _jspx_th_form_input_3.setPath("bookPublishingYear");
    _jspx_th_form_input_3.setDynamicAttribute(null, "name", new String("bookPublishingYear"));
    int[] _jspx_push_body_count_form_input_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_3 = _jspx_th_form_input_3.doStartTag();
      if (_jspx_th_form_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_3.doFinally();
      _jspx_tagPool_form_input_path_name_nobody.reuse(_jspx_th_form_input_3);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_4(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_4 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_value_path_name_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_4.setPageContext(_jspx_page_context);
    _jspx_th_form_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
    _jspx_th_form_input_4.setPath("bookPublisher1");
    _jspx_th_form_input_4.setDynamicAttribute(null, "name", new String("bookPublisher1"));
    _jspx_th_form_input_4.setDynamicAttribute(null, "value", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.bookPublisher1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_form_input_4 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_4 = _jspx_th_form_input_4.doStartTag();
      if (_jspx_th_form_input_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_4.doFinally();
      _jspx_tagPool_form_input_value_path_name_nobody.reuse(_jspx_th_form_input_4);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_5(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_5 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_value_path_name_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_5.setPageContext(_jspx_page_context);
    _jspx_th_form_input_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
    _jspx_th_form_input_5.setPath("bookPublisher2");
    _jspx_th_form_input_5.setDynamicAttribute(null, "name", new String("bookPublisher2"));
    _jspx_th_form_input_5.setDynamicAttribute(null, "value", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book.bookPublisher2}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_form_input_5 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_5 = _jspx_th_form_input_5.doStartTag();
      if (_jspx_th_form_input_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_5.doFinally();
      _jspx_tagPool_form_input_value_path_name_nobody.reuse(_jspx_th_form_input_5);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_6(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_6 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_name_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_6.setPageContext(_jspx_page_context);
    _jspx_th_form_input_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
    _jspx_th_form_input_6.setPath("bookAuthor1");
    _jspx_th_form_input_6.setDynamicAttribute(null, "name", new String("bookAuthor1"));
    int[] _jspx_push_body_count_form_input_6 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_6 = _jspx_th_form_input_6.doStartTag();
      if (_jspx_th_form_input_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_6.doFinally();
      _jspx_tagPool_form_input_path_name_nobody.reuse(_jspx_th_form_input_6);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_7(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_7 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_name_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_7.setPageContext(_jspx_page_context);
    _jspx_th_form_input_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
    _jspx_th_form_input_7.setPath("bookAuthor2");
    _jspx_th_form_input_7.setDynamicAttribute(null, "name", new String("bookAuthor2"));
    int[] _jspx_push_body_count_form_input_7 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_7 = _jspx_th_form_input_7.doStartTag();
      if (_jspx_th_form_input_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_7.doFinally();
      _jspx_tagPool_form_input_path_name_nobody.reuse(_jspx_th_form_input_7);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_8(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_8 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_name_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_8.setPageContext(_jspx_page_context);
    _jspx_th_form_input_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
    _jspx_th_form_input_8.setPath("bookAuthor3");
    _jspx_th_form_input_8.setDynamicAttribute(null, "name", new String("bookAuthor3"));
    int[] _jspx_push_body_count_form_input_8 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_8 = _jspx_th_form_input_8.doStartTag();
      if (_jspx_th_form_input_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_8.doFinally();
      _jspx_tagPool_form_input_path_name_nobody.reuse(_jspx_th_form_input_8);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_9(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_9 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_name_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_9.setPageContext(_jspx_page_context);
    _jspx_th_form_input_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
    _jspx_th_form_input_9.setPath("bookAuthor4");
    _jspx_th_form_input_9.setDynamicAttribute(null, "name", new String("bookAuthor4"));
    int[] _jspx_push_body_count_form_input_9 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_9 = _jspx_th_form_input_9.doStartTag();
      if (_jspx_th_form_input_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_9.doFinally();
      _jspx_tagPool_form_input_path_name_nobody.reuse(_jspx_th_form_input_9);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_10(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_10 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_name_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_10.setPageContext(_jspx_page_context);
    _jspx_th_form_input_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
    _jspx_th_form_input_10.setPath("bookAuthor5");
    _jspx_th_form_input_10.setDynamicAttribute(null, "name", new String("bookAuthor5"));
    int[] _jspx_push_body_count_form_input_10 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_10 = _jspx_th_form_input_10.doStartTag();
      if (_jspx_th_form_input_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_10.doFinally();
      _jspx_tagPool_form_input_path_name_nobody.reuse(_jspx_th_form_input_10);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_11(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_11 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_value_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_11.setPageContext(_jspx_page_context);
    _jspx_th_form_input_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
    _jspx_th_form_input_11.setPath("bookCoverThumbnailURL");
    _jspx_th_form_input_11.setDynamicAttribute(null, "value", new String("/img/na_thumbnail.png"));
    int[] _jspx_push_body_count_form_input_11 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_11 = _jspx_th_form_input_11.doStartTag();
      if (_jspx_th_form_input_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_11[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_11.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_11.doFinally();
      _jspx_tagPool_form_input_value_path_nobody.reuse(_jspx_th_form_input_11);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_12(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_12 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_value_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_12.setPageContext(_jspx_page_context);
    _jspx_th_form_input_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
    _jspx_th_form_input_12.setPath("bookCoverFullURL");
    _jspx_th_form_input_12.setDynamicAttribute(null, "value", new String("/img/na_largecover.png"));
    int[] _jspx_push_body_count_form_input_12 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_12 = _jspx_th_form_input_12.doStartTag();
      if (_jspx_th_form_input_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_12[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_12.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_12.doFinally();
      _jspx_tagPool_form_input_value_path_nobody.reuse(_jspx_th_form_input_12);
    }
    return false;
  }
}
