package programmer.zaman.now;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerApp {
    public static void main(String[] args) {
        BigInteger number1 = new BigInteger("1000000000000000000");
        BigInteger number2 = new BigInteger("1000000000000000000");

//        UNTUK MENAMBAHKAN DATA BIGINTEGER
        BigInteger number3 = number1.add(number2);
        System.out.println(number3);
        BigDecimal number4 = new BigDecimal("5000000000000000000");
        BigDecimal number5 = new BigDecimal("1000000000000000000");

        BigDecimal number6 = number4.subtract(number5);
        System.out.println(number6);
    }
}
