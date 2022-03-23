package Data;

public class LaptopApp {
    public static void main(String[] args) {
        System.out.println("+++++++++++++++");
        System.out.println("  LaptopApp  ");
        System.out.println("+++++++++++++++");
        Laptop lepi1 = new Laptop();
        System.out.println("\nNama                : "+lepi1.getNama());
        System.out.println("Brand                 : "+lepi1.getBrand());
        System.out.println("Processor             : "+lepi1.getProcessor());
        System.out.println("Jumlah Core           : "+lepi1.getJumlahCore());
        System.out.println("OS                    : "+lepi1.getOS());
        System.out.println("RAM                   : "+lepi1.getRAM());
        System.out.println("Jenis Penyimpanan     : "+lepi1.getJenisPenyimpanan());
        System.out.println("Stok                  : "+lepi1.getStok()+"\n");

        Laptop laptop2 = new Laptop("Asus ROG Zephyrus Duo","Asus ROG","Intel Core i7-10875H",
                "6 Core","Windows 11","32GB","SSD SATA", 5);
        System.out.println(laptop2);
    }
}