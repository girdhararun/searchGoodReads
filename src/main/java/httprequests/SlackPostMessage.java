package httprequests;

import static io.restassured.RestAssured.given;

public class SlackPostMessage {

    public String postMessageOnSlack(String message) {
        return given()
                .header("Content-type", "application/json").body(message)
                .expect()
                .statusCode(200)
                .when().post("https://hooks.slack.com/services/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")
                .then().extract().body().asString();
    }
}
