package programmer.zaman.now;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 100;
        Double doubleValue = intValue.doubleValue();
        Short shortValue = intValue.shortValue();

        System.out.println(shortValue);

//      CONVERT STRING TO NUMBER
        String strNumber = "10_000".replaceAll("_","");

//      CONVERT TO PRIMITIVE NUMBER, WE CAN USE PARSE..
        int intNumberPrimitive = Integer.parseInt(strNumber);
//      CONVERT TO NON PRIMITIVE NUMBER, WE CAN USE VALUEOF
        Integer intNumberNonPrimitive = Integer.valueOf(strNumber);
        System.out.println(intNumberPrimitive);
        System.out.println(intNumberNonPrimitive);
    }
}
