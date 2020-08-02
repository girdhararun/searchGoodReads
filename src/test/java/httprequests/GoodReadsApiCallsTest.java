package httprequests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GoodReadsApiCallsTest {
    GoodReadsApiCalls call = null;

    @BeforeEach
    void init(){
        call = new GoodReadsApiCalls();
    }

    @org.junit.jupiter.api.Test
    void searchMethodShouldWorkAsExpected() {
        int result_count = call.searchApiObj("treasure").getSearch().getTotalResults();
        Assertions.assertEquals( 31121, result_count);
    }

}