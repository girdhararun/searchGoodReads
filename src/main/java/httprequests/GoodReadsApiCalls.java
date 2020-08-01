package httprequests;

import models.goodReadsSearch.GoodreadsResponse;

import java.io.File;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static utils.PropertyReader.readPropertiesFile;


public class GoodReadsApiCalls {
    String key, secret, url, uri;
    protected Properties appProp;
    String testDataFile;

    public GoodReadsApiCalls() {
        testDataFile = "appdetails.properties";
        appProp = readPropertiesFile(System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "appData" + File.separator + testDataFile);
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

    public static void main(String[] args) {
        GoodReadsApiCalls test = new GoodReadsApiCalls();
        System.out.println(test.searchApiObj("treasure").getSearch().getResults().getWork().get(0).getId().getValue());
    }
}

