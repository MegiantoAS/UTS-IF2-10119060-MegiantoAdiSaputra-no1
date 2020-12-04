/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119060.megiantoadisaputra;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class UTSIF210119060MegiantoAdiSaputra {

    /**
      @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program UTS NO 1
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Age objAge = new Age(Calendar.getInstance().get(Calendar.YEAR));
        
        System.out.print("Masukan Tahun Lahir Anda : ");
        objAge.setYearBirth(input.nextInt());
        System.out.println("");
        
        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun Lahir Anda : "+objAge.getYearBirth());
        System.out.println("Hari ini Tahun : "+objAge.getYearNow());
        System.out.println("Umur Kamu sampai hari ini adalah "+objAge.hitungUmur()+" tahun");
        System.out.println("Tandanya Kamu "+objAge.tandanyaKamu(objAge.hitungUmur()));
             
    }
    
}
