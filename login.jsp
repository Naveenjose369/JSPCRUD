<%@ page import ="java.sql.*" %>
<%
String userid = request.getParameter("uname");    
String pwd = request.getParameter("pass");
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library",
"root", "root");
Statement st = con.createStatement();
ResultSet rs;
rs = st.executeQuery("select * from member where uname='" + userid + "' and pass='" + pwd + "'");
if (rs.next()) {
session.setAttribute("userid", userid);
//out.println("welcome " + userid);
//out.println("<a href='logout.jsp'>Log out</a>");
response.sendRedirect("index.jsp");
} else {
out.println("Invalid password <a href='login1.jsp'>try again</a>");
}
%>