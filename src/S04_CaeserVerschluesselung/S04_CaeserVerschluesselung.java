package S04_CaeserVerschluesselung;
import java.util.Scanner;

public class S04_CaeserVerschluesselung {

    public static void main(String[] args) {
        String result = encrypt(1, "Hallo Welt");
        System.out.println(result);
    }

    public static String encrypt(int shift, String stringAuslesung) {
        StringBuilder ausgelesenerString = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------Menue---------------------------");
        System.out.println("Geben Sie den Text ein den Sie verschlüsseln wollen: ");
        stringAuslesung = scanner.nextLine();

        System.out.println("---------------------------Menue---------------------------");
        System.out.println("Um wie viel möchten Sie den Text verschieben: ");
        shift = scanner.nextInt();

        for (int i = 0; i < stringAuslesung.length(); i++) {
            char letter = stringAuslesung.charAt(i);

            if (Character.isLetter(letter)) {
                char base = Character.isUpperCase(letter) ? 'A' : 'a';
                letter = (char)(((letter - base + shift) % 26 + 26) % 26 + base);
            }

            ausgelesenerString.append(letter);
        }

        return ausgelesenerString.toString();
    }
}