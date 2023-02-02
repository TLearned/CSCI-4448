//Tyler Learned

import java.util.ArrayList;
import java.util.Collections;

public class Tokenizer 
{
     //words in wordList into lengths of two and a new shuffled List
    public ArrayList<String> tokenize(ArrayList<String> wordList)
    {
        ArrayList<String> tokenList = new ArrayList<>();
        
        for(String word: wordList){
            for(int i = 0; i < word.length(); i += 2)
            {
                if(i + 3 < word.length())
                {
                    tokenList.add(word.substring(i, i + 2));
                }
                
                else
                {
                    tokenList.add(word.substring(i));
                    break;
                }
            }
        
        }

        Collections.shuffle(tokenList);

        return tokenList;
    }
}