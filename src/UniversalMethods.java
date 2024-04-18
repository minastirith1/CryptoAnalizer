public class UniversalMethods {

    public static String toCypherText(String sourceText, int offset) {
        StringBuilder resText = new StringBuilder();

        for (char curChar : sourceText.toCharArray()) {
            resText.append(cypherSymbol(curChar, offset));
        }

        return resText.toString();
    }

    public static char cypherSymbol(char symbol, int offset) {
        int index = Constants.Alphabet.indexOf(symbol);

        int targetPosition = index + offset;

        if (targetPosition < 0) { //Расшифровка
            targetPosition = Constants.Alphabet.length() - getPureIndex(Math.abs(targetPosition));
        } else {  //Зашифровка
            targetPosition = getPureIndex(Math.abs(targetPosition));
        }

        return Constants.Alphabet.charAt(targetPosition);
    }

    //Находим индекс, если сдвиг символа происходит дальше длины алфавита
    public static int getPureIndex(int targetPosition) {
        int alphabetLength = Constants.Alphabet.length();

        if (targetPosition > alphabetLength) {
            targetPosition = targetPosition % alphabetLength;
        }

        return targetPosition;
    }
}
