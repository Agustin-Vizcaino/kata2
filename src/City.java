public class City {
    //Dataset source: https://public.opendatasoft.com/explore/dataset/geonames-all-cities-with-a-population-1000/table/?disjunctive.cou_name_en&sort=name
    static int gID;
    static String name;
    static String country;
    static int population;

    public City(String data) {
    }

    protected void extractData(String data) {

    }

    @Override
    public String toString() {
        return "City{}";
    }
}
