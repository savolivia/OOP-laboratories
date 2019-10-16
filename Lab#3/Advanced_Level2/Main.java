package Advanced_Level2;

public class Main {
    static String myText = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa convallis urna. Quisque eee eee eee eee ut nisi. Donec mi odio, faucibus at, scelerisque quis.";

    public Main() {
    }

    public static void main(String[] args) {
        WordsOperations wordManipulation = new WordsOperations();
        wordManipulation.mostOftenWords(myText);
        wordManipulation.LongestWord(myText);
    }
}
