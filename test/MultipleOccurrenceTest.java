import org.junit.Test;

import static org.junit.Assert.*;
import java.lang.StringBuilder;

public class MultipleOccurrenceTest {

    MultipleOccurrence ob=new MultipleOccurrence();
    String s="vijay vijay";
    String find="ja";
    @Test
    public void multiple()
    {
        String result=ob.isRun(find,s);
        assertEquals("2-4,8-10",result);
    }
}
