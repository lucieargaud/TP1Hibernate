package com.inti.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import com.inti.model.Commande;
import com.inti.model.CompagnieAerienne;
import com.inti.model.Utilisateur;
import com.inti.model.Vol;
import com.inti.util.HibernateUtil;

@WebServlet("/compagnie")
public class compagnieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Logger log = LogManager.getLogger();
	private Session s;
	
    public compagnieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		s = HibernateUtil.getSessionFactory().openSession();
		log.debug("Connexion à la BDD et configuration d'hibernate depuis commande");
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/compagnie.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		try 
		{
			s.beginTransaction();
			log.info("Début enregistrement commande");
			
			CompagnieAerienne c1 = new CompagnieAerienne(request.getParameter("id"), request.getParameter("nom"));
		
			s.save(c1);

			
			s.getTransaction().commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			log.error("Erreur enregistrement utilisateur");
			
			s.getTransaction().rollback();
		}
		doGet(request, response);
	}

}
