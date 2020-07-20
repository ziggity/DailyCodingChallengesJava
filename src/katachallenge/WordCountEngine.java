package katachallenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Word Count Engine
//Implement a document scanning function wordCountEngine, which receives a string documentand returns a list of all unique words in it and their number of occurrences, sorted by the number of occurrences in descending order. If two or more words have the same count, they should be sorted according to their order in the original sentence. Assume that all letters are in the english alphabet. You function should be case-insensitive, so for instance, the words “Perfect” and “perfect” should be considered the same word.
//The engine should strip out punctuation (even in the middle of a word) and use whitespaces to separate words.
//Analyze the time and space complexities of your solution. Try to optimize for the time while keeping a polynomial space complexity.
//Examples:
//input:  document = "Practice makes perfect. you'll only
//                  get Perfect by practice. just practice!"
//output: [ ["practice", "3"], ["perfect", "2"],
//        ["makes", "1"], ["youll", "1"], ["only", "1"], 
//        ["get", "1"], ["by", "1"], ["just", "1"] ]


public class WordCountEngine {

    public static void main(String[] args) {
        String document = "Practice makes perfect. you'll only get Perfect by practice. just practice !";

        String[][] output=wordCountEngine(document);

        Arrays.stream(output).forEach(arr->{
            System.out.println(arr[0]+"->"+arr[1]);
        });

    }

    static String[][] wordCountEngine(String doc) {
        String[] allWords = doc.toLowerCase().split("[^a-zA-Z']+");
        LinkedHashMap<String, Integer> counter = new LinkedHashMap<>();

        Arrays.stream(allWords).forEach(w -> {
            counter.compute(w, (key, value) -> value == null ? 1 : value + 1);
        });
        System.out.println(counter);


        TreeMap<Integer, HashSet<String>> sortedMap = new TreeMap<>(Collections.reverseOrder());
        Arrays.stream(allWords).forEach(w -> {
            int i = counter.get(w);
            if (sortedMap.containsKey(i)) {
                HashSet<String> set = sortedMap.get(i);
                set.add(w);
                sortedMap.put(i, set);
            } else {
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(w);
                sortedMap.put(i, hashSet);
            }

        });

        System.out.println(sortedMap);
        String[][] result=new String[counter.size()][2];
        int iterator=0;
        for(Map.Entry<Integer,HashSet<String>> entry:sortedMap.entrySet()){
            int count=entry.getKey();

            for(Map.Entry<String,Integer> e:counter.entrySet()){
                if(e.getValue()==count){
                    String[] res=new String[2];
                    res[0]=e.getKey();
                    res[1]=String.valueOf(count);
                    result[iterator]=res;
                    iterator++;
                }

            }
        }

        return result;
    }
}