package pbo;

import java.util.Scanner;

public class MobilBeraksi {
   public static void main(String[] args) {
	//objek
	//Rental tal = new Rental("M. Raihan Al Farabi","Avanza","DD4419KF");

	//System.out.println(tal.displayInfo());
	//System.out.println(tal.displayInfo("05114423203"));
        
        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
        DetailMobil[] rtl = new DetailMobil[2];
        
        //perulangan
        for(int i=0; i<rtl.length; i++){
        System.out.print("Masukkan Nama Pelanggan "+(i+1)+": ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Nama Mobil "+(i+1)+": ");
        String mobil = scanner.nextLine();  
        System.out.print("Masukkan No Plat "+(i+1)+": ");
        String plat = scanner.nextLine();

        //objek
        rtl[i] = new DetailMobil(nama, mobil, plat);
        }
        
        //perulangan
        for(DetailMobil data: rtl){ 
            System.out.println("================");
            System.out.println("Data Rental");
            System.out.println(data.displayInfo());
            }
        } catch (Exception e) {
            System.out.println("Kesalahan"+e.getMessage());
        }
        } 
    }
