package aiss.model.resource;

import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.restlet.resource.ClientResource;
import aiss.model.youtube.VideoYoutube;

public class YoutubeResource {

	private static final String Youtube_API_KEY = "AIzaSyCV1mXFxt2aVXV4yU3fgZAM4bzuB_dHEis";

	private static final Logger log = Logger.getLogger(YoutubeResource.class.getName());

	public String getYoutube(String game) throws IOException {

		game = game.trim()+" trailer";
		String search = game.replace(" ", "+").toLowerCase();

		String uri = "https://www.googleapis.com/youtube/v3/search?part=id&maxResults=1&order=relevance&q=" + search
				+ "&key=" + Youtube_API_KEY;
		log.log(Level.FINE, "Youtube URI: " + uri);

		// respuesta en json
		ClientResource cr = new ClientResource(uri);
		System.out.println(cr);
		VideoYoutube ytSearch = cr.get(VideoYoutube.class);

		Integer numResultados = ytSearch.getItems().size();
		String result = null;
		if (numResultados != 0 && numResultados != null) {
			result = ytSearch.getItems().get(0).getId().getVideoId();
		}

		return result;
	}

}
