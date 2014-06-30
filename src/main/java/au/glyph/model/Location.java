package au.glyph.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;

@XmlRootElement
public enum Location
{
	ZAMBRERO_QBN("ZambreroQueanbeyan", new HashMap<SocialNetwork, String>(){{
					put(SocialNetwork.GOOGLEPLUS,"https://plus.google.com/101320595653538900886/about?rfmt=s&hl=en&gl=au&review=1");
					put(SocialNetwork.FACEBOOK,"https://www.facebook.com/ZambreroQueanbeyan");
					put(SocialNetwork.GOOGLEMAPS,"http://goo.gl/maps/o4Ped");
//					put(SocialNetwork.FACEBOOKLIKE,"https://www.facebook.com/ZambreroQueanbeyan");
					put(SocialNetwork.TWITTER,"https://twitter.com/Zambrero");
					put(SocialNetwork.FOURSQUARE,"https://foursquare.com/v/zambrero-fresh-mex-grill/4e27df19c65ba11f4c569253");
					put(SocialNetwork.YELP,"http://www.yelp.com.au/biz/zambrero-queanbeyan-queanbeyan-east");
					}}),
	ZAMBRERO_WC("ZambreroWestonCreek", new HashMap<SocialNetwork, String>(){{
					put(SocialNetwork.GOOGLEPLUS,"https://plus.google.com/117771086830841237915/about?rfmt=s&hl=en&gl=au&review=1");
					put(SocialNetwork.FACEBOOK,"https://www.facebook.com/pages/Zambrero/150788578330597");
					put(SocialNetwork.TWITTER,"https://twitter.com/Zambrero");
					put(SocialNetwork.FOURSQUARE,"https://foursquare.com/v/zambrero/4f97b558e4b0cfeb46e58c3f?ref=atw");
					put(SocialNetwork.GOOGLEMAPS,"http://goo.gl/maps/GgJOn");
					put(SocialNetwork.YELP,"http://www.yelp.com.au/biz/zambrero-weston-creek-weston");
					}});

	private String name;
	private HashMap<SocialNetwork, String> checkinURLs;

	private Location(String name, HashMap<SocialNetwork, String> checkinURLs)
	{
		this.name = name;
		this.checkinURLs = checkinURLs;
	}

	public String getName()
	{
		return name;
	}

	public HashMap<SocialNetwork, String> getCheckinURLs()
	{
		return checkinURLs;
	}

	public static Location getLocation(String locationString)
	{
		if (locationString == null)
			return null;
		else if (ZAMBRERO_QBN.name.equals(locationString))
			return ZAMBRERO_QBN;
		else if (ZAMBRERO_WC.name.equals(locationString))
			return ZAMBRERO_WC;
		else
			return null;
	}
}
