package aiss.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.resource.YoutubeResource;

/**
 * Servlet implementation class SearchController
 */
public class YoutubeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final Logger log = Logger.getLogger(YoutubeController.class.getName());
	private static final String YoutubeBase = "https://www.youtube.com/embed/";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public YoutubeController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String query = req.getParameter("query");

		log.log(Level.FINE, "Searching for a video from: " + query);

		YoutubeResource yt = new YoutubeResource();

		String results = yt.getYoutube(query);

		if (query != null) {
			String res = YoutubeBase + results;

			req.setAttribute("video", res);
	//		req.getRequestDispatcher("/success.jsp");
	//añadir siguiente vista si hay (pe. Spotify)
			SpotifySearchController sp = new SpotifySearchController();
			sp.doGet(req, resp);
		} else {
			log.log(Level.SEVERE, "Youtube object: " + results);
			req.getRequestDispatcher("/error.jsp").forward(req, resp);
			
		}
	}

}
