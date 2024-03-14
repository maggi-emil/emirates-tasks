package com.emirates.tests.votes;


import com.emirates.controllers.Votes;
import com.emirates.models.requestes.votes.PostVotesRequest;
import com.emirates.models.responses.votes.PostVotesResponse;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostVotesEnhanced {

    @Test
    public void verifyThat_PostVotes_RespondsWith_200_StatusCode(){
        PostVotesRequest payLoad = PostVotesRequest.builder().subId("1").imageId("4567").value(3).build();

        ValidatableResponse response = Votes.post(payLoad, "DEMO-API-KEY");
        response.log().all().
                assertThat().statusCode(201);
        response.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/PostVotes.json"));
        PostVotesResponse postVotesResponse = response.extract().as(PostVotesResponse.class);
        System.out.println(postVotesResponse.getMessage());
        Assert.assertEquals(postVotesResponse.getMessage(), "SUCCESS");


    }
}
