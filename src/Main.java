import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Перше завдання.");
        System.out.println("2. Друге завдання.");
        System.out.println("3. Вихід.");
        System.out.print("Введіть число :");
        int num = scanner.nextInt();
        while (num != 5) {
            switch (num) {
                case 1:
                    Task_1();
                    break;
                case 2:
                    Task_2();
                    break;
                default:
                    System.out.println("Не вірно введене число!!! Повторіть спробу :");
                    break;
            }
            System.out.println("1. Перше завдання.");
            System.out.println("2. Друге завдання.");
            System.out.println("3. Вихід.");
            System.out.print("Введіть число : ");
            num = scanner.nextInt();
        }
    }
    public static void Task_1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть текст ");
        String text = in.nextLine();
        String[] word = text.split(" ");
        String longword = "";
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > longword.length())
                longword = word[i];
        }
        System.out.println("Саме довше слово: '" + longword + "', воно містить " + longword.length() + " букв.");
    }
    public static void Task_2() {
        Pattern pattern = Pattern.compile("^[A-z]+$");
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть текст \n");
        String text = in.nextLine();
        String[] word = text.split(" ");
        List<String> rightWords = new ArrayList<>();

        for (int i = 0; i < word.length; i++) {
            Matcher matcher = pattern.matcher(word[i]);
            if(!matcher.matches()) {
                System.out.println("Слово " + word[i] + "  не видалено!");
               rightWords.add(word[i]);
            }
            else
                System.out.println("Слово " + word[i] + "  видалено!");
        }
        System.out.println("Cлова,  що  не складаються  тільки  з латинських літер: ");
        for(String w : rightWords) {
            System.out.print( w + " ");
        }
        System.out.println();
    }
}
