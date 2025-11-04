/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanuklmudah;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class LatihanUKLmudah {

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);  
        
//        soal 1 bagian 1
        
        System.out.println("Masukkan Berat(KG) : ");
        double berat = inputan.nextDouble();
        
        System.out.println("Masukkan Jarak Tujuan(KM) : ");
        double jarak = inputan.nextDouble();
        
        System.out.println("Masukkan Panjang(CM) : ");
        double panjang = inputan.nextDouble();
        
        System.out.println("Masukkan Lebar(CM) : ");
        double lebar = inputan.nextDouble();
        
        System.out.println("Masukkan Tinggi(CM) : ");
        double tinggi = inputan.nextDouble();        
        
        double Volume = panjang*lebar*tinggi;
        double biayaPerKG = (jarak <= 10) ? 4250:6000;
        double biaya = berat*biayaPerKG;
        
        if(Volume > 100){
        biaya += 50000;
        }
        
        System.out.println("Volume Barang yang dikirim: "+ Volume + "cm^3 " );
        System.out.println("Total Biaya Pengiriman : Rp."+biaya);
        
        System.out.println("");
        
//        soal 1 bagian 2
        
        double biaya1;
        if(biaya % 2 == 0){
            System.out.println("Total Biaya Pengiriman adalah Bilangan Genap");
        }else{
            System.out.println("Total Biaya Pengiriman adalah  Bilangan Ganjil");
        }

    }
}

