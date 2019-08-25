package by.etc.module3.regular_expressions.task1;

import java.util.regex.*;

public class SortWords {
    public void sortText(String text) {

        Matcher matcher = Pattern.compile("([^.!?]+[.!?])").matcher(text);
        while (matcher.find()) {
            String[] words = matcher.group(1).split(" ");
            for (int i = 0; i < words.length; i++) {
                words[i] = words[i].replaceAll("[,.]", "");
            }

            String tmp;

            for (int i = words.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (words[j].trim().length() > words[j + 1].trim().length()) {
                        tmp = words[j];
                        words[j] = words[j + 1];
                        words[j + 1] = tmp;
                    }
                }
            }
            String str = String.join(" ", words);
            System.out.println(str);
        }
    }
}
