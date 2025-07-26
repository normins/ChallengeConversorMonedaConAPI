

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarAPI {
    // Convertir utilizando Exchange Rate
    public Moneda convertirConAPI(String origenMoneda, String destinoMoneda, int monto)
            throws java. io. IOException, InterruptedException{

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c4bf1e058dcd5f1034b2417f/pair/"
                + origenMoneda + "/" + destinoMoneda + "/" + monto);

        HttpClient client  = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Conversión no disponible en este momento.");
        }
    }
}
