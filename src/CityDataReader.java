import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CityDataReader {
    private CityDataReader() {}

    public static ArrayList<City> readCitiesFromPath(String path) throws IOException {
        BufferedReader reader = DataFileReader.readPath(path);

        if (reader != null) {
            //En teoría, no debería lanzar excepción debido al centinela
            return (ArrayList<City>) reader.lines()
                    .skip(1)
                    .map(line -> {
                        String[] fields = City.toCityFormat(line);
                        return new City(fields);
                    })
                    .collect(Collectors.toList());
        }
        return null;
    }
}
