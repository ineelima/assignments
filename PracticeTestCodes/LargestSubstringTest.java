import com.dwivedi.strings.LongestSubstring;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LongestSubstringTest{

    @Test
    public void testCase_01(){
        String subString=LongestSubstring.findString("abca");
        Assert.assertEquals(subString,"abc");
    }
    @Test
    public void testCase_02(){
        String subString=LongestSubstring.findString("");
        Assert.assertNull(subString);
    }
    @Test
    public void testCase_03(){
        String subString=LongestSubstring.findString("fwwwfde");
        Assert.assertEquals(subString,"wfde");
    }
    @Test
    public void testCase_04() {
        String subString = LongestSubstring.findString("Its a sunny day");
        Assert.assertEquals(subString, "Its a");
    }
    @Test
    public void testCase_05() {
        String subString = LongestSubstring.findString("zasDErDdfrs");
        Assert.assertEquals(subString, "zasDEr");
    }
    @Test
    public void testCase_06() {
        String subString = LongestSubstring.findString("Hi!!,How Are You");
        Assert.assertEquals(subString, "!,How Are");
    }
}

