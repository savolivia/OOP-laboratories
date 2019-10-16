package Advanced_Level;

public class Main {
    static String myText = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur";

    public Main() {
    }

    public static void main(String[] args) {
        CharsCounting countSymbols = new CharsCounting();
        countSymbols.countLetters(myText);
        countSymbols.countVowels(myText);
        countSymbols.countConsonants(myText);
    }
}
