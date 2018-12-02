import java.io.*;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.ResultSet;

/**
 *
 * @author hp
 */
public class LoginServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
    {
        res.setContentType("text/html; charset=UTF-8");
        //PrintWriter out=res.getWriter();
        String username = req.getParameter("uname");
        String pass = req.getParameter("pswl");
        PrintWriter out=res.getWriter();
        try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acadview","root","");
        Statement st=con.createStatement();
        String sql="Select uname,pswl from user2 where uname='"+username+"' AND pswl='"+pass+"'";
        ResultSet rs= st.executeQuery(sql);
        int i=0;
       while(rs.next())
        {
            String s1=rs.getString("uname");
            String s2=rs.getString("pswl");
            if(username.equals("ADMIN") && pass.equals("admins"))
            { i=1; }
            else if(username.equals(s1) && pass.equals(s2))
            { i=2; }
            else
            { i=0; }
        }
       if(i==1)
               {
                 res.sendRedirect("home_1.html");  
               }
       else if(i==2)
       {
           res.sendRedirect("home.html");
       }
       else
       {
           res.sendRedirect("index.html");
       }
        }
        catch (SQLException | ClassNotFoundException e)
        {
            out.println(e.getMessage());
        }
    }
}