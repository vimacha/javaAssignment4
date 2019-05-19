import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {
    public boolean isGet(String find,String s){
        Pattern p = Pattern.compile(find);
        Matcher m = p.matcher(s);

        if (m.find()) {
            return true;
        } else {
            return false;
        }
    }
}