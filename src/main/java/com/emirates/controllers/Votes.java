package com.emirates.controllers;
import com.emirates.models.requestes.votes.PostVotesRequest;
import com.emirates.utilities.PropertiesReader;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class Votes {

    private static final String dataPath= "src/test/resources/configs/Emirates.properties";

    public static ValidatableResponse post(PostVotesRequest payload, String xApiKey){
        ValidatableResponse validatableResponse = given().
                filter(new AllureRestAssured()).
                baseUri(PropertiesReader.readProperty("App_URL",dataPath)).
                header("Content-Type", "application/json").
                header("x-api-key", xApiKey).
                body(payload).
                when().post(PropertiesReader.readProperty("Post_Votes_EndPoint", dataPath)).
                then();
        return validatableResponse;
    }
}
