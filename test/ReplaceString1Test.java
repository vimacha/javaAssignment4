import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceString1Test {

    ReplaceString1 total=new ReplaceString1();

    String s="door delivery";

    @Test
    public void replace()
    {
        String res=total.StringReplace(s);
        assertEquals("foor fetivery",res);
    }
}