package com.emirates.tests.votes;

import com.emirates.models.requestes.votes.PostVotesRequest;
import com.emirates.models.responses.votes.PostVotesResponse;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PostVotes {
    ValidatableResponse validatableResponse;


    @Test
    public  void verifyThat_PostVotes_PassedWith_201_StatusCode(){
        PostVotesRequest payLoad = PostVotesRequest.builder().
                subId("my-user-1234").
                value(1).
                imageId("image_id").build();

        validatableResponse = given().
                baseUri("https://api.thecatapi.com").
                header("Content-Type", "application/json").
                header("x-api-key", "DEMO-API-KEY").
                body(payLoad).
                when().post("v1/votes").
                then().
                log().all().
                assertThat().
                statusCode(201).
                body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/PostVotes.json"));}


        @Test
        public void verifyThat_PostVotes_RespondsWith_CorrectData(){
        PostVotesResponse postVotesResponse = validatableResponse.extract().as(PostVotesResponse.class);
            System.out.println(postVotesResponse.getMessage());
        }


    }



