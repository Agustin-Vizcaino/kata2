import java.io.File;

public interface Loader {
    boolean exists(String path);
    File loadPath(String path);
}
