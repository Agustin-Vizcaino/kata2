import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CityDataReader {

    private static final int popThreshold = 1000000;
    private CityDataReader() {}

    public static ArrayList<City> readCitiesFromPath(String path) throws IOException {
        BufferedReader reader = DataFileReader.readPath(path);

        if (reader != null) {
            //En teoría, no debería lanzar excepción debido al centinela
            ArrayList<City> cities = (ArrayList<City>) reader.lines()
                    .skip(1)
                    .map(line -> {
                        String[] fields = City.toCityFormat(line);
                        //System.out.println(fields[4]);
                        return new City(fields);
                    })
                    .filter(city -> city.getPopulation() >= popThreshold)
                    .collect(Collectors.toList());
            //System.out.println(cities.size());
            return cities;
        }
        return null;
    }
}
