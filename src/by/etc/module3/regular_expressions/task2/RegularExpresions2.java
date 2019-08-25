package by.etc.module3.regular_expressions.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 2. Дана строка, содержащая следующий текст (xml-документ):
 * <notes>
 * <note id="1">
 * <to>Вася</to>
 * <from>Света</from>
 * <heading>Напоминание</heading>
 * <body>Позвони мне завтра!</body>
 * </note>
 * <note id="2">
 * <to>Петя</to>
 * <from>Маша</from>
 * <heading>Важное напоминание</heading>
 * <body/>
 * </note>
 * </notes>
 * <p>
 * Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип(открывающий тек,
 * закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
 * нельзя.
 */

public class RegularExpresions2 {
    public static void main(String[] args) {
        String testHtml = "<notes>" +
                "<note id = \"1\">" +
                "<to>Вася</to>" +
                "<from>Света</from>" +
                "<heading>Напоминание</heading>" +
                "<body>Позвони мне завтра!</body>" +
                "</note>" +
                "<note id = \"2\">" +
                "<to>Петя</to>" +
                "<from>Маша</from>" +
                "<heading>Важное напоминание</heading>" +
                "</body>" +
                "</note>" +
                "</notes>";

        String tag;
        String checkTag = " ";
        String bufferTag = "<note id = \"1\">";

        Pattern pattern = Pattern.compile("<(.*?)>");
        Matcher matcher = pattern.matcher(testHtml);
        while (matcher.find()) {
            tag = matcher.group();
            int check = tag.indexOf("id");
            if (check != -1) {
                bufferTag = tag;
                checkTag = tag.replaceAll("[ =\"\"]", "");
                checkTag = checkTag.replaceAll("[0-9]", "");
                checkTag = checkTag.replaceAll("id", "");
            }
            tag = tag.replaceAll("[ =\"\"<>]", "");
            tag = tag.replaceAll("[0-9]", "");
            tag = tag.replaceAll("id", "");

            check = tag.indexOf('/');

            if (check == -1) {
                Pattern tagPattern = Pattern.compile("<(" + tag + ")(( id = \"[1-9]\")|)>(.*?)</" + tag + "");
                Matcher m = tagPattern.matcher(testHtml);
                m.find(); // true
                String tagname = m.group(1);// tag
                String attributes = m.group(2);
                String content = m.group(4);
                content = content.replaceAll("[<[\\w]\"=/>]", "");
                content = content.replaceAll("(\\p{Ll})(\\p{Lu})", "$1; $2");
                System.out.println("\nTag Name   : " + tagname + "[OPEN]");
                System.out.println("Attributes : " + attributes);
                System.out.println("Content    : " + content + "\n");
            } else {
                String openTag = tag.replaceAll("/", "");
                openTag = "<" + openTag + ">";

                if (openTag.equals(checkTag)) {
                    openTag = bufferTag;
                }
                tag = "<" + tag + ">";
                int sizeOpenTag = testHtml.indexOf(openTag);
                int sizeCloseTag = testHtml.indexOf(tag);
                String testBuffer;
                check = testHtml.indexOf(openTag);

                if (check == -1) {
                    testBuffer = testHtml.substring(0, sizeCloseTag);
                    testBuffer += testHtml.substring(sizeCloseTag + tag.length());
                } else {
                    testBuffer = testHtml.substring(0, sizeOpenTag);
                    testBuffer += testHtml.substring(sizeCloseTag + tag.length());
                }

                testHtml = testBuffer;
                System.out.println("Tag Name   : " + tag + "[CLOSE]");
            }
        }
    }
}
