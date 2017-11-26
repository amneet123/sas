
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
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
public class blog1 extends HttpServlet
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
         String n=req.getParameter("user");
        String d=req.getParameter("bname");
        String d1=req.getParameter("bd");
                
       
                    try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//Load driver
Connection con=DriverManager.getConnection("jdbc:odbc:db1","sa","sql123");
Statement st=con.createStatement();
String s="insert into blog1(UserName,,blogname,bdes) values('"+n+"','"+d+"','"+d1+"')";
st.executeQuery(s);
}
catch(Exception e)
{
System.out.println(e);
}
   } }  
   