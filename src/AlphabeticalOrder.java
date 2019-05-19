import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {
    public String alphabetic(String s)
    {
        String string = s.replaceAll("\\s+","");
        char[] temp = string.toCharArray();

        Arrays.sort(temp);

        String sort = new String(temp);

        String res= sort;

        return res;

    }
}