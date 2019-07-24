package tugas5_l_672018004_672018036;

public class Anjing extends Binatang{
    public String Nama;
    private int Kecepatan;
    public String ras;
    public String Jenis;
    public String Jenisnya;

    public Anjing(String nama, String ras, int jenisbinatang, int kecepatan) {
        switch(Jenis)
        {
            case "1" :
            Jenisnya="Anjing";
            break;
                
            case "2" :
            Jenisnya="Kucing";
            break;
                
            case "3" :
            Jenisnya="";
            break;
                
        }this.Kecepatan = Kecepatan;
        this.Ras = ras;
        this.Jenis = Jenis;
        this.Nama = nama;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    
    public int getKecepatan()
    {
        return Kecepatan;
    }
    
    public void setKecepatan(int Kecepatan)
    {
        this.Kecepatan = Kecepatan;
    }
    
    public String getJenis()
    {
        return Jenis;
    }
    
    public Anjing(String Nama,String ras,String Jenis,int Kecepatan)
    {
        switch(Jenis)
        {
            case "1" :
            Jenisnya="Anjing";
            break;
                
            case "2" :
            Jenisnya="Kucing";
            break;
                
            case "3" :
            Jenisnya="";
            break;
                
        }this.Kecepatan = Kecepatan;
        this.Ras = ras;
        this.Jenis = Jenis;
        this.Nama = Nama;
    }
    
    public void CetakKecepatan()
    {
        System.out.println(Jenisnya+" "+Nama+" adalah yang tercepat ("+Kecepatan+"mph)");
    }
    @Override
    public void CetakCepat()
    {        
        System.out.println(Jenisnya+"  "+Nama+" adalah yang tercepat ("+Kecepatan + " mph)");
    }
    public void CetakNama(int i)
    {
        System.out.println(i+". "+Nama);
    }
    
    public void Cetak(int i)
     {        
        System.out.println("DATA Binatang ke #"+i);
        System.out.println("Jenis Binatang : "+Jenisnya);
        System.out.println("Nama : "+Nama);
        System.out.println("Ras : "+Ras);
        System.out.println("Kecepatan : "+Kecepatan);
        System.out.println("");
    }
}
