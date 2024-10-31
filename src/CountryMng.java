import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class CountryMng {
    public static List<Country> readCsvFile(File file) {
        List<Country> countries = new ArrayList<Country>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] column = line.split(",");
                int id = Integer.parseInt(column[0]);
                String code = column[1];
                String name = column[2];
                Country country = new Country(id, code, name);
                countries.add(country);
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            //noinspection CallToPrintStackTrace
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return countries;
    }
}
