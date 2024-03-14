package com.emirates.tests.categories;
import com.emirates.models.responses.categories.getcategories.GetCategoriesResponse;
import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.module.jsv.JsonSchemaValidator;

import java.util.List;


public class GetCategories {
    ValidatableResponse validatableResponse;

    @Test
   public void verifyThat_GetCategories_Responds_With_2oo_StatusCode(){
        validatableResponse = given().
                baseUri("https://api.thecatapi.com").

                when().get("v1/categories").
                then().
                log().all().
                assertThat().statusCode(200);}
    @Test
    public void verifyThat_GetCategories_Responds_With_Correct_Schema_OnSuccess(){
        validatableResponse.assertThat().
                body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/GetCategories.json"));
    }
    @Test
    public void verifyThat_GetCategories_Responds_With_Correct_ID(){
        List<GetCategoriesResponse> categoriesList = validatableResponse.
                extract().
                body().
                jsonPath().
                getList("", GetCategoriesResponse.class);

        GetCategoriesResponse firstCategory = categoriesList.get(0);

        Assert.assertEquals(firstCategory.getId(), 5);
        Assert.assertEquals(firstCategory.getName(), "boxes");







    }

}
