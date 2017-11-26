<%-- 
    Document   : Edit profile
    Created on : 26 Mar, 2014, 9:54:24 AM
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
        <h1>Hello World!</h1>
        <% Connection con= DBConnection.dbconnect();
        String r1=request.getParameter("snm"); 
        String n=""; 
        String db=""; 
        String g="";
        String a="";
        String c="";
        String pn="";
        String em="";
        String pw1="";
        String pw2="";
        
        PreparedStatement ps=con.prepareStatement("select * from login1 where name=?");
         ps.setString(1,r1);
        ResultSet rs=ps.executeQuery(); 
         if(rs.next()) {
             n=rs.getString(2); 
            db=rs.getString(3); 
          g=rs.getString(4); 
          a=rs.getString(5); 
          pn=rs.getString(6); 
          em=rs.getString(7); 
          pw1=rs.getString(8); 
           pw2=rs.getString(9);                   
             
         }
        %>
        <form action="Editprofile">
            
            Name:<input type="text" name="snm" value="<%=r1%>" />
            dob:<input type="text" name="rl" value="<%=n%>" />
            gender<input type="text" name="sadd" value="<%=db%>" />
            address<input type="text" name="add" value="<%=g%>" />
            country<input type="text" name="cn" value="<%=a%>" />
            
            contact no<input type="text" name="mno" value="<%=pn%>" />
            email:<input type="text" name="email" value="<%=em%>" />
            p1<input type="password" name="pwd1" value="<%=pw1%>" />
            p2<input type="password" name="pwd2" value="<%=pw2%>" />
            <input type="submit" value="update" />
        </form>
    </body>
</html>
