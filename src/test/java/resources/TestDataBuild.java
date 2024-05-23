package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {
	public static AddPlace addPlacePayload(String name, String language, String address) {
		AddPlace p = new AddPlace();
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		p.setLocation(l);
		p.setAccuracy(50);
		p.setName(name);
		p.setPhone_number("(+91) 983 893 3937");
		p.setAddress(address);
		List<String> myList = new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");

		p.setTypes(myList);
		p.setWebsite("http://google.com");
		p.setLanguage(language);
		return p;
	}

	public static String deletePlacePayload(String placeId) {
		return "{\r\n     \"place_id\": \"" + placeId + "\"\r\n}";
	}
}
