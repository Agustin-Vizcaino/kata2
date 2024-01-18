import java.io.BufferedReader;
import java.io.File;

public abstract class CSVLoader {
    private String path;
    private File file;

    public CSVLoader() {}

    public CSVLoader(String path) {

    }

    public boolean exists(String path) {
        return new File(path).exists();
    }

    public File loadPath(String path) {
        file = new File(path);
        if (true) return null;
        return null;
    }
}
