package Sprint4.JsonDemo.AntonsOrginalKlasser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class QuestionClient {
    private final String base_url = "https://opentdb.com/api_category.php";
    private final HttpClient client;
    private final ObjectMapper mapper;
    private final Gson gson;

    QuestionClient() {
        this.client = HttpClient.newHttpClient();
        this.mapper = new ObjectMapper();
        gson = new Gson();
    }

    public String getCategories() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(base_url))
                .GET()
                .build();

       HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
       return response.body();
    }

    public void gsontest() {

    }
}
