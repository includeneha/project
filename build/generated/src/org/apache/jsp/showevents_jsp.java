package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class showevents_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<head>\n");
      out.write("<title>EVENTS\n");
      out.write("</title>\n");
      out.write("        <center><title>EVENT MANAGEMENT</title></center>\n");
      out.write(" <body bgcolor=\"white\"><h1 style=\"color:black\"><center>EVENT MANAGEMENT</center></h1>\n");
      out.write("\n");
      out.write("<style text=\"text/css\">\n");
      out.write("body{\n");
      out.write("background-image:url(p11.jpg);\n");
      out.write("background-attachment: fixed;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#Tesla\n");
      out.write("{\n");
      out.write("    background-color: lightgrey;\n");
      out.write("    width: 91%;\n");
      out.write("    border: 2px white;\n");
      out.write("    padding: 20px;\n");
      out.write("    margin: 25px;\n");
      out.write("\theight:280px;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("#Tesla img {\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write("#SpaceX{\n");
      out.write("    background-color: lightgrey;\n");
      out.write("    width: 91%;\n");
      out.write("    border: 2px white;\n");
      out.write("    padding: 20px;\n");
      out.write("\tmargin: 25px;\n");
      out.write("\theight:280px;\n");
      out.write("}\n");
      out.write("#SpaceX img {\n");
      out.write("  float: left;}\n");
      out.write("  \n");
      out.write("#hyperloop{\n");
      out.write("    background-color: lightgrey;\n");
      out.write("    width: 91%;\n");
      out.write("    border: 2px white;\n");
      out.write("    padding: 20px;\n");
      out.write("    margin: 25px;\n");
      out.write("\theight:280px;\n");
      out.write("}\n");
      out.write("#hyperloop img {\n");
      out.write("  float: left;}\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("#SolarCity{\n");
      out.write("    background-color: lightgrey;\n");
      out.write("    width: 91%;\n");
      out.write("    border: 2px white;\n");
      out.write("    padding: 20px;\n");
      out.write("    margin: 25px;\n");
      out.write("\theight:280px;\n");
      out.write("}\n");
      out.write("#SolarCity img {\n");
      out.write("  float: left;}\n");
      out.write("\n");
      out.write("#nav {\n");
      out.write("list-style-type:none;\n");
      out.write("margin:0;\n");
      out.write("padding:0;\n");
      out.write("background-color: #333;\n");
      out.write("overflow:hidden;\n");
      out.write("position: fixed;\n");
      out.write("top: 0;\n");
      out.write("width: 100%;\n");
      out.write("\n");
      out.write("}\n");
      out.write("#items{\n");
      out.write("\n");
      out.write("float:left;\n");
      out.write("border-right: 1px solid #bbb;\n");
      out.write("height:45px;\n");
      out.write("font-size:27px;\n");
      out.write("}\n");
      out.write("#items a{\n");
      out.write("display;block;\n");
      out.write("padding: 14px 16px;\n");
      out.write("color:white;\n");
      out.write("text-align:center;\n");
      out.write("text-decoration:none;\n");
      out.write("\n");
      out.write("}\n");
      out.write("#items a:hover:not(.active) {\n");
      out.write("\tbackground-color: #111;\n");
      out.write("}\n");
      out.write(".active {\n");
      out.write("\tbackground-color:#4CAF50;\n");
      out.write("}\n");
      out.write("</style></head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color:grey;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("    float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("    display: block;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover {\n");
      out.write("    background-color:#11111;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"index.html\">LOGOUT</a></li>\n");
      out.write("<li><a href=\"about.html\">ABOUT</a></li>\n");
      out.write(" <li><a href=\"contact.html\">CONTACT</a></li>\n");
      out.write("  \n");
      out.write(" <li><a href=\"showevents.jsp\">UPCOMING EVENTS</a></li>\n");
      out.write(" <li><a href=\"gallery.html\">GALLERY</a></li>\n");
      out.write("   <li><a href=\"book events.html\">BOOK EVENTS</a></li>\n");
      out.write("  <li><a href=\"events.html\">EVENTS</a></li>\n");
      out.write("  <li><a href=\"home.html\">HOME</a></li>  \n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<center><b><h1 style=\"color:gray\">UPCOMING EVENTS</h1><b></center><br><br>\n");
      out.write("            <center>\n");
      out.write("            <table border=\"1\" cellspacing=\"0\" cellpadding=\"3\">\n");
      out.write("    <tr bgcolor=\"#f0e8ad\">\n");
      out.write("        <th><b><h1>First Name</b></h1></th>\n");
      out.write("        <th><b><h1>Event Name</b></h1></th>\n");
      out.write("        <th><b><h1>Event Time</b></h1></th>\n");
      out.write("        <th><b><h1>Event Date</b></h1></th>\n");
      out.write("        <th><b><h1>Mobile No</b></h1></th>       \n");
      out.write("        <th><b><h1>Place     </b></h1></th>\n");
      out.write("    </tr>\n");
      out.write("    ");

    try{
        String url="jdbc:mysql://localhost:3306/acadview";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(url,"root","");
        String query="select * from user7 where date>=CURRENT_DATE";
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
            
      out.write("\n");
      out.write("            <tr bgcolor=\"#e9beca\">\n");
      out.write("                <td>");
      out.print(rs.getString("fname"));
      out.write("</td>\n");
      out.write("         <td>");
      out.print(rs.getString("uname"));
      out.write("</td>\n");
      out.write("         <td>");
      out.print(rs.getString("time"));
      out.write("</td>\n");
      out.write("         <td>");
      out.print(rs.getString("date"));
      out.write("</td>\n");
      out.write("         <td>");
      out.print(rs.getString("mbn"));
      out.write("</td>        \n");
      out.write("         <td>");
      out.print(rs.getString("place"));
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("    ");

        }
}
catch(Exception e)
{
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>\n");
      out.write("</center>    \n");
      out.write("</body>\n");
      out.write("</html>");
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
