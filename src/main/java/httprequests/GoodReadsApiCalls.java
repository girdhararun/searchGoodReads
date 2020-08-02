package httprequests;

import models.goodreadssearch.GoodreadsResponse;
import static io.restassured.RestAssured.given;

public class GoodReadsApiCalls extends BaseRequests {
    String key, secret, url, uri;

    public GoodReadsApiCalls() {
        key = appProp.getProperty("key");
        secret = appProp.getProperty("secret");
        url = appProp.getProperty("url");
        uri = appProp.getProperty("uri");
    }

    public GoodreadsResponse searchApiObj(String searchString) {
        return given().header("Accept", "*/*")
                .param("q", searchString).param("key", key)
                .expect()
                .statusCode(200)
                .when().get(url + uri).then().extract().body().as(GoodreadsResponse.class);
    }
}


