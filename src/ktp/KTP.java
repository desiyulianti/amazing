/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class KTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama, alamat,kecamatan, desa, agama, pekerjaan, negara, kelamin,darah, status;
        String NIK, TTL, RTRW;
        System.out.println("DATA KARTU TANDA PENDUDUK");
        System.out.println("PROVINSI JAWA TIMUR");
        System.out.println("KABUPATEN NGANJUK");
       Scanner input = new Scanner (System.in);
       // data
       System.out.print("NIK :");
       NIK = input.nextLine();
       System.out.print("NAMA :");
       nama = input.nextLine();
       System.out.print("TEMPAT TANGGAL LAHIR :");
       TTL = input.nextLine();
       System.out.print("JENIS KELAMIN :");
       kelamin = input.nextLine();
       System.out.print("Gol.darah :");
       darah = input.nextLine();
       System.out.print("ALAMAT :");
       alamat = input.nextLine();
       System.out.print("RT/RW :");
       RTRW = input.nextLine();
       System.out.print("DESA :");
       desa = input.nextLine();
       System.out.print("KECAMATAN :");
       kecamatan = input.nextLine();
       System.out.print("AGAMA :");
       agama = input.nextLine();
       System.out.print("STATUS :");
       status = input.nextLine();
       System.out.print("PEKERJAAN :");
       pekerjaan = input.nextLine();
       System.out.print("WARGA NEGARA :");
       negara = input.nextLine();
      
       
    System.out.println("''''''''''");
    System.out.println("NIK:"+NIK);
    System.out.println("NAMA : "+nama );
    System.out.println("TEMPAT TANGGAL LAHIR : "+TTL);
    System.out.println("JENIS KELAMIN :"+kelamin+ " Gol.darah :"+ darah); 
    System.out.println("ALAMAT :"+alamat);
    System.out.println("RT/RW :"+RTRW);
    System.out.println("DESA :"+desa);
    System.out.println("KECAMATAN :"+kecamatan);
    System.out.println("AGAMA :"+agama);
    System.out.println("STATUS :"+status);
    System.out.println("PEKERJAAN :"+pekerjaan);
    System.out.println("WARGA NEGARA :"+negara);
    System.out.println("Berlaku hingga : SEUMUR HIDUP");
    
    
    
    
    
    
        
      
    }
    
}
