package au.glyph.services;

import au.glyph.model.Card;
import au.glyph.model.Location;
import au.glyph.model.SocialNetwork;
import au.glyph.util.LocationUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.security.Key;
import java.util.HashMap;
import java.util.List;

@Path("/SocialGlyph/{locationString}")
public class SocialGlyph
{
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getLocationData(@PathParam("locationString") String locationString)
	{

		//increment page counter

		List<Card> checkinURLs = new LocationUtil().getCheckinURLs(locationString);

		Gson gson = new Gson();

		return gson.toJson(checkinURLs);
	}

	@POST
	public void buttonSelected(Location location, SocialNetwork socialNetwork)
	{
		//increment counter
	}
}
