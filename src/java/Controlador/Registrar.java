/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Negocio.Concurso;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author estudiante
 */
@WebServlet(name = "Registrar", urlPatterns = {"/Registrar.do"})
public class Registrar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try{
          String nombre = request.getParameter("nombre");
          String correo = request.getParameter("correo");
          String contraseña = request.getParameter("contraseña");
          Concurso co = new Concurso();
          
          if(request.getSession().getAttribute("co")!=null){
             co = (Concurso) request.getSession().getAttribute("co");
          }
          
          
          if(co.insertarEstudiante(nombre, correo, contraseña)){
             request.getSession().setAttribute("co", co);
             request.getRequestDispatcher("./punto2/jsp/exito.jsp").forward(request,response);
          }
          else{
          System.err.println("error");
          request.getSession().setAttribute("error", "Ya existe ese estudiante");
          request.getRequestDispatcher("./punto2/jsp/error.jsp").forward(request,response);
          }
        }
        catch(Exception e){
         System.err.println(e.getMessage());
         request.getSession().setAttribute("error", e.getMessage());
         request.getRequestDispatcher("./punto2/jsp/error.jsp").forward(request,response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
