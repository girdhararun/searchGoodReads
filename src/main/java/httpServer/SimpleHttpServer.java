package httpServer;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import httprequests.SlackPostMessage;
import keywords.BaseSearch;
import models.slackMessage.SlackMessage;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringEscapeUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * a simple static http server
 */
public class SimpleHttpServer {

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/search", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }

    static class MyHandler implements HttpHandler {
        public void handle(HttpExchange t) throws IOException {
            InputStream body = t.getRequestBody();
            byte[] doc = IOUtils.toByteArray(body);
            BaseSearch book = new BaseSearch();
            SlackPostMessage slackPost = new SlackPostMessage();
            HashMap<String, String> results = new LinkedHashMap<>();
            String[] data = new String(doc).split("&");
            results = book.getBookDetails(StringEscapeUtils.unescapeHtml4(data[8].split("=")[1]));
            String result_string = "";
            for (Map.Entry<String, String> entry : results.entrySet())
                result_string = result_string + entry.getKey() +
                        ", URL : = " + entry.getValue()+"\n";
            result_string = "" + SlackMessage.modelJson.replaceFirst("\\$__\\$", result_string);
            slackPost.postMessageOnSlack(result_string);
        }
    }
}