import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


public class BookEventsServlet extends HttpServlet {

    /**
     *
     * @param req
     * @param res
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("fname");
        String email = req.getParameter("email");
        String eventname = req.getParameter("uname");
        String eventtime = req.getParameter("time");
       String eventdate = req.getParameter("date");
       String mobileno = req.getParameter("mbn");
       String place = req.getParameter("place");
             
            try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/acadview","root","");
                    Class.forName("com.mysql.jdbc.Driver");
                String query="insert into user7 (fname,email,uname,time,date,mbn,place) values ('"+name+"','"+email+"','"+eventname+"','"+eventtime+"','"+eventdate+"','"+mobileno+"','"+place+"')";
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
