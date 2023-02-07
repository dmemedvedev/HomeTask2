import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        String someText = "Card number is 4485-1176-4212-5685";

        String[] words = someText.split(" ");
        String regExp = "[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}";
        for (String word : words) {
            if (word.matches(regExp)) {
                String cardNumber = word.substring(0, 19);
                System.out.println(cardNumber);
            }
        }
    }
}
