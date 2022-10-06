package programmer.zaman.now;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {23,19,90,88,77,1,2,9,5};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers,1));
        System.out.println(Arrays.binarySearch(numbers, 90));

        int[] result = Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers,0,3);
        System.out.println(Arrays.toString(result2));
    }
}
