package tugas5_l_672018004_672018036;

public class Binatang {
    protected String Nama;
    protected String Jenis;
    protected String Ras;
    protected int Berat;
    protected int Kecepatan;
    
    public String getJenis(){
        return Jenis;
    }
    
    public int getBerat(){
        return Berat;
    }
    
    public int getKecepatan(){
        return Kecepatan;
    }
    
    public void Cetak(int i)
    {
        System.out.println("Nama : "+Nama);
        System.out.println("Jenis Binatang : "+Jenis);
    }
    
    public void CetakNama(int i)
    {        
        System.out.println(i+". "+Nama);
    }
    
    public void CetakBerat()
    {
        System.out.println("binatang terberat");
    }
    
    public void CetakCepat()
    {
        System.out.println("binatang tercepat");
    }
}