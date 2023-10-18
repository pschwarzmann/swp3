package S05_StringHelper;

public class StringHelper {
    public static int countLetters(String inputString, char targetChar) {
        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String input = "Hallo Welt!";
        char target = 'l';
        int ergebnis = countLetters(input, target);

        System.out.println("Der Char '" + target + "' kommt " + ergebnis + " mal im text vor!");
    }
}