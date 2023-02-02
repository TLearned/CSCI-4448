//Tyler Learned

import java.util.ArrayList;
import java.util.Collections;

public class Reader 
{
    String words[] = {"human","zebra","shark","punch","death","robot"};
    String clues[] = {"homosapien","black and white striped","the meg","fist hit","not alive anymore","transformer"};

    //words Array to wordList ArrayList
    public ArrayList<String> getWords()
    {
        ArrayList<String> wordList = new ArrayList<>();
        
        for(int i=0;i<words.length;i++)
        {
            wordList.add(words[i].toUpperCase());
        }
        
        return wordList;
    }

    //clues Array to clueList ArrayList
    public ArrayList<String> getClues()
    {
        ArrayList<String> clueList = new ArrayList<>();
        Collections.addAll(clueList,clues);
        
        return clueList;
    }
}