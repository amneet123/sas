/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import conn.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Amneet kaur
 */
@WebServlet(name = "Editprofile", urlPatterns = {"/Editprofile"})
public class Editprofile extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String r=request.getParameter("snm");  
            String r1=request.getParameter("n");  
            String r2=request.getParameter("db");  
            String r3=request.getParameter("g");  
            String r4=request.getParameter("a");  
            String r5=request.getParameter("pn");
            String r6=request.getParameter("email");  
            String r7=request.getParameter("pw1");
            String r8=request.getParameter("pw2");  
            Connection con= DBConnection.dbconnect();
        PreparedStatement ps=con.prepareStatement("update login1 set email=? where name=?");
        
         ps.setString(1,r6);
          ps.setString(2,r);
          
        int i=ps.executeUpdate();
       
        out.println(i);
            /*
             * TODO output your page here. You may use following sample code.
             */
            
         
        } 
        catch(Exception e)
        {
            out.println(e);
        }
        finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
