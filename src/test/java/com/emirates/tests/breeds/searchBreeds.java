package com.emirates.tests.breeds;

import com.emirates.models.responses.breeds.searchbreeds.SearchBreedsResponse;
import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.*;

public class searchBreeds {
    ValidatableResponse validatableResponse;

    @Test
    public void verifyThat_GetImages_Responds_WIth_200_StatusCode(){
        validatableResponse = given().
                baseUri("https://api.thecatapi.com").
                queryParams("q", "air").
                queryParams("attach_image", "1").
                when().get("v1/breeds/search").
                then().
                log().all().
                assertThat().statusCode(200);}

    @Test
    public void verifyThat_SearchBreeds_Responds_With_Correct_Origin(){
        List<SearchBreedsResponse> searchBreedsResponseList = validatableResponse.extract().
                body().
                jsonPath().
                getList("", SearchBreedsResponse.class);

        SearchBreedsResponse firstOption = searchBreedsResponseList.get(0);

        System.out.println(firstOption.getOrigin());
        Assert.assertEquals(firstOption.getOrigin(), "United States");

    }
}
