package com.inti.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import com.inti.model.Aeroport;
import com.inti.model.Ville;
import com.inti.util.HibernateUtil;


@WebServlet("/aeroport")
public class AeroportVilleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Logger log = LogManager.getLogger();
	private Session s;
	
    public AeroportVilleServlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		s = HibernateUtil.getSessionFactory().openSession();
		log.debug("Connexion à la BDD et configuration d'hibernate depuis le servlet aeroport");
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/creerAeroportVille.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try 
		{
			s.beginTransaction();
			log.info("Début enregistrement aéroport");
			
			
			Ville ville = new Ville(request.getParameter("ville"));
			Aeroport a1 = new Aeroport(request.getParameter("nom"));
			a1.setVille(ville);
			s.save(ville);
			s.save(a1);
			
			s.getTransaction().commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			log.error("Erreur enregistrement aéroport");
			
			s.getTransaction().rollback();
		}
		
		doGet(request, response);
	}

}
