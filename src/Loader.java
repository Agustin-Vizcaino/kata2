import java.io.File;

public abstract class Loader {

    private Loader() {}

    public static File loadPath(String path) {
        return new File(path);
    }
}
