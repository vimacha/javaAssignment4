import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurrence {


    public String isRun(String find,String s){

        String text = s;

        String patternString = find;

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        String result="";
        while (matcher.find()) {

            result =result+matcher.start() + "-" + matcher.end()+",";

        }
        return result.substring(0,result.length()-1);
    }
}
