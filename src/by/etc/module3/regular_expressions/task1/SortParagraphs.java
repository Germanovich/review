package by.etc.module3.regular_expressions.task1;

public class SortParagraphs {
    static void sortParagraphs(String text) {
        String s[] = text.trim().split("\n");
        int arr[] = new int[s.length];
        int k[] = new int[s.length];

        for (int i = 0; i <= s.length - 1; i++) {
            int t = 0;
            String w[] = s[i].trim().split(" ");
            for (int j = 0; j <= w.length - 1; j++) {
                t++;
            }
            arr[i] = t;
            k[i] = t;
        }

        int min;
        int bugger;
        int index;
        for (int i = 0; i <= arr.length - 1; i++) {
            min = arr[i];
            index = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            if (index != i) {
                bugger = arr[i];
                arr[i] = arr[index];
                arr[index] = bugger;
            }
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 1; j++) {
                if (arr[i] == k[j]) {
                    System.out.println(s[j]);
                }
            }
        }
    }
}
