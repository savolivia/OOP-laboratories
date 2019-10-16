package Basic_Level;


public class  Main {
    static String myText = "Aenean tempor sed sem et feugiat. Curabitur ac odio tincidunt, semper tortor at, lacinia nibh. Proin et posuere neque. Morbi ut interdum sapien. Suspendisse dapibus lacinia quam rutrum varius. Curabitur elementum in quam sit amet mattis. Mauris feugiat malesuada nisi, sit amet molestie eros dapibus id. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed sed nisi neque. In sem arcu, imperdiet non lectus vitae, tincidunt venenatis ligula.";
    static String myText2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus sollicitudin nec mi non placerat. Proin ornare metus eros, non tristique ex porttitor vel. Etiam commodo pretium tellus eu viverra. Donec eget enim nibh. In eleifend orci leo, posuere feugiat arcu mollis at. Fusce vitae dapibus nulla. Donec ut fringilla nunc. In pellentesque nisi eget lectus malesuada, eu gravida velit ullamcorper. Cras euismod odio quis magna eleifend, quis laoreet eros finibus. Proin consectetur ex ac bibendum aliquam. Vivamus faucibus neque a risus euismod, a eleifend diam rhoncus. Integer egestas neque augue. Etiam euismod eros et finibus dictum. Vestibulum mollis sed ligula in convallis. Curabitur in aliquam leo, ac laoreet ante." ;


 public Main() {

}


  public static void main(String[] args) {
        WordCount countWords = new WordCount();
        SentenceCount countSentences = new SentenceCount();
        countWords.WordCount(myText);
        countSentences.SentenceCount(myText2);
    }
}