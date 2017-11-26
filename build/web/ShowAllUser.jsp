<%-- 
    Document   : ShowAllUser
    Created on : 26 Mar, 2014, 10:36:08 AM
    Author     : Amneet kaur
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="conn.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>tabular form</h1>
        <%%>
        <table border="5">
        <tr><th>name</th>
            <th>dob</th>   
         </tr>
        
        <%
         Connection con1= DBConnection.dbconnect();
        PreparedStatement ps1=con1.prepareStatement("select name,dob from login1");
        ResultSet rs1=ps1.executeQuery();
        while(rs1.next())
                       {
            %>
    <tr>
        <td><%=rs1.getString(1)%></td>
        <td><%=rs1.getString(2)%></td>
    </tr>
       <% }
        %></table>
        <h1>All user</h1>
        <%
        Connection con= DBConnection.dbconnect();
        PreparedStatement ps=con.prepareStatement("select * from login1");
        ResultSet rs2=ps.executeQuery();
        while(rs2.next())
               {
            String n=rs2.getString(1);

%>
        <div style="border:1px plum solid; margin: 10px; width:312px; color:blueviolet;border-radius:10px;">
            name::<%=n%><br>
            dob:<%=rs2.getString(2)%><br>
            gender:<%=rs2.getString(3)%><br>
            address:<%=rs2.getString(4)%><br>
            country:<%=rs2.getString(5)%><br>
            phno<%=rs2.getString(6)%><br>
            
            email<%=rs2.getString(7)%><br>
            pwd1<%=rs2.getString(8)%><br>
            pwd2<%=rs2.getString(9)%><br>
            <a href="Edit profile.jsp?snm=<%=n%>">edit</a>
        </div>
            <%}%>
    </body>
</html>
