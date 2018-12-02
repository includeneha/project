<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<head>
<title>EVENTS
</title>
        <center><title>EVENT MANAGEMENT</title></center>
 <body bgcolor="white"><h1 style="color:black"><center>EVENT MANAGEMENT</center></h1>

<style text="text/css">
body{
background-image:url(p11.jpg);
background-attachment: fixed;

}

#Tesla
{
    background-color: lightgrey;
    width: 91%;
    border: 2px white;
    padding: 20px;
    margin: 25px;
	height:280px;
	
}
#Tesla img {
  float: left;
}
#SpaceX{
    background-color: lightgrey;
    width: 91%;
    border: 2px white;
    padding: 20px;
	margin: 25px;
	height:280px;
}
#SpaceX img {
  float: left;}
  
#hyperloop{
    background-color: lightgrey;
    width: 91%;
    border: 2px white;
    padding: 20px;
    margin: 25px;
	height:280px;
}
#hyperloop img {
  float: left;}
  
  
  
#SolarCity{
    background-color: lightgrey;
    width: 91%;
    border: 2px white;
    padding: 20px;
    margin: 25px;
	height:280px;
}
#SolarCity img {
  float: left;}

#nav {
list-style-type:none;
margin:0;
padding:0;
background-color: #333;
overflow:hidden;
position: fixed;
top: 0;
width: 100%;

}
#items{

float:left;
border-right: 1px solid #bbb;
height:45px;
font-size:27px;
}
#items a{
display;block;
padding: 14px 16px;
color:white;
text-align:center;
text-decoration:none;

}
#items a:hover:not(.active) {
	background-color: #111;
}
.active {
	background-color:#4CAF50;
}
</style></head>


<body>

<style>
ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color:grey;
}

li {
    float: right;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 16px;
    text-decoration: none;
}

li a:hover {
    background-color:#11111;
}
</style>
<ul>
<li><a href="index.html">LOGOUT</a></li>
<li><a href="about.html">ABOUT</a></li>
 <li><a href="contact.html">CONTACT</a></li>
  
 <li><a href="showevents.jsp">UPCOMING EVENTS</a></li>
 <li><a href="gallery.html">GALLERY</a></li>
   <li><a href="book events.html">BOOK EVENTS</a></li>
  <li><a href="events.html">EVENTS</a></li>
  <li><a href="home.html">HOME</a></li>  
</ul>

<center><b><h1 style="color:gray">UPCOMING EVENTS</h1><b></center><br><br>
            <center>
            <table border="1" cellspacing="0" cellpadding="3">
    <tr bgcolor="#f0e8ad">
        <th><b><h1>First Name</b></h1></th>
        <th><b><h1>Event Name</b></h1></th>
        <th><b><h1>Event Time</b></h1></th>
        <th><b><h1>Event Date</b></h1></th>
        <th><b><h1>Mobile No</b></h1></th>       
        <th><b><h1>Place     </b></h1></th>
    </tr>
    <%
    try{
        String url="jdbc:mysql://localhost:3306/acadview";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(url,"root","");
        String query="select * from user7 where date>=CURRENT_DATE";
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
            %>
            <tr bgcolor="#e9beca">
                <td><%=rs.getString("fname")%></td>
         <td><%=rs.getString("uname")%></td>
         <td><%=rs.getString("time")%></td>
         <td><%=rs.getString("date")%></td>
         <td><%=rs.getString("mbn")%></td>        
         <td><%=rs.getString("place")%></td>
    </tr>
    <%
        }
}
catch(Exception e)
{
e.printStackTrace();
}
%>
</table>
</center>    
</body>
</html>