package aiss.model.resources;

import static org.junit.Assert.assertNotNull;
import java.io.IOException;
import org.junit.Test;
import aiss.model.resource.YoutubeResource;

public class YoutubeTest {
	public static void main(String[] args) {
			String YoutubeBase = "https://www.youtube.com/embed/";


			String game = "Final Fantasy";
			YoutubeResource yt = new YoutubeResource();
			String res = "";
			try {
				res = yt.getYoutube(game);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(YoutubeBase + res);
			
	}
	
}
