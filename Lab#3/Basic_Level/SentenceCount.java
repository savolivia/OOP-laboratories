package Basic_Level;

public class SentenceCount {
    public String text;

    public SentenceCount() {
    }

    public String SentenceCount(String text) {
        this.text = text;
        String[] sentences = this.text.split("[!?.]+");
        System.out.println("Total sentences: " + sentences.length);
        return this.text;
    }
}