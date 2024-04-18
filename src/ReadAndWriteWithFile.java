import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadAndWriteWithFile {

    public static String readFromFile(String path) throws IOException {
        Path pathForRead = Path.of(path);
        try {
           return Files.readString(pathForRead, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new IOException("Ошибка при чтении из файла: " + e.getMessage());
        }
    }

    public static void writeToFile(String text, String path) {
        Path pathForWrite = Path.of(path);
        try {
            Files.writeString(pathForWrite, text);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
