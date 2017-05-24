public class honda extends dealer {
public void tampilkan(){
     double stok =9;
     String garansi="No Warranty";
     String kategori="Honda Beat ";

    deler m = new deler();

     m.inputData("Beat Pop", "Hitam-putih", "Metic",1200000);
     m.tampilkandata();

      System.out.println("banyak nya stok:"+stok);
      System.out.println("Tipe garansi :"+garansi);
      System.out.println("Kategori Model :"+kategori);
    
}    
}