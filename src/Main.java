import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        printMainMenu();

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        int consInput;
        while (true) {
            consInput = Integer.parseInt(console.readLine());
            if (consInput == 1) {
                Encryption.encrypting();
            } else if (consInput == 2) {
                Decryption.decrypting();
            } else {
                System.out.println("Введите целое число от 1 до 2");
                break;
            }

        }

    }

    public static void printMainMenu() {
        System.out.println(
                """
                        Выберите режим работы программы:
                        Введите 1, если хотите зашифровать текст.
                        Введите 2, если хотите расшифровать текст.
                        """);
    }
}