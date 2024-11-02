import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Api {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request;


    {
        try {
            request = HttpRequest.newBuilder()
                    .uri(new URI("https://v6.exchangerate-api.com/v6/c36ffb921a6e0df9e45d01fd/latest/USD"))
                    .GET()
                    .build();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public void Json() {
        try {

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


            try (FileWriter file = new FileWriter("response.json")) {
                file.write(response.body());
             }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
