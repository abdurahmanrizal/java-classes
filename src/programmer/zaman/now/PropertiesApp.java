package programmer.zaman.now;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try{
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));
            properties.load(new FileInputStream("name.properties"));
            System.out.println(properties.getProperty("database.host"));
            System.out.println(properties.getProperty("database.username"));
            System.out.println(properties.getProperty("database.password"));
            System.out.println(properties.getProperty("database.db_name"));
            System.out.println(properties.getProperty("name.first"));
            System.out.println(properties.getProperty("name.last"));
        }catch(FileNotFoundException exception) {
            System.out.println("File tidak ditemukan");
        }catch (IOException exception) {
            System.out.println("Terjadi kesalahan dengan pesan " + exception.getMessage());
        }

        try{
            Properties properties = new Properties();
            properties.put("name.first", "Abdurahman");
            properties.put("name.last", "Rizal");
            properties.store(new FileOutputStream("name.properties"), "Konfigurasi nama properties");
        }catch (FileNotFoundException exception) {
            System.out.println("File tidak ditemukan");
        } catch (IOException e) {
            System.out.println("File tidak dapat disimpan");
        }
    }
}
