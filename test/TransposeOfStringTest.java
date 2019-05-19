import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeOfStringTest {
    TransposeOfString str=new TransposeOfString();
    String s="god is great";
@Test
    public void transposeString(){
    String result=str.transpose(s);
    assertEquals("dog si taerg",result);
    }

}
