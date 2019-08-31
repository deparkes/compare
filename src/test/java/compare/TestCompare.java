package compare;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
TODO: Need to introduce a scorer and a thresholder which actually applies the threshold.
TODO: These can presumably be separate things outside of the compare class?
*/

public class TestCompare {

    @Test
    public void testCompareCreate(){
        Compare compare = new Compare();
        assert true;
    }

    @Test
    public void testTwoWordsTheSame(){
        Compare compare = new Compare();
        boolean areTheSame = compare.compare("word", "word");
        assertTrue(areTheSame);

    }

    @Test
    public void testTwoWordsNotTheSame(){
        Compare compare = new Compare();
        Assertions.assertFalse(compare.compare("word", "different word"));
    }


    @Test
    public void testTwoWordsWithinThreshold(){
        Compare compare = new Compare();
        Assertions.assertTrue(compare.compare("word", "wurd", 0.7));
    }

    @Test
    public void testTwoWordsOutOfThreshold(){
        Compare compare = new Compare();
        Assertions.assertFalse(compare.compare("word", "x", 0.1));
    }


}
