package keywords;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class BaseSearchTest {
    BaseSearch baseSearch = null;
    @BeforeEach
    void setUp() {
        baseSearch = new BaseSearch();
    }

    @Test
    void getBookDetailsShouldProvidePaginatedResponse() {
        HashMap<String, String> ms = baseSearch.getBookDetails("treasure");
        Assertions.assertEquals(20, ms.size());
    }

    @Test
    void emptyStringShouldReturnZeroResultsAndNoError(){
        HashMap<String, String> ms = baseSearch.getBookDetails("");
        Assertions.assertEquals(0, ms.size());
    }

    @Test
    void searchStringWithSpacesShouldWorkAsExpected(){
        HashMap<String, String> ms = baseSearch.getBookDetails("treasure hunt");
        for(Map.Entry<String, String> entry : ms.entrySet()){
            Assertions.assertTrue(entry.getKey().toLowerCase().contains("treasure"));

        }
    }
    @Test
    void specialCharactersShouldNotBreakSearch(){
        HashMap<String, String> ms = baseSearch.getBookDetails("treasure $#%^&*@!");
        for(Map.Entry<String, String> entry : ms.entrySet()){
            Assertions.assertTrue(entry.getKey().toLowerCase().contains("treasure"));

        }
    }
}