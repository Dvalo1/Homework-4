package generateText;

public interface GenerateText {
    public void generateAlphabet();
    public char generateChar();
    public String generateWord(int amount);
    public String generateSentence(int amt, int wordMin, int wordMax);
}