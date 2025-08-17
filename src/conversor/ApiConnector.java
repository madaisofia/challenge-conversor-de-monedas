package conversor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ApiConnector {
    private static final String API_KEY = "98c0056061c91e13a679713f";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public double obtenerTasa(String from, String to) {
        try {
            String urlStr = BASE_URL + API_KEY + "/latest/" + from;
            URL url = new URL(urlStr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            in.close();

            JSONObject json = new JSONObject(response.toString());
            JSONObject rates = json.getJSONObject("conversion_rates");

            return rates.getDouble(to);

        } catch (Exception e) {
            System.out.println("Error en la conexión con la API: " + e.getMessage());
            return -1;
        }
    }
}
