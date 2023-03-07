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


import com.inti.model.Client;
import com.inti.util.HibernateUtil;

@WebServlet("/inscriptionClient")
public class nouvClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Logger log = LogManager.getLogger();
	private Session s;
	
    public nouvClientServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		s = HibernateUtil.getSessionFactory().openSession();
		log.debug("Connexion à la BDD et configuration d'hibernate depuis commande");
		System.out.println("Connexion : "+s);
		this.getServletContext().getRequestDispatcher("/WEB-INF/inscriptionClient.jsp").forward(request, response);
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Client c;
		try {

			s.beginTransaction();

			log.info("Début enregistrement");

			 c = new Client (request.getParameter("nom"),request.getParameter("prenom"),request.getParameter("adresse"),request.getParameter("tel"),request.getParameter("mail"));
			
			s.save(c);

			s.getTransaction().commit();
		} catch (Exception e) {
			
			e.printStackTrace();

			log.error("Erreur enregistrement utilisateur");

			s.getTransaction().rollback();
		}
		doGet(request, response);
	}

}
