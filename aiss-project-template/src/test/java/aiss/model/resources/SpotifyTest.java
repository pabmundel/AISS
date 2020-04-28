package aiss.model.resources;

import java.io.IOException;

import aiss.model.resource.SpotifyResource;

public class SpotifyTest {
	public static void main(String[] args) throws IOException {
		//TEST DE URL DE ALBUM
		
		String token = "BQCYOgaxQZp43ewtMDGv8FOhwYg3a9dGSuBhbUpmarJ2lT7q4aps6lhF35m9cwJnule2TkUkTqaVquM9x71sMqL9daXAoU7cVvhaR3jKbSzlPQVd6KYLa4FwQYrhCNYFhF12elVbMv2S5gYvGNcdMsfPchT3LkK7ew1BF9uBLCi6OMgCSrhUnuUmOzE2HUSK6OutdjOQX";
		SpotifyResource spResource = new SpotifyResource(token);
		String busqueda = "Final Fantasy";
		String res = spResource.getSearchTrackId(busqueda);
		
		System.out.println(res);
		

		
	}

}
