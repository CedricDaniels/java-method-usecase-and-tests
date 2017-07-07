package lang.test;

import org.junit.Assert;
import org.junit.Test;

public class StringTest {

    @Test
    public void replaceTest(){
        String content = "I love you !";
        String replacement = content.replaceAll("you","you baby");
        Assert.assertEquals("I love you baby !",replacement);


    }
}
