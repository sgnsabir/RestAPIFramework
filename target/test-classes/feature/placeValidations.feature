Feature: Validating Place API's

  @AddPlace
  Scenario Outline: Verify if Place is being Successfully added using AddPlace API
    Given Add Place Payload with "<name>" "<language>" "<address>"
    When user calls "addPlaceAPI" with "Post" http request
    Then the API call got success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    And verify place_Id created maps to "<name>" using "getPlaceAPI"

    Examples: 
      | name        | language | address                                     |
      | S G N Sabir | English  | Fjelveien 33, Narvik 8515, Nordland, Norway |
      | Gold Smith  | German   | Anruf aus dem dt. Festnetz, 60 Cent         |

  @DeletePlace
  Scenario: Verify if Delete Place functionality is working
    Given DeletePlace Payload
    When user calls "deletePlaceAPI" with "POST" http request
    Then the API call got success with status code 200
    And "status" in response body is "OK"
