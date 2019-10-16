package Basic_Level;

public class WordCount {
    public String text;

    public WordCount() {
    }

    public String WordCount(String text) {
        this.text = text;
        String[] words = this.text.split("[\\s+]");

        for(int i = 0; i < words.length; ++i) {
            if (words[i].equals(",") || words[i].equals(".") || words[i].equals("!") || words[i].equals("?") || words[i].equals("...")) {
                words = removeTheElement(words, i);
                --i;
            }
        }

        System.out.println("Total words: " + words.length);
        return this.text;
    }

    public static String[] removeTheElement(String[] arr, int index) {
        if (arr != null && index >= 0 && index < arr.length) {
            String[] anotherArray = new String[arr.length - 1];
            int i = 0;

            for(int var4 = 0; i < arr.length; ++i) {
                if (i != index) {
                    anotherArray[var4++] = arr[i];
                }
            }

            return anotherArray;
        } else {
            return arr;
        }
    }
}
