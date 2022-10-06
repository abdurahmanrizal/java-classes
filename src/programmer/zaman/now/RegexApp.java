package programmer.zaman.now;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String name = "Abd1urah3man Rizal Aaa";

        Pattern pattern = Pattern.compile("^A[a-zA-Z]*[0-9][a-zA-Z]*");
        Matcher matcher = pattern.matcher(name);

        while (matcher.find()) {
            String result = matcher.group();
            System.out.println(result);
        }

    }
}
