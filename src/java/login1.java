
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amneet kaur
 */
public class login1 extends HttpServlet
{
   public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
    resp.setContentType("text/html");
    PrintWriter out=resp.getWriter();
//    String n=req.getParameter("txt"); 
//     String d=req.getParameter("txt1"); 
//      String a=req.getParameter("txt2"); 
//               int r=Integer.parseInt(n);

//       String user=req.getParameter("usr"); 
//         String pass=req.getParameter("psd");
         String n=req.getParameter("name");
        String d=req.getParameter("dob");
        String d1=req.getParameter("gender");
                
        String a=req.getParameter("address");
        String c=req.getParameter("country");
         String p=req.getParameter("phone");
        String em=req.getParameter("email");
        String p1=req.getParameter("pwd1");
        String p2=req.getParameter("pwd2");
        System.out.println("helllllll"+n+" "+d+" "+d1+" "+a+" "+c+" "+em+" "+p1+" "+p2);

            try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//Load driver
Connection con=DriverManager.getConnection("jdbc:odbc:db1","sa","sql123");
Statement st=con.createStatement();
String s="insert into login1(name,dob,gender,address,country,phno,email,pwd1,pwd2) values('"+n+"','"+d+"','"+d1+"','"+a+"','"+c+"','"+p+"','"+em+"','"+p1+"','"+p2+"')";
st.executeQuery(s);
}
catch(Exception e)
{
System.out.println(e);
}
   } }  
   
   
    

