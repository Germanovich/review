package by.etc.module4.aggegation_and_composition.task1;

import by.etc.module4.aggegation_and_composition.task1.components.Sentence;
import by.etc.module4.aggegation_and_composition.task1.components.Text;
import by.etc.module4.aggegation_and_composition.task1.components.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на консоль
 * текст, заголовок текста.
 */

public class AggregationAndComposition1 {
    final static String newLine = "\n";

    public static void main(String[] args) {

        Text text = new Text("Text?");
        List<Word> words = new ArrayList<Word>();
        words.add(new Word("Первое"));
        words.add(new Word("предложение"));
        words.add(new Word("из"));
        words.add(new Word("этих"));
        words.add(new Word("слов."));
        Sentence sentence1 = new Sentence(words);
        text.append(sentence1);
        System.out.println("Text: " + newLine + text.toString());

        Sentence sentence2 = new Sentence();
        Word word1 = new Word("Эти");
        Word word2 = new Word("слова");
        Word word3 = new Word("создают");
        Word word4 = new Word("еще");
        Word word5 = new Word("одно");
        Word word6 = new Word("предложение.");
        sentence2.append(word1).append(word2).append(word3).append(word4).append(word5).append(word6);
        text.append(sentence2);

        List<Word> word = new ArrayList<Word>();
        addText(word);
        Sentence sentence3 = new Sentence(word);
        text.append(sentence3);

        System.out.println("Text: " + newLine + text.getBody());

        System.out.print("\nText header: " + newLine + text.getHeader());
    }

    private static void addText(List<Word> word) {
        Scanner in = new Scanner(System.in);
        boolean check;
        System.out.print("Enter words (exit - $): ");
        do {
            String checkWord = in.nextLine();
            if (!checkWord.contains("$")) {
                word.add(new Word(checkWord));
                check = true;
            } else {
                check = false;
            }
        } while (check);
        in.close();
    }
}