/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.30
 * Generated at: 2020-04-27 07:32:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kr.multi.bigdataShop.product.*;
import java.util.List;

public final class product_005fread_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/iot/work/network/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/bigdataShop/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1583973383617L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("kr.multi.bigdataShop.product");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Bootstrap Example</title>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<link type=\"text/css\" href=\"/bigdataShop/common/css/master.css\"\r\n");
      out.write("\t\trel=\"stylesheet\" media=\"screen,print\" />\r\n");
      out.write("\t<link type=\"text/css\" href=\"/bigdataShop/common/css/print.css\"\r\n");
      out.write("\t\trel=\"stylesheet\" media=\"print\" />\r\n");
      out.write("\t<link type=\"text/css\" href=\"/bigdataShop/common/css/mall.css\"\r\n");
      out.write("\t\trel=\"stylesheet\" media=\"screen,print\" />\r\n");
      out.write("\t<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("A.applink:hover {\r\n");
      out.write("\tborder: 2px dotted #DCE6F4;\r\n");
      out.write("\tpadding: 2px;\r\n");
      out.write("\tbackground-color: #ffff00;\r\n");
      out.write("\tcolor: green;\r\n");
      out.write("\ttext-decoration: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A.applink {\r\n");
      out.write("\tborder: 2px dotted #DCE6F4;\r\n");
      out.write("\tpadding: 2px;\r\n");
      out.write("\tcolor: #2F5BFF;\r\n");
      out.write("\tbackground: transparent;\r\n");
      out.write("\ttext-decoration: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A.info {\r\n");
      out.write("\tcolor: #2F5BFF;\r\n");
      out.write("\tbackground: transparent;\r\n");
      out.write("\ttext-decoration: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("A.info:hover {\r\n");
      out.write("\tcolor: green;\r\n");
      out.write("\tbackground: transparent;\r\n");
      out.write("\ttext-decoration: underline\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#sky {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\ttop: 150px;\r\n");
      out.write("\tmargin-left: 400px;\r\n");
      out.write("\tbackground: #ffffff;\r\n");
      out.write("\tborder: solid #ccc;\r\n");
      out.write("\theight: 200px;\r\n");
      out.write("\tpadding: 30px\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"header\"></div>\r\n");
      out.write("\t<!-- /header -->\r\n");
      out.write("\t<hr />\r\n");
      out.write("\r\n");
      out.write("\t<!-- content/-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- lyt-main/ -->\r\n");
      out.write("\t<div class=\"lyt-main\">\r\n");
      out.write("\t\t<!-- title -->\r\n");
      out.write("\t\t<h2></h2>\r\n");
      out.write("\t\t<div class=\"goodsDetailWrap\">\r\n");
      out.write("\t\t\t<div class=\"leftWrap\">\r\n");
      out.write("\t\t\t\t<!---------------------- 상품사진  ----------------------->\r\n");
      out.write("\t\t\t\t<div class=\"photoWrap\">\r\n");
      out.write("\t\t\t\t\t<div class=\"photo\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 메인사진 -->\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"/bigdataShop/images/product/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ product.img_gen_file_nm}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\talt=\"썸이미지\" /></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"zoomBtn\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 확대  -->\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" onclick=\"imageZoom( '918' );\"><img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"/bigdataShop/images/btn_zoom.gif\" alt=\"확대\" /></a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- leftWrap END-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"rightWrap\">\r\n");
      out.write("\t\t\t\t<form name=\"frm\" method=\"post\" action=\"\">\r\n");
      out.write("\t\t\t\t\t<!-------------------------- 오른쪽 상품 가격 기타 정보 ------------------------>\r\n");
      out.write("\t\t\t\t\t<dl class=\"goodsDetail\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 상품 정보 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- 가격정보처리 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- 가격정보처리 -->\r\n");
      out.write("\t\t\t\t\t\t<dt>상품명</dt>\r\n");
      out.write("\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ product.prd_nm}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</dd>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<dt>판매가</dt>\r\n");
      out.write("\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ product.sell_prc_unit}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("원\r\n");
      out.write("\t\t\t\t\t\t</dd>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<dl class=\"goodsDetail\">\r\n");
      out.write("\t\t\t\t\t\t<dt>공급사</dt>\r\n");
      out.write("\t\t\t\t\t\t<dd>자바나라</dd>\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<dl class=\"goodsDetail\" id=\"defaultDl\">\r\n");
      out.write("\t\t\t\t\t\t<dt>상품코드</dt>\r\n");
      out.write("\t\t\t\t\t\t<dd></dd>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<dt>규격</dt>\r\n");
      out.write("\t\t\t\t\t\t<dd>standard</dd>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<dt>단위/최소구매단위</dt>\r\n");
      out.write("\t\t\t\t\t\t<dd>1EA EA</dd>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<dt>원산지/제조사</dt>\r\n");
      out.write("\t\t\t\t\t\t<dd>한국 /</dd>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t\t<dt>배송정보</dt> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- \t\t\t\t\t\t\t\t\t\t\t\t<dd>무료 배송상품</dd> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<dt>주문수량</dt>\r\n");
      out.write("\t\t\t\t\t\t<dt><a href=\"#\">가격비교</a></dt>\r\n");
      out.write("\t\t\t\t\t\t<!------------------ 상품상세 일반형  ---------------------->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<dd>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- 상품 수량 조절 영역-->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"gCnt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"v_prbuyea\" value=\"1\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"width: 35px;\" title=\"수량입력칸\" onchange=\"eaChange( this );\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"h_prcode\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvalue=\"G4042_F0002_X0004_K0040\" /> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"h_prname\" value=\"FXK-UTM V300\" /> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"h_prmoney\" value=\"8800000\" /> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"h_prstock\" value=\"10000\" /> <input type=\"hidden\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"h_prminbuyea\" value=\"1\" />\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btns\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" onclick=\"eaUp( this, 1 ); return false;\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/bigdataShop/images/b_up.gif\" alt=\"증가\" class=\"al\" /></a> <a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tonclick=\"eaUp( this, -1 ); return false;\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/bigdataShop/images/b_down.gif\" alt=\"감소\" class=\"al\" /></a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</dd>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"delBtn\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" onclick=\"optionAdd( this, 0 ); return false;\"> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"/bigdataShop/images/btn_icon_plus.gif\" alt=\"추가\" />\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!------------------ 상품상세 일반형  끝 ---------------------->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- *선택옵션 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- *입력옵션 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- *옵션추가영역 -->\r\n");
      out.write("\t\t\t\t\t<div id=\"optionAdd\"></div>\r\n");
      out.write("\t\t\t\t\t<!-- *옵션추가영역 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<dl class=\"goodsDetail\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"optionGoods h50 fr\">\r\n");
      out.write("\t\t\t\t\t\t\t<span id=\"v_prtotmoney\" class=\"sale fl\">0 </span><span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"sale02 fnt20\">원</span>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!------------------ 상품상세 일반형 끝 ---------------------->\r\n");
      out.write("\t\t\t\t\t</dl>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul class=\"btnArea mgt20\">\r\n");
      out.write("\t\t\t\t\t\t<!-- 구매버튼 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" onclick=\"dialogOpen('N'); return false;\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"/bigdataShop/images/btnm_nowBuy.gif\" alt=\"바로구매\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"marL07\"><a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"basketIn('N'); return false;\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"/bigdataShop/images/btnm_cart.gif\" alt=\"장바구니\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"fl_right marL07\"><a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"history.back();\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"/bigdataShop/images/btnm_list.gif\" alt=\"목록\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"fl_right\"><a href=\"#\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"productWishIn( 'G4042_F0002_X0004_K0040', 'N' );return false;\"><img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"/bigdataShop/images/btnm_wish.gif\" alt=\"위시리스트\" /></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"fl_right\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"/bigdataShop/proread.do?prdno=&action=UPDATE\">업데이트</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- rightWrap : 오른쪽 상품정보 END-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- goodsDetailWrap : 상품상세정보 전체 END-->\r\n");
      out.write("\r\n");
      out.write("\t\t<img src=\"/bigdataShop/images/product/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.img_org_file_nm }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\talt=\"썸이미지\" />\r\n");
      out.write("\t\t<div id=\"sky\">\r\n");
      out.write("\t\t\t<img src=\"/bigdataShop/images/product/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.img_org_file_nm }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\talt=\"썸이미지\" width=\"50px\" height=\"50px\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- =================댓글등록화면과 조회화면================================= -->\r\n");
      out.write("\t\t<form method=\"post\" \r\n");
      out.write("\t\t\t\taction=\"/bigdataShop/comment/write.do\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"prd_no\" \r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.prd_no }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"/>\r\n");
      out.write("\t\t\t\t<!-- 세션에 있는 로그인 아이디 정보를 꺼내서 넣어야 하나 임의로 \r\n");
      out.write("\t\t\t\t   바꿔가며 테스트 한다. -->\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"mem_id\" \tvalue=\"lee\"/>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<textarea rows=\"2\" cols=\"100\" name=\"pro_comment\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"등록\"/>\r\n");
      out.write("\t\t\t<table border=\"1\" style=\"border-collapse: collapse\">\r\n");
      out.write("\t\t\t\t<!-- 댓글리스트를 출력 (ProductController read메소드에서\r\n");
      out.write("\t\t\t\t comment list정보를 같이 조회\r\n");
      out.write("\t\t\t\t EL &JSTL로 commentlist의 정보를 출력하기\r\n");
      out.write("\t\t\t\t -->\r\n");
      out.write("\t\t\t\t ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/product/product_read.jsp(279,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty commentlist}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t \t\t");
          if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
      // /WEB-INF/product/product_read.jsp(280,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("comment");
      // /WEB-INF/product/product_read.jsp(280,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/product/product_read.jsp(280,6) '${commentlist}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${commentlist}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t \t\t\t<tr>\r\n");
            out.write("\t\t\t \t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${comment.pro_comment}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t \t\t\t</tr>\t\r\n");
            out.write("\t\t\t \t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}