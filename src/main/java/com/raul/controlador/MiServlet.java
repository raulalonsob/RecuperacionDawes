package com.raul.controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.raul.negocio.LogicaNegocio;

/**
 * Servlet implementation class MiServlet
 */
@WebServlet("/descuento")
public class MiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LogicaNegocio n = new LogicaNegocio();	
		double precio = n.calculaDescuento(request.getParameter("nombre"),request.getParameter("edad"));
		request.setAttribute("precio", precio);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/jsp/vista.jsp");
		dispatcher.forward(request, response);
	}

}
