
import java.util.*;
public class CountOccurrences {
    public int total(String s)
    {
        int result = s.length() - s.replaceAll("h", "").length();

        return result;
    }
}
