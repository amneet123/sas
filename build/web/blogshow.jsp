<%-- 
    Document   : blogshow
    Created on : 29 Mar, 2014, 5:17:01 PM
    Author     : Amneet kaur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
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
   
        </div>
            <%}%>
    </body>
    
</html>
