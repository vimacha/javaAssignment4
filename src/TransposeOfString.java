import java.util.Scanner;

public class TransposeOfString {
   public String transpose(String s)
   {
        String[] string = s.split(" ");
        String temp="";

        for(int i=0;i<string.length;i++) {
            StringBuffer sbf = new StringBuffer(string[i]);
            temp += sbf.reverse() + " ";
        }

      String result=temp.trim();
      return result;

    }
}
