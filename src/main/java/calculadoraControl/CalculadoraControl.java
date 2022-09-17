/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package calculadoraControl;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import calculadoraModelo.Calculadora;

/**
 *
 * @author demozath
 */
public class CalculadoraControl extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculadoraControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Datos ingresados " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
        String capitalTotal = request.getParameter("capitalTotal");
        String interesAnual = request.getParameter("interesAnual");
        String cantidadAnios = request.getParameter("cantidadAnios");
        
        double doCapitalTotal = Double.parseDouble(capitalTotal);
        double doInteresAnual = Double.parseDouble(interesAnual);
        Integer doAnios = Integer.parseInt(cantidadAnios);
        Calculadora calculadora = new Calculadora();
        
        calculadora.setCapitalTotal(doCapitalTotal);
        calculadora.setInteresAnual(doInteresAnual);
        calculadora.setCantidadAnios(doAnios);
        
        double doResultado = calculadora.calculaInteres();
        double redondeoResultado = Math.round(doResultado*100.0)/100.0;
        String resultado = String.valueOf(redondeoResultado);
        
        request.setAttribute("resultado", resultado);
        request.setAttribute("capitalTotal", capitalTotal);
        request.setAttribute("interesAnual", interesAnual);
        request.setAttribute("cantidadAnios", cantidadAnios);
        
        request.getRequestDispatcher("resultados.jsp").forward(request, response);
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
