package stepDefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException {
		StepDefination m = new StepDefination();
		// get place id
		if (StepDefination.place_id == null) {
			m.add_place_payload_with("Sabir", "Norsk", "Norway");
			m.user_calls_with_post_http_request("addPlaceAPI", "POST");
			m.verify_place_id_created_maps_to_using("Sabir", "getPlaceAPI");
		}

	}
}
