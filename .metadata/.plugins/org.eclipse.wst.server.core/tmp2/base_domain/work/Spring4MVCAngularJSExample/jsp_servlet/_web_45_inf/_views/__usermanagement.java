package jsp_servlet._web_45_inf._views;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class __usermanagement extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

    private static void _releaseTags(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag t) {
        while (t != null) {
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, t);
            if(t instanceof javax.servlet.jsp.tagext.Tag) {
                javax.servlet.jsp.tagext.Tag tmp = (javax.servlet.jsp.tagext.Tag)t;
                t = ((javax.servlet.jsp.tagext.Tag) t).getParent();
                try {
                    tmp.release();
                } catch(java.lang.Exception ignore) {}
            }
            else {
                t = ((javax.servlet.jsp.tagext.SimpleTag)t).getParent();
            }
        }
    }

    public boolean _isStale(){
        boolean _stale = _staticIsStale((weblogic.servlet.jsp.StaleChecker) getServletConfig().getServletContext());
        return _stale;
    }

    public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
        if (sci.isResourceStale("/WEB-INF/views/UserManagement.jsp", 1441453494000L ,"12.2.1.2.0","America/Chicago")) return true;
        return false;
    }
    private weblogic.servlet.jsp.ExpressionInterceptor _jsp_expressionInterceptor = weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.getNonOperExpressionInterceptor();

    private static boolean _WL_ENCODED_BYTES_OK = true;
    private static final java.lang.String _WL_ORIGINAL_ENCODING = "ISO-8859-1".intern();

    private static byte[] _getBytes(java.lang.String block){
        try {
            return block.getBytes(_WL_ORIGINAL_ENCODING);
        } catch (java.io.UnsupportedEncodingException u){
            _WL_ENCODED_BYTES_OK = false;
        }
        return null;
    }

    private static java.lang.String  _wl_block0 ="\n";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    private static java.lang.String  _wl_block1 ="\n<html>\n  <head>  \n    <title>AngularJS $http Example</title>  \n    <style>\n      .username.ng-valid {\n          background-color: lightgreen;\n      }\n      .username.ng-dirty.ng-invalid-required {\n          background-color: red;\n      }\n      .username.ng-dirty.ng-invalid-minlength {\n          background-color: yellow;\n      }\n\n      .email.ng-valid {\n          background-color: lightgreen;\n      }\n      .email.ng-dirty.ng-invalid-required {\n          background-color: red;\n      }\n      .email.ng-dirty.ng-invalid-email {\n          background-color: yellow;\n      }\n\n    </style>\n     <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">\n     <link href=\"";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 ="\" rel=\"stylesheet\"></link>\n  </head>\n  <body ng-app=\"myApp\" class=\"ng-cloak\">\n      <div class=\"generic-container\" ng-controller=\"UserController as ctrl\">\n          <div class=\"panel panel-default\">\n              <div class=\"panel-heading\"><span class=\"lead\">User Registration Form </span></div>\n              <div class=\"formcontainer\">\n                  <form ng-submit=\"ctrl.submit()\" name=\"myForm\" class=\"form-horizontal\">\n                      <input type=\"hidden\" ng-model=\"ctrl.user.id\" />\n                      <div class=\"row\">\n                          <div class=\"form-group col-md-12\">\n                              <label class=\"col-md-2 control-lable\" for=\"file\">Name</label>\n                              <div class=\"col-md-7\">\n                                  <input type=\"text\" ng-model=\"ctrl.user.username\" name=\"uname\" class=\"username form-control input-sm\" placeholder=\"Enter your name\" required ng-minlength=\"3\"/>\n                                  <div class=\"has-error\" ng-show=\"myForm.$dirty\">\n                                      <span ng-show=\"myForm.uname.$error.required\">This is a required field</span>\n                                      <span ng-show=\"myForm.uname.$error.minlength\">Minimum length required is 3</span>\n                                      <span ng-show=\"myForm.uname.$invalid\">This field is invalid </span>\n                                  </div>\n                              </div>\n                          </div>\n                      </div>\n                        \n                      \n                      <div class=\"row\">\n                          <div class=\"form-group col-md-12\">\n                              <label class=\"col-md-2 control-lable\" for=\"file\">Address</label>\n                              <div class=\"col-md-7\">\n                                  <input type=\"text\" ng-model=\"ctrl.user.address\" class=\"form-control input-sm\" placeholder=\"Enter your Address. [This field is validation free]\"/>\n                              </div>\n                          </div>\n                      </div>\n\n                      <div class=\"row\">\n                          <div class=\"form-group col-md-12\">\n                              <label class=\"col-md-2 control-lable\" for=\"file\">Email</label>\n                              <div class=\"col-md-7\">\n                                  <input type=\"email\" ng-model=\"ctrl.user.email\" name=\"email\" class=\"email form-control input-sm\" placeholder=\"Enter your Email\" required/>\n                                  <div class=\"has-error\" ng-show=\"myForm.$dirty\">\n                                      <span ng-show=\"myForm.email.$error.required\">This is a required field</span>\n                                      <span ng-show=\"myForm.email.$invalid\">This field is invalid </span>\n                                  </div>\n                              </div>\n                          </div>\n                      </div>\n\n                      <div class=\"row\">\n                          <div class=\"form-actions floatRight\">\n                              <input type=\"submit\"  value=\"{{!ctrl.user.id ? \'Add\' : \'Update\'}}\" class=\"btn btn-primary btn-sm\" ng-disabled=\"myForm.$invalid\">\n                              <button type=\"button\" ng-click=\"ctrl.reset()\" class=\"btn btn-warning btn-sm\" ng-disabled=\"myForm.$pristine\">Reset Form</button>\n                          </div>\n                      </div>\n                  </form>\n              </div>\n          </div>\n          <div class=\"panel panel-default\">\n                <!-- Default panel contents -->\n              <div class=\"panel-heading\"><span class=\"lead\">List of Users </span></div>\n              <div class=\"tablecontainer\">\n                  <table class=\"table table-hover\">\n                      <thead>\n                          <tr>\n                              <th>ID.</th>\n                              <th>Name</th>\n                              <th>Address</th>\n                              <th>Email</th>\n                              <th width=\"20%\"></th>\n                          </tr>\n                      </thead>\n                      <tbody>\n                          <tr ng-repeat=\"u in ctrl.users\">\n                              <td><span ng-bind=\"u.id\"></span></td>\n                              <td><span ng-bind=\"u.username\"></span></td>\n                              <td><span ng-bind=\"u.address\"></span></td>\n                              <td><span ng-bind=\"u.email\"></span></td>\n                              <td>\n                              <button type=\"button\" ng-click=\"ctrl.edit(u.id)\" class=\"btn btn-success custom-width\">Edit</button>  <button type=\"button\" ng-click=\"ctrl.remove(u.id)\" class=\"btn btn-danger custom-width\">Remove</button>\n                              </td>\n                          </tr>\n                      </tbody>\n                  </table>\n              </div>\n          </div>\n      </div>\n      \n      <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js\"></script>\n      <script src=\"";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private static java.lang.String  _wl_block3 ="\"></script>\n      <script src=\"";
    private final static byte[]  _wl_block3Bytes = _getBytes( _wl_block3 );

    private static java.lang.String  _wl_block4 ="\"></script>\n  </body>\n</html>";
    private final static byte[]  _wl_block4Bytes = _getBytes( _wl_block4 );

    static private weblogic.jsp.internal.jsp.JspFunctionMapper _jspx_fnmap = weblogic.jsp.internal.jsp.JspFunctionMapper.getInstance();

    protected void _jspInit() {
        _jsp_expressionInterceptor = weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.getExpressionInterceptor(getServletConfig());
    }

    public void _jspService(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) 
    throws javax.servlet.ServletException, java.io.IOException {

        javax.servlet.ServletConfig config = getServletConfig();
        javax.servlet.ServletContext application = config.getServletContext();
        javax.servlet.jsp.tagext.JspTag _activeTag = null;
        java.lang.Object page = this;
        javax.servlet.jsp.PageContext pageContext = javax.servlet.jsp.JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true , 8192 , true );
        response.setHeader("Content-Type", "text/html; charset=ISO-8859-1");
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter)out;
        _bw.setInitCharacterEncoding(_WL_ORIGINAL_ENCODING, _WL_ENCODED_BYTES_OK);
        javax.servlet.jsp.JspWriter _originalOut = out;
        javax.servlet.http.HttpSession session = request.getSession( true );
        try {;
            response.setContentType("text/html; charset=ISO-8859-1");
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block1Bytes, _wl_block1);

            if (_jsp__tag0(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block2Bytes, _wl_block2);

            if (_jsp__tag1(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block3Bytes, _wl_block3);

            if (_jsp__tag2(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block3Bytes, _wl_block3);

            if (_jsp__tag3(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block4Bytes, _wl_block4);
        } catch (java.lang.Throwable __ee){
            __ee.setStackTrace(weblogic.jsp.internal.jsp.utils.SMAPUtils.loadSMAP(this.getClass()).processStackTrace(__ee.getStackTrace()));
            if(!(__ee instanceof javax.servlet.jsp.SkipPageException)) {
                while ((out != null) && (out != _originalOut)) out = pageContext.popBody(); 
                _releaseTags(pageContext, _activeTag);
                pageContext.handlePageException(__ee);
            }
        } finally {
            javax.servlet.jsp.JspFactory.getDefaultFactory().releasePageContext(pageContext);
        }
    }

    private boolean _jsp__tag0(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.taglibs.standard.tag.rt.core.UrlTag __tag0 = null ;
        int __result__tag0 = 0 ;

        if (__tag0 == null ){
            __tag0 = new  org.apache.taglibs.standard.tag.rt.core.UrlTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag0);
        }
        __tag0.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag0, parent);
        __tag0.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("/static/css/app.css", java.lang.String.class,"value"));
        _activeTag=__tag0;
        try {
            __result__tag0 = __tag0.doStartTag();

            if (__result__tag0!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                if (__result__tag0== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                }
            }
            if (__tag0.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                _activeTag = null;
                _releaseTags(pageContext, __tag0);
                return true;
            }

        } finally {
            _activeTag=__tag0.getParent();
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag0);
            __tag0.release();
        }
        return false;
    }

    private boolean _jsp__tag1(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.taglibs.standard.tag.rt.core.UrlTag __tag1 = null ;
        int __result__tag1 = 0 ;

        if (__tag1 == null ){
            __tag1 = new  org.apache.taglibs.standard.tag.rt.core.UrlTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag1);
        }
        __tag1.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag1, parent);
        __tag1.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("/static/js/app.js", java.lang.String.class,"value"));
        _activeTag=__tag1;
        try {
            __result__tag1 = __tag1.doStartTag();

            if (__result__tag1!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                if (__result__tag1== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                }
            }
            if (__tag1.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                _activeTag = null;
                _releaseTags(pageContext, __tag1);
                return true;
            }

        } finally {
            _activeTag=__tag1.getParent();
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag1);
            __tag1.release();
        }
        return false;
    }

    private boolean _jsp__tag2(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.taglibs.standard.tag.rt.core.UrlTag __tag2 = null ;
        int __result__tag2 = 0 ;

        if (__tag2 == null ){
            __tag2 = new  org.apache.taglibs.standard.tag.rt.core.UrlTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag2);
        }
        __tag2.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag2, parent);
        __tag2.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("/static/js/service/user_service.js", java.lang.String.class,"value"));
        _activeTag=__tag2;
        try {
            __result__tag2 = __tag2.doStartTag();

            if (__result__tag2!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                if (__result__tag2== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                }
            }
            if (__tag2.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                _activeTag = null;
                _releaseTags(pageContext, __tag2);
                return true;
            }

        } finally {
            _activeTag=__tag2.getParent();
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag2);
            __tag2.release();
        }
        return false;
    }

    private boolean _jsp__tag3(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.taglibs.standard.tag.rt.core.UrlTag __tag3 = null ;
        int __result__tag3 = 0 ;

        if (__tag3 == null ){
            __tag3 = new  org.apache.taglibs.standard.tag.rt.core.UrlTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag3);
        }
        __tag3.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag3, parent);
        __tag3.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("/static/js/controller/user_controller.js", java.lang.String.class,"value"));
        _activeTag=__tag3;
        try {
            __result__tag3 = __tag3.doStartTag();

            if (__result__tag3!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                if (__result__tag3== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                }
            }
            if (__tag3.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                _activeTag = null;
                _releaseTags(pageContext, __tag3);
                return true;
            }

        } finally {
            _activeTag=__tag3.getParent();
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag3);
            __tag3.release();
        }
        return false;
    }
}
