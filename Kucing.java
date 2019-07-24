package tugas5_l_672018004_672018036;

public class Kucing extends Binatang{
   public String Ras;
    private int Berat;
    private String jenis;
    private String jns;
    private String nama;
        
    public String getJenis(){
        return jenis;
    }
    
    public int getBerat(){
        return Berat;
    }
        
    public Kucing(int Berat, String ras, String jenis, String nama){
        this.Berat = Berat;
        this.Ras = ras;
        this.jenis = jenis;
        this.nama = nama;
        switch (jenis) {
            case "1":
                jns = "Anjing";
                break;
            case "2":
                jns = "Kucing";
                break;
            default:
                jns = "";
                break;
        }
    }
    
    public void CetakNama(int i)
    {        
        System.out.println(i+". "+nama);
    }
    
    public void CetakBerat()
    {        
        System.out.println(jns+"  "+nama+" adalah yang terberat ("+Berat + " kg)");
    }
    
    public void Cetak(int i)
    {
        
        System.out.println("DATA Binatang ke #"+i);
        System.out.println("Jenis Binatang : "+jns);
        System.out.println("Nama : "+nama);
        System.out.println("Ras : "+Ras);
        System.out.println("Berat : "+Berat);
        System.out.println("");
    }
}