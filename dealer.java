public class dealer
{
 private String merek;
 private String warna;
 private int harga;
 private String tipe;

    public String gettipe() {
        return tipe;
    }

    public void settipealat(String tipe) {
        this.tipe = tipe;
    }

    public int getharga() {
        return harga;
    }

    public void setharga (int harga) {
        this.harga = harga;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
 
    public void stok(){
       System.out.print("Banyaknya Stok Barang: ");
   }
   public void garansi(){
       System.out.print("Tipe Garansi Motor: ");
   }
    public void kategori(){
       System.out.print("Kategori Model: ");
   }
   
      
  
 public void tampilkandata(){
	        System.out.println("MREK MOTOR :"+getMerek());
        System.out.println("WARNA MOTOR :"+getWarna());
        System.out.println("HARGA :"+getharga());
        System.out.println("Tipe MOTOR :"+gettipe());
            
		 }

 public void inputData(String m,String w,String j,int jp){
     setMerek(m);
     setWarna(w);
     settipe(j);
     setharga(jp);
     
 }
}