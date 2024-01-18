import java.io.*;

public abstract class DataFileReader {
    private DataFileReader() {
    }

    public static BufferedReader readPath(String path) throws FileNotFoundException {
        try {
            File file = Loader.loadPath(path);
            if (file.exists()) {
                return new BufferedReader(new FileReader(file));
            }
            throw new IOException("File does not exist");
        } catch (IOException e) {
            System.out.println(e.getCause());
            return null;
        }
    }
}
