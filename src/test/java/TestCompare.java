import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        assertFalse(compare.compare("word", "different word"));
    }


    @Test
    public void testTwoWordsWithinThreshold(){
        Compare compare = new Compare();
        assertTrue(compare.compare("word", "wurd", 0.9));
    }



}
