package keywords;

import httprequests.GoodReadsApiCalls;
import models.goodReadsSearch.GoodreadsResponse;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class BaseSearch {

    GoodReadsApiCalls getApi;
    GoodreadsResponse.Search.Results results;
    HashMap<String, String> bookNameUrl = new LinkedHashMap<>();

    public BaseSearch() {
        getApi = new GoodReadsApiCalls();
    }

    public HashMap<String, String> getBookDetails(String searchData) {
        results = getApi.searchApiObj(searchData).getSearch().getResults();

        for (int i = 0; i < results.getWork().size(); i++) {
            long isbn = results.getWork().get(i).getBestBook().getId().getValue();
            String title = results.getWork().get(i).getBestBook().getTitle();
            bookNameUrl.put(title, "https://www.goodreads.com/book/isbn/" + isbn);
        }
        return bookNameUrl;
    }

    public static void main(String[] args) {
        new BaseSearch().getBookDetails("treasure");
    }
}
