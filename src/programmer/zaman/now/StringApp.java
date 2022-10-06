package programmer.zaman.now;

public class StringApp {
    public static void main(String[] args) {
        String name = "Abdurahman Rizal";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());

        String[] nameSplit = name.split(" ");
        for (var value: nameSplit) {
            System.out.println(value);
        }

        System.out.println(name.startsWith("Rahman"));
        System.out.println(name.endsWith("Rizal"));

        System.out.println("".isBlank());
        System.out.println(" ".isEmpty());
    }
}
