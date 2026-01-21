package programs;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

    public class FetchJsonEg {
        public static void main(String[] args) throws IOException, InterruptedException {
            String url = "https://api.example.com/data.json"; // Replace with your actual link

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Print the JSON response
            System.out.println("JSON Data:\n" + response.body());
        }
    }

