import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


public class ContactServlet extends HttpServlet {

    /**
     *
     * @param req
     * @param res
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost (HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("uname");
        String mobileno = req.getParameter("mbn");
        String email = req.getParameter("email");
        String comments = req.getParameter("subject");
       
            try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acadview","root","");
                    Class.forName("com.mysql.jdbc.Driver");
                String query="insert into user5 (uname,mbn,email,subject) values ('"+name+"','"+mobileno+"','"+email+"','"+comments+"')";
                Statement st=con.createStatement();
                int i= st.executeUpdate(query);
            if(i>0)
                res.sendRedirect("home.html");
            }
        catch(IOException | ClassNotFoundException | SQLException e)
        {
        out.println(e.getMessage());
        }
    }

}
