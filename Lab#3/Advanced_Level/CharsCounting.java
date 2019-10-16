package Advanced_Level;

public class CharsCounting {
    public String text;
    public int letters = 0;
    public int vowels = 0;
    public int consonants = 0;

    public CharsCounting() {
    }

    public int countLetters(String myText) {
        this.text = myText;
        System.out.println("Total symbols: " + this.text.length());

        for(int i = 0; i < this.text.length(); ++i) {
            if (Character.isLetter(this.text.charAt(i))) {
                ++this.letters;
            }
        }

        System.out.println("Total letters: " + this.letters);
        return this.letters;
    }

    public int countVowels(String myText) {
        this.text = myText;

        for(int i = 0; i < this.text.length(); ++i) {
            if (this.text.charAt(i) == 'a' || this.text.charAt(i) == 'e' || this.text.charAt(i) == 'i' || this.text.charAt(i) == 'o' || this.text.charAt(i) == 'u') {
                ++this.vowels;
            }
        }

        System.out.println("Total vowels: " + this.vowels);
        return this.vowels;
    }

    public int countConsonants(String myText) {
        this.text = myText;

        for(int i = 0; i < this.text.length(); ++i) {
            if (Character.isLetter(this.text.charAt(i)) && this.text.charAt(i) != 'a' && this.text.charAt(i) != 'e' && this.text.charAt(i) != 'i' && this.text.charAt(i) != 'o' && this.text.charAt(i) != 'u') {
                ++this.consonants;
            }
        }

        System.out.println("Total consonants: " + this.consonants);
        return this.consonants;
    }
}