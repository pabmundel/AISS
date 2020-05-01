package aiss.model.resources;

import java.io.IOException;

import aiss.model.resource.SpotifyResource;
import aiss.model.spotify.search.Item;

public class SpotifyTest {
	public static void main(String[] args) throws IOException {
		//TEST DE URL DE ALBUM
		
		String token = "BQDMjDE9SFdi6aFmAI--Jjfjf9VnJT2sLHkfWHdoNqYpl2FguUnJ2YoVrz4-XQ40HPmBPAhhI2OtbcHPuuJhRI0OuOBrdHUiop6N8aSh_JY3p1UTn316ZGCB593WCQwJ0akkDIk1nTN3nOzL9Hotgz6_RDlbwZCeYMhCiVmO00iE4y3UJNiP7BDhnqzTFrj-3Gn7EAIqAxFNZJsgAiAIjaX3EiR6wK_lqfYcYQzCCK5vumn5VBWdldOLhr0hIN3W54-Wp-SLOjAu8_jyxes";
		SpotifyResource spResource = new SpotifyResource(token);
		String busqueda = "Final Fantasy";
		String res = spResource.getSearchTrackId(busqueda);
		
		System.out.println(res);
		

		
	}

}
