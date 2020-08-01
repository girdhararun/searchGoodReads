import goodReadsSearch.GoodreadsResponse;

import static io.restassured.RestAssured.given;


public class GoodReadsApiCalls {
    String key = "11AzOEYXS2oqXaofmANuFA";
    String secret = "PUXzY4zDsa6RzLI7ihXn4FRjQwpdtHL7DEf5CSpAI";


    GoodreadsResponse searchApiObj(String searchString){
        return given().header("Accept", "*/*")
                .param("q", searchString).param("key",key)
                .expect()
                .statusCode(200)
                .when().get("https://www.goodreads.com/search/index.xml").then().extract().body().as(GoodreadsResponse.class);
    }

    public static void main(String[] args) {
        GoodReadsApiCalls test = new GoodReadsApiCalls();
        System.out.println(test.searchApiObj("treasure").getSearch().getResults().getWork().get(0).getId().getValue());
    }
}


