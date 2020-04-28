package aiss.model.resource;

import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.spotify.search.Item;

public class SpotifyResource {

	private static final Logger log = Logger.getLogger(SpotifyResource.class.getName());

	private final String access_token;
	private final String baseURL = "https://api.spotify.com/v1";

	public SpotifyResource(String access_token) {
		this.access_token = access_token;

	}

	public String getSearchTrackId(String busqueda) {
		if (!busqueda.trim().isEmpty()) {
			busqueda = busqueda.trim() + " Soundtrack";
			String busquedaTratada = busqueda.replace(" ", "%20").toLowerCase();

			String busquedatURL = baseURL + "/search?query=" + busquedaTratada + "&type=track";
			ClientResource cr = new ClientResource(busquedatURL);

			ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
			chr.setRawValue(access_token);
			cr.setChallengeResponse(chr);

			log.info("Retrieving user profile");

			try {
				log.info("sdg");
				return cr.get(Item.class).getId();

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

}
