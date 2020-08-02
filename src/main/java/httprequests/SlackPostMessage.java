package httprequests;
import static io.restassured.RestAssured.given;

public class SlackPostMessage extends BaseRequests {

    public SlackPostMessage() {
    }

    public String postMessageOnSlack(String message) {
        String slackHook = appProp.getProperty("slackIncomingHook");
        return given()
                .header("Content-type", "application/json").body(message)
                .expect()
                .statusCode(200)
                .when().post(slackHook)
                .then().extract().body().asString();
    }
}
