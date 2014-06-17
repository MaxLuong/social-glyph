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

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

import java.io.IOException;
import java.util.Date;


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


	private void storeLocation(String locationString)
	{
		Key locationKey = KeyFactory.createKey("Location", locationString);
		Date date = new Date();

		Entity card = new Entity("Card", locationKey);
		card.setProperty("user", user);
		card.setProperty("date", date);
		card.setProperty("content", content);

		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		datastore.put(card);




		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
		Key guestbookKey = KeyFactory.createKey("Guestbook", guestbookName);
		// Run an ancestor query to ensure we see the most up-to-date
		// view of the Greetings belonging to the selected Guestbook.
		Query query = new Query("Greeting", guestbookKey).addSort("date", Query.SortDirection.DESCENDING);
		List<Entity> greetings = datastore.prepare(query).asList(FetchOptions.Builder.withLimit(5));

	}
}
