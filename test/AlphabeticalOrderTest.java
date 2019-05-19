import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabeticalOrderTest {

    AlphabeticalOrder a=new AlphabeticalOrder();
    String s="vijay";
    @Test
    public void alpha()
    {
        String res=a.alphabetic(s);
        assertEquals("aijvy",res);
    }

}