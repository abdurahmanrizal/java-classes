package programmer.zaman.now;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",","[","]");
        stringJoiner.add("Abdurahman");
        stringJoiner.add("Felly");
        stringJoiner.add("Bebby");

        String fullArr = stringJoiner.toString();
        System.out.println(fullArr);
    }
}
