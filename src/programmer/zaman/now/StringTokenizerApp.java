package programmer.zaman.now;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
//        String Tokenizer is lazy...
        StringTokenizer stringTokenizer = new StringTokenizer("Abdurahman Rizal", "-");

        while(stringTokenizer.hasMoreTokens()){
           String value = stringTokenizer.nextToken();
           System.out.println(value);
        }
    }
}
