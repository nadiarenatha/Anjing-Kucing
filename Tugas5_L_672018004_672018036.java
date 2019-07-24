package tugas5_l_672018004_672018036;

import java.util.Scanner;

public class Tugas5_L_672018004_672018036 {
public static void main(String[] args) {
        int jumlahbinatang,namabinatang;
        int kecepatan,Berat;
        Anjing ajng;
        Kucing kcng;
        
        Binatang a[];
        
        String jenis,jenisbinatang;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan JumSlah Binatang : ");
        int coef;
        coef = scan.nextInt();
        a = new Binatang[coef];
        String masukan,nama,ras;
        for(int b=1;b<=coef;b++)
        {
            System.out.println("Binatang #"+b);
            System.out.println("1.Anjing");
            System.out.println("2.Kucing");
            System.out.print("Jenis Binatang : ");
            jenisbinatang = scan.next();
            
            if(jenisbinatang.equals("1"))
            {
                System.out.print("Masukkan nama : ");
                nama = scan.next();
                System.out.print("Masukan ras : ");
                ras = scan.next();
                System.out.print("Masukan kecepatan : ");
                kecepatan = scan.nextInt();
                ajng = new Anjing(nama,ras,jenisbinatang,kecepatan);
                a[b-1] = ajng;
            }else if(jenisbinatang.equals("2"))
            {
                System.out.print("Masukkan nama : ");
                nama = scan.next();
                System.out.print("Masukan ras : ");
                ras = scan.next();
                System.out.print("Masukan berat : ");
                Berat = scan.nextInt();
                kcng = new Kucing(Berat,ras,jenisbinatang,nama);
                a[b-1] = kcng;
            }else
            {
                System.out.println("Inputan Salah!");
                b--;
            }
        }
        
        int max = a[0].getBerat();
        String jn="",nm="",rs="";
        int max1 = a[0].getKecepatan();
        while (true)
        {
        Scanner inp = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("===== TUGAS PEMROGRAMAN =====");
        System.out.println("===== POLIMORFISME JAVA =====");
        System.out.println("1.Tampilkan semua nama binatang");
        System.out.println("2.Tampilkan semua data binatang");
        System.out.println("3.Tampilkan binatang terberat");
        System.out.println("4.Tampilkan binatang tercepat");
        System.out.println("5.Exit");
        System.out.print("Pilihan = ");
        int pilihan = inp.nextInt();
    
        if(pilihan == 1){
                System.out.println("");  
                System.out.println("==== Menu 1 : Semua Nama Binatang ====");
                System.out.println("");  
                for(int j=0;j<a.length;j++){   
                    a[j].CetakNama(j+1);
                }
            }else if(pilihan==2){
                System.out.println("");  
                System.out.println("==== Menu 2 : Semua DATA Binatang ====");
                System.out.println("");  
                for(int j=0;j<a.length;j++){
                    a[j].Cetak(j+1);
                }     
        }else if(pilihan==3){
                max = 0;
                System.out.println("");  
                System.out.println("==== Menu 3 : DATA Binatang Terberat ====");
                Binatang k = new Binatang();
                for(int s=0;s<a.length;s++){                     
                    if(a[s].getJenis().equals("2")){                        
                        if(a[s].getBerat() > max){                            
                            max = a[s].getBerat();       
                            k = a[s];
                        }                            
                    }
                }                
                k.CetakBerat();
        }else if(pilihan==4){
                max = 0;
                System.out.println("");  
                System.out.println("==== Menu 4 : DATA Binatang Tercepat ====");
                
                Binatang k = new Binatang();
                for(int s=0;s<a.length;s++){                     
                    if(a[s].getJenis().equals("1")){
                        if(a[s].getKecepatan() > max){                            
                            max = a[s].getKecepatan();       
                            k = a[s];
                        }                            
                    }
                }                
                k.CetakCepat();
                                
            }else if(pilihan==5)
        {
            System.exit(0);
        }
        }
}

}
