import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccurrencesTest1 {


    CountOccurrences tot=new CountOccurrences();

    String s="vehical";
    @Test
    public void occurTest()
    {
        int result=tot.total(s);
        assertEquals(1,result);
    }

}