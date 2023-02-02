//Tyler Learned

import java.util.ArrayList;

public class PuzzlePrint 
{
    public void printTokens(ArrayList<String> tokenizedList)
    {
        System.out.println("Tokens ");

        for(int i = 0; i<tokenizedList.size(); i++)
        {
            System.out.print(tokenizedList.get(i) + "\t");
            
            if((i + 1) % 4 == 0)
            {
                System.out.println();
            }
        }
    }

    public void printClues(ArrayList<String> clueList)
    {
        System.out.println();

        System.out.println("Clues ");
        
        for(String clue: clueList)
        {
            System.out.println(clue);
        }
    }

    public void printAnswerKey(ArrayList<String> wordList)
    {
        System.out.println();

        System.out.println("Answer Key ");
        
        for(String word: wordList)
        {
            System.out.println(word);
        }
    }
}