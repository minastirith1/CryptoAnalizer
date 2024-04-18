import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Encryption {

    public static void encrypting() throws IOException {
        System.out.println("Введите путь к файлу, который требуется зашифровать");
        BufferedReader consolePathFromToRead = new BufferedReader(new InputStreamReader(System.in));
        String pathFromRead = consolePathFromToRead.readLine();

        System.out.println("Введите путь к файлу,в котором будет храниться зашифрованный текст");
        BufferedReader consolePathOutWrite = new BufferedReader(new InputStreamReader(System.in));
        String pathOutWrite = consolePathOutWrite.readLine();

        System.out.println("Введите ключ для шифрования");
        BufferedReader consoleKey = new BufferedReader(new InputStreamReader(System.in));
        int key = Integer.parseInt(consoleKey.readLine());

        String contentFromFile = ReadAndWriteWithFile.readFromFile(pathFromRead);

        //Передаем в методом текст(в виде строки) и ключ для шифрования, получаем Стрингу
        String cypherText = UniversalMethods.toCypherText(contentFromFile, key);

        //Записываем зашифрованный текст в другой файл
        ReadAndWriteWithFile.writeToFile(cypherText, pathOutWrite);

    }



}
