package HomeWorkPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        String [] words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};

        List<String> wordList= new ArrayList<>();
//        wordList.add(words[0]);
//        wordList.add(words[1]);
//        wordList.add(words[2]);
//        wordList.add(words[3]);
//        wordList.add(words[4]);
//        wordList.add(words[5]);
//        wordList.add(words[6]);
//        wordList.add(words[7]);
//        wordList.add(words[8]);
//        for (int i=0; i<words.length; i++){
//            wordList.add(words[i]);
//        }
//        System.out.println(wordList);      EASIEST WAY TO ADD ARRAY INTO A LIST;
       List<String> wordsList1 = Arrays.asList(words);
        System.out.println("wordsList" + wordsList1);






    }
}
