
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
 * @author Gagesh 1
 */
public class myservlet extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String s1=req.getParameter("log");
        String s2=req.getParameter("pwd");
        boolean b2=false;
        resp.setContentType("text/html");
     PrintWriter pw=resp.getWriter();
        System.out.println("service method of GenericServlet......"+s1+s2);
        try
        {
          
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con=DriverManager.getConnection("jdbc:odbc:db1","sa","sql123");
            PreparedStatement ps=con.prepareStatement("select name,pwd1  from login1");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                if(rs.getString(1).equals(s1)&&rs.getString(2).equals(s2))
                {
                    b2=true;
                    break;
                }
            }
            if(b2)
            {
               resp.sendRedirect("share1.html");
            }
            else
            {
                 resp.sendRedirect("home1.html");
            }
    }
     catch(Exception e)
     {
        System.out.println(e);
   
     }
        
        
        
    }
    }
    
    

