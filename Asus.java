package Data;

public class Asus extends Laptop {
    String warna, storefront;

    public Asus(String nama, String brand, String processor, String jumlahCore, String OS,
                String RAM, String jenisPenyimpanan, int stok){
        super(nama, brand, processor, jumlahCore, OS, RAM, jenisPenyimpanan, stok);
        getStorefront();
        Stok();
    }

    public void Stok(){
        if (stok <= 0) {
            stok = 0;
        }
    }

    public String getStorefront() {
        if (jenisPenyimpanan == "SSD M.2") {
            storefront = "Best";
        } else if(jenisPenyimpanan == "SSD SATA"){
            storefront = "Good";
        } else if(jenisPenyimpanan == "HDD"){
            storefront = "Middle";
        } else {
            storefront = "Unknown";
        }
        return storefront;
    }

    public String getWarna() {
        System.out.println("Warna            : Hitam");
        return warna;
    }

    public void getLayar(){
        System.out.println("Ukuran Layar     : 16 Inch");
    }

    public String toString(){
        return "Nama                         : "+nama
                +"\nBrand                    : "+brand
                +"\nProcessor                : "+processor
                +"\nJumlah Core              : "+jumlahCore
                +"\nOS                       : "+OS
                +"\nRAM                      : "+RAM
                +"\nStorage                  : "+jenisPenyimpanan
                +"\nStorefront               : "+storefront
                +"\nStok                     : "+stok;
    }
}

