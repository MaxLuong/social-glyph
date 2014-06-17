package au.glyph.util;

import au.glyph.model.Card;
import au.glyph.model.Location;
import au.glyph.model.SocialNetwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class is used by the RESTful service.
 * The Gson parser doesn't like static methods, so I've had to do it this way...
 */
public class LocationUtil
{
	public List<Card> getCheckinURLs(String locationString)
	{
		if (locationString == null)
			return null;
		else if ("ZambreroQueanbeyan".equals(locationString))
		{
			List<Card> checkinURLs = new ArrayList<Card>(6);
			checkinURLs.add(new Card(SocialNetwork.GOOGLEPLUS.getName(), "https://plus.google.com/101320595653538900886/about?rfmt=s&hl=en&gl=au&review=1"));
			checkinURLs.add(new Card(SocialNetwork.FACEBOOK.getName(),"https://www.facebook.com/ZambreroQueanbeyan"));
			checkinURLs.add(new Card(SocialNetwork.GOOGLEMAPS.getName(),"http://goo.gl/maps/o4Ped"));
			checkinURLs.add(new Card(SocialNetwork.TWITTER.getName(),"https://twitter.com/Zambrero"));
			checkinURLs.add(new Card(SocialNetwork.FOURSQUARE.getName(),"https://foursquare.com/v/zambrero-fresh-mex-grill/4e27df19c65ba11f4c569253"));
			checkinURLs.add(new Card(SocialNetwork.YELP.getName(),"http://www.yelp.com.au/biz/zambrero-queanbeyan-queanbeyan-east"));

			return checkinURLs;
		}
		else if ("ZambreroWestonCreek".equals(locationString))
		{
			List<Card> checkinURLs = new ArrayList<Card>(6);
			checkinURLs.add(new Card(SocialNetwork.GOOGLEPLUS.getName(),"https://plus.google.com/117771086830841237915/about?rfmt=s&hl=en&gl=au&review=1"));
			checkinURLs.add(new Card(SocialNetwork.FACEBOOK.getName(),"https://www.facebook.com/pages/Zambrero/150788578330597"));
			checkinURLs.add(new Card(SocialNetwork.TWITTER.getName(),"https://twitter.com/Zambrero"));
			checkinURLs.add(new Card(SocialNetwork.FOURSQUARE.getName(),"https://foursquare.com/v/zambrero/4f97b558e4b0cfeb46e58c3f?ref=atw"));
			checkinURLs.add(new Card(SocialNetwork.GOOGLEMAPS.getName(),"http://goo.gl/maps/GgJOn"));
			checkinURLs.add(new Card(SocialNetwork.YELP.getName(),"http://www.yelp.com.au/biz/zambrero-weston-creek-weston"));

			return checkinURLs;
		}
		else
			return null;
	}

}
