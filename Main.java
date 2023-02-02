//Tyler Learned

import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        Reader reader = new Reader();
        ArrayList<String> words = reader.getWords();
        ArrayList<String> clues = reader.getClues();

        Tokenizer tokenizer = new Tokenizer();
        ArrayList<String> tokens = tokenizer.tokenize(words);

        PuzzlePrint puzzlePrint = new PuzzlePrint();
        puzzlePrint.printTokens(tokens);
        puzzlePrint.printClues(clues);
        puzzlePrint.printAnswerKey(words);
    }
}
