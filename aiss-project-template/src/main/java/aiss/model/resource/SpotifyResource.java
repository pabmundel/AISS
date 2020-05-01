package aiss.model.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.spotify.search.Item;
import aiss.model.spotify.search.Search;
import aiss.model.spotify.track.Track;

public class SpotifyResource {

	private static final Logger log = Logger.getLogger(SpotifyResource.class.getName());

	private final String access_token;
	private final String baseURL = "https://api.spotify.com/v1";

	public SpotifyResource(String access_token) {
		this.access_token = access_token;

	}
	//obtenemos los id de la busqueda realizada
	public String getSearchTrackId(String busqueda) {
		if (!busqueda.trim().isEmpty()) {
			busqueda = busqueda.trim() + " Soundtrack";
			String busquedaTratada = busqueda.replace(" ", "%20").toLowerCase();

			String busquedatURL = baseURL + "/search?query=" + busquedaTratada + "&type=track&limit=1";
			ClientResource cr = new ClientResource(busquedatURL);

			ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
			chr.setRawValue(access_token);
			cr.setChallengeResponse(chr);

			log.info("Retrieving user profile");

			try {
				System.out.println(busquedatURL);
				Search res = cr.get(Search.class);
				String l = parseTrackId(res.getAdditionalProperties().get("tracks").toString());
				return "https://open.spotify.com/embed/track/"+l;

			} catch (ResourceException re) {
				log.warning("Error when retrieving the search: " + cr.getResponse().getStatus());
				log.warning(busquedatURL);
				return null;
			}
		} else {
			log.warning("Error when getting search from Spotify");
			return null;
		}

	}
	//obtiene el id de las canciones a partir del json pasado como parámetro
	protected String parseTrackId(String s){
		String[] trozos = s.split(",");
		String res = "";
		for (int i = 0; i < trozos.length; i++) {
			if(trozos[i].contains("uri=spotify:track:")) {
				res = (trozos[i].replace("uri=spotify:track:", "").replace("}", "").trim());
				break;
			}
		}
		return res;
	}

}
