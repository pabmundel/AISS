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

		String accessToken = (String) req.getSession().getAttribute("Spotify-token");

		SpotifyResource spResource = new SpotifyResource(accessToken);
		

	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		doGet(req, resp);
	}
	
}
