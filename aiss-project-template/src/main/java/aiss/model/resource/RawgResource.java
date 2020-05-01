package aiss.model.resource;

import java.util.List;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import aiss.model.rawg.Games;
import aiss.model.rawg.Result;
import aiss.model.youtube.VideoYoutube;

public class RawgResource {
	
	private static final Logger log = Logger.getLogger(RawgResource.class.getName());

	public Result getRawgSearch(String game) {
		
		game.replace(" ", "+").trim();
		
		String uri = "https://api.rawg.io/api/games?search="+game;
		ClientResource cr = new ClientResource(uri);
		
		Games games = cr.get(Games.class);
		
		Integer numResultados = games.getResults().size();
		Result result = null;
		if (numResultados != 0 && numResultados != null) {
			result = games.getResults().get(0);
		}
		return result;
	}
	
	public String getDetails(String game){
		
		Result search = getRawgSearch(game);
		Integer gameId = search.getId();
		
		String uri = "https://api.rawg.io/api/games/{"+gameId+"}";
		ClientResource cr = new ClientResource(uri);
		System.out.println(cr);
		Result res = cr.get(Result.class);
		return res.getName();

	}
	
}
