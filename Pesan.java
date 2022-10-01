package Tugas_Pertemuan5;


public class Pesan {
    String nama, customer;
    int qty,bayar,price,add_price,harga,kembalian;
    public Pesan(String nama, String customer, int qty, int bayar, int price, int add_price, int harga) {
        this.nama = nama;
        this.customer = customer;
        this.qty = qty;
        this.bayar = bayar;
        this.price = price;
        this.add_price = add_price;
        this.harga = harga;
        this.kembalian = kembalian;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public int getBayar() {
        return bayar;
    }
    public void setBayar(int bayar) {
        this.bayar = bayar;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getAdd_price() {
        return add_price;
    }
    public void setAdd_price(int add_price) {
        this.add_price = add_price;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getKembalian() {
        return kembalian;
    }
    public void setKembalian(int kembalian) {
        this.kembalian = kembalian;
    }

    //GENERATE alt + ins 
    
}
