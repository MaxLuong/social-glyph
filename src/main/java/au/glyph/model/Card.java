package au.glyph.model;

/**
 * Created with IntelliJ IDEA.
 * User: nark
 * Date: 27/10/13
 * Time: 11:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class Card
{
	private String name;
	private String text;
	private String url;

	public Card(String name, String url)
	{
		this.name = name;
		this.url = url;

		if (SocialNetwork.GOOGLEPLUS.getName().equals(name))
			this.text = SocialNetwork.GOOGLEPLUS.getDescription();
		if (SocialNetwork.YELP.getName().equals(name))
			this.text = SocialNetwork.YELP.getDescription();
		if (SocialNetwork.FACEBOOK.getName().equals(name))
			this.text = SocialNetwork.FACEBOOK.getDescription();
		if (SocialNetwork.FOURSQUARE.getName().equals(name))
			this.text = SocialNetwork.FOURSQUARE.getDescription();
		if (SocialNetwork.GOOGLEMAPS.getName().equals(name))
			this.text = SocialNetwork.GOOGLEMAPS.getDescription();
		if (SocialNetwork.TWITTER.getName().equals(name))
			this.text = SocialNetwork.TWITTER.getDescription();
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getText()
	{
		return text;
	}

	public void setText(String text)
	{
		this.text = text;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}
}
