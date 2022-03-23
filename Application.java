package Application;

import Data.*;

public class Application {
    public static void main(String[] args) {

        Asus asus = new Asus("Asus ROG Zephyrus Duo","Asus ROG","Intel Core i7-10875H",
                "6 Core","Windows 11","32GB","SSD SATA", 5);
        System.out.println("Spesifikasi Laptop Asus");
        System.out.println(asus);
        asus.getWarna();
        asus.getLayar();


        Lenovo lenovo = new Lenovo("Lenovo Yoga C930-9KID", "Lenovo", "Intel Core i7",
                "7", "Windows", "16 GB", "SSD SATA", -1);
        System.out.println("\nSpesifikasi Laptop Lenovo");
        System.out.println(lenovo);
        lenovo.getWarna();
        lenovo.getLayar();
    }
}