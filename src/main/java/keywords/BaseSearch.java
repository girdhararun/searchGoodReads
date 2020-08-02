package keywords;

import httprequests.GoodReadsApiCalls;
import models.goodreadssearch.GoodreadsResponse;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Properties;

import static configreader.PropertyReader.readPropertiesFile;

public class BaseSearch {

    GoodReadsApiCalls getApi;
    GoodreadsResponse.Search.Results results;
    HashMap<String, String> bookNameUrl = new LinkedHashMap<>();
    protected Properties appProp;
    String testDataFile;

    public BaseSearch() {
        getApi = new GoodReadsApiCalls();
        testDataFile = "appdetails.properties";
        appProp = readPropertiesFile(System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "appData" + File.separator + testDataFile);
    }

    public HashMap<String, String> getBookDetails(String searchData) {
        results = getApi.searchApiObj(searchData).getSearch().getResults();

        for (int i = 0; i < results.getWork().size(); i++) {
            long isbn = results.getWork().get(i).getBestBook().getId().getValue();
            String title = results.getWork().get(i).getBestBook().getTitle();
            bookNameUrl.put(title, appProp.getProperty("url")+"book/isbn/" + isbn);
        }
        return bookNameUrl;
    }

    public static void main(String[] args) {
        new BaseSearch().getBookDetails("treasure");
    }
}
