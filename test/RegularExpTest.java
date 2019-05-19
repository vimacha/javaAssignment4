
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpTest {

    RegularExp ob=new RegularExp();
    String s="hi this is test";
    String find="test";
    @Test
    public void Name()
    {
        boolean res=ob.isGet(find,s);
        assertEquals(true,res);
    }

}