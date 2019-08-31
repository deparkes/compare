package compare;

import me.xdrop.fuzzywuzzy.FuzzySearch;

public class Compare {
    public Compare(){

    }


    public boolean compare(String word1, String word2){
        return word1.equals(word2);
    }

    public boolean compare(String word1, String word2, double threshold){
        double ratio = (double)FuzzySearch.ratio(word1, word2);
        return (ratio/100 > threshold);
    }
}
