package aiss.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.resource.SpotifyResource;


public class SpotifySearchController extends HttpServlet{

	private static final long serialVersionUID = -6818025976353856770L;
	private static final Logger log = Logger.getLogger(SpotifySearchController.class.getName());
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

//		String accessToken = "BQBWWtabrzjpi_F0eEdbPaWIAcdx7zI9DrkP6ARnfb3bQe9IPBHQq0i3VTpaZx-Qv4H5oho2oKtV_Ef58zCovqFCyDGZ62xUMSsDCCgOZ9OYeJqe391FF_L6qbcm8_r6MYqwPr6EYv_c1dcPME0bLHd0wqCOMSbIoP50h8ryhdSxc4NRB6V7fANHebZI5MF_f-sNZTPA4eJFiOq_ZVbTybY-HCuLTynHuQzHkW1lBFBVbKrPqK0pRVArfR7lWBnQjYCdPdiE9KApg7Yj7ak";
		String accessToken = (String) req.getSession().getAttribute("Spotify-token");
		String game = req.getParameter("query");
	
	if (accessToken != null && !"".equals(accessToken)) {

		SpotifyResource spResource = new SpotifyResource(accessToken);
		String results = spResource.getSearchTrackId(game);

		if (results != null) {
			req.setAttribute("tracks", results);
			req.setAttribute("game", game);
			req.getRequestDispatcher("/success.jsp").forward(req, resp);
		} else {
			log.warning("ninguna canción encontrada para el juego");
			req.getRequestDispatcher("/error.jsp").forward(req, resp);
		}
	} else {
		log.info("SpotifySearchController: El token ha expirado");
		req.getRequestDispatcher("/AuthController/Spotify").forward(req, resp);

	}

	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		doGet(req, resp);
	}
	
}
