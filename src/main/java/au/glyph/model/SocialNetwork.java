package au.glyph.model;

import javax.xml.bind.annotation.XmlEnum;

/**
 * Created with IntelliJ IDEA.
 * User: nark
 * Date: 14/10/13
 * Time: 8:47 PM
 * To change this template use File | Settings | File Templates.
 */
public enum SocialNetwork
{
	GOOGLEPLUS("googlePlus", "Find us on Google+"),
	GOOGLEMAPS("googleMaps", "Rate us on Google Maps"),
	FACEBOOK("facebook", "Like us on Facebook"),
	YELP("yelp", "Review us on Yelp"),
//	FACEBOOKLIKE("facebookLike", "Facebook"),
	TWITTER("twitter", "Follow us on Twitter"),
	FOURSQUARE("fourSquare", "Check in on FourSquare");

	private String name;
	private String description;

	public String getName()
	{
		return name;
	}

	public String getDescription()
	{
		return description;
	}

	private SocialNetwork(String name, String description)
	{
		this.name = name;
		this.description = description;
	}
}
