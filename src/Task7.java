import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
                String str;
                Scanner in = new Scanner(System.in);
                System.out.println("Text input:") ;
                str = in.nextLine();
                String[] words = str.split(" ");
                int i;
                for (i = 0; i < words.length; ++i)
                    if (words[i].startsWith("A"))
                        if (words[i].endsWith("A"))
                            System.out.println(words[i]);
            }
        }