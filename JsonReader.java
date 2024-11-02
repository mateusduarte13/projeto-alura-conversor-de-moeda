


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.FileReader;
import java.io.IOException;

public class JsonReader {
    public ConversionRates readConversionRates(String filename) {
        try (FileReader reader = new FileReader(filename)) {

            JsonObject jsonObject = new Gson().fromJson(reader, JsonObject.class);

             JsonObject conversionRatesJson = jsonObject.getAsJsonObject("conversion_rates");

             ConversionRates rates = new Gson().fromJson(conversionRatesJson, ConversionRates.class);
            return rates;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
