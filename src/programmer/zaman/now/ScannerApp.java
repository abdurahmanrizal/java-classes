package programmer.zaman.now;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama : ");

        String name = scanner.nextLine();

//        Input angka
        System.out.print("Umur : ");
        Integer age = scanner.nextInt();

        System.out.println("Halo, " + name + " umur " + age);
    }
}
