import java.util.List;

public class City {
    //Dataset source: https://public.opendatasoft.com/explore/dataset/geonames-all-cities-with-a-population-1000/table/?disjunctive.cou_name_en&sort=name
    protected int gID;
    protected String name;
    protected String country;
    protected int population;


    public int getgID() {
        return gID;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    //Patrón FactoryMethod
    public static City makeCity(String[] data) {
        return new City(data);
    }

    //Inicializar valores si la entrada es incorrecta
    {
        gID = 0;
        name = "null";
        country = "null";
        population = 0;

    }

    //This class accepts a String[] that contains gID, name, country and population
    private City(String[] data) {
        initialize(data);
    }

    protected int initialize(String[] data) {
        if (data.length == 4) {
            try {
                gID = Integer.parseInt(data[0]);
                name = data[1];
                country = data[2];
                population = Integer.parseInt(data[3]);
                return 1;
            } catch (Exception e) {
                return 0;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "City{}";
    }
}
