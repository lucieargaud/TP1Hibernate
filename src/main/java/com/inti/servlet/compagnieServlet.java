package com.inti.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;


import com.inti.util.HibernateUtil;

@WebServlet("/compagnie")
public class compagnieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Session s;
	
    public compagnieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		this.getServletContext().getRequestDispatcher("/WEB-INF/compagnie.jsp").forward(request, response);
		
		s = HibernateUtil.getSessionFactory().openSession();
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		try 
		{
			s.beginTransaction();
			

			
			s.getTransaction().commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			
			s.getTransaction().rollback();
		}
		doGet(request, response);
	}

}
