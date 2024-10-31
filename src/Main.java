import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File csvFile = new File("data/country.vsc");
        List<Country> countries = CountryMng.readCsvFile(csvFile);
        for (Country country : countries) {
            System.out.println(country);
        }
    }
}
