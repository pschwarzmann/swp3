package S04_CaeserVerschluesselung;
import java.util.Scanner;
public class S04_CaeserVerschluesselung {


    public static void main(String[] args) {
        String result = encrypt(1, "Hallo");
        System.out.println(result);

    }
    public static String encrypt(int shift, String StringAuslesung) {

        String AusgelesenerString = "";
        StringAuslesung = "";


        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------Menue---------------------------");
        System.out.println("Geben Sie den Text ein den Sie verschlüsseln wollen: ");

        StringAuslesung = scanner.next();

        System.out.println("---------------------------Menue---------------------------");
        System.out.println("Um wie viel möchten Sie den text verschieben: ");
        shift = scanner.nextInt();

        char[] inputData = StringAuslesung.toCharArray();

        for (int i = 0; i < inputData.length; i++) {
            int letter = inputData[i] + shift;
            AusgelesenerString += Character.toString(letter);
        }

        return AusgelesenerString;



    }
}
