package aiss.model.resources;

import aiss.model.resource.RawgResource;

public class RawgTest {
public static void main(String[] args) {
	RawgResource rawg = new RawgResource();
	System.out.println(rawg.getRawgSearch("gtfo").getName());
}
}
