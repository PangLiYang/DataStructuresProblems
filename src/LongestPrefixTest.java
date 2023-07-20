import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LongestPrefixTest {

    @Test
    public void addTest() {
        LongestPrefix myTries = new LongestPrefix();
        myTries.addKey("apple");
        myTries.addKey("aps");
    }

    @Test
    public void questionTest() {
        LongestPrefix myTries = new LongestPrefix();
        myTries.addKey("cryst");
        myTries.addKey("tries");
        myTries.addKey("cr");

        String input01 = myTries.LongestPrefixOf("crystal");
        String exp01 = "cryst";

        String input02 = myTries.LongestPrefixOf("crys");
        String exp02 = "crys";

        Assert.assertEquals(exp01, input01);
        Assert.assertEquals(exp02, input02);

    }


}
