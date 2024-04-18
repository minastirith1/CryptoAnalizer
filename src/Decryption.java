import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decryption {

    public static void decrypting() throws IOException {
        System.out.println("Добавьте путь к файлу, в котором хранится шифр:");
        BufferedReader consolePathFromToRead = new BufferedReader(new InputStreamReader(System.in));
        String pathFrom = consolePathFromToRead.readLine();

        System.out.println("Добавьте путь к файлу, в который нужно сохранить расшифрованный текст:");
        BufferedReader consolePathOut = new BufferedReader(new InputStreamReader(System.in));
        String pathOut = consolePathOut.readLine();

        System.out.println("Введите ключ в виде целого числа для дешифрования:");
        BufferedReader consKey = new BufferedReader(new InputStreamReader(System.in));
        int key = Integer.parseInt(consKey.readLine());

        //Делаем чтение из файла и сохраняем в виде строки contentFromFile
        String contentFromFile = ReadAndWriteWithFile.readFromFile(pathFrom);

        String cypherText = UniversalMethods.toCypherText(contentFromFile, key * (-1)); //Делаем дешифровку текста, умножая ключ на отрицательную единицу для обратного сдвига символов

        ReadAndWriteWithFile.writeToFile(cypherText, pathOut);
    }
}
