package com.emirates.tests.favorites;

import com.emirates.models.requestes.favorites.PostFavoritesRequest;
import com.emirates.models.responses.favorites.PostFavoritesResponse;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class PostFavorites {

    ValidatableResponse validatableResponse;

    @Test
    public  void verifyThat_PostFavorites_RespondsWith_200_StatusCode(){
        PostFavoritesRequest payLoad = PostFavoritesRequest.builder().
                subId("my-user-1234").
                imageId("asf2").build();
        validatableResponse = given().
                baseUri("https://api.thecatapi.com").
                header("Content-Type", "application/json").
                header("x-api-key","DEMO-API-KEY").body(payLoad).
                when().post("v1/favourites").
                then().log().all().
                assertThat().statusCode(200);
    }

    @Test
    public void verifyThat_PostFavorites_RespondsWith_CorrectData_AndSchema(){

        PostFavoritesResponse postFavoritesResponse = validatableResponse.extract().as(PostFavoritesResponse.class);
        System.out.println(postFavoritesResponse.getMessage());
                validatableResponse.assertThat().
                body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/PostFavorites.json"));


    }
}
