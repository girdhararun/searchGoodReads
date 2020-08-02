package httprequests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

class GoodReadsApiCallsTest {
    GoodReads call = null;

    @BeforeEach
    void init(){
        call = new GoodReads();
    }

    @org.junit.jupiter.api.Test
    void searchMethodShouldWorkAsExpected() {
        int result_count = call.searchApiObj("treasure").getSearch().getTotalResults();
        Assertions.assertEquals( 31121, result_count);
    }

}